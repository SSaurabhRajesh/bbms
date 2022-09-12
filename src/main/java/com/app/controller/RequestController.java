package com.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.ResourceNotFoundException;
import com.app.model.Request;
import com.app.repository.RequestRepository;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class RequestController {

	@Autowired
	private RequestRepository requestRepository;
	
	//get all request
	@GetMapping("/request")
	public List<Request> getAllRequests() {
		return requestRepository.findAll();
	}
	
	// create request rest api
		@PostMapping("/request")
		public Request createRequest(@RequestBody Request request) {
			return requestRepository.save(request);
		}
		
		// get request by id rest api
		@GetMapping("/request/{id}")
		public ResponseEntity<Request> getRequestById(@PathVariable Long id) {
			Request req = requestRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("User Not Exist with Id=" + id));
			return ResponseEntity.ok(req);
		}
		
		//update request rest api
				@PutMapping("/request/{id}")
				public ResponseEntity<Request> updateRequest(@PathVariable Long id, @RequestBody Request request){
					Request req = requestRepository.findById(id)
							.orElseThrow(() -> new ResourceNotFoundException("User Not Exist with Id=" + id));
					req.setQuantity(request.getQuantity());
					req.setBloodgroup(request.getBloodgroup());
					req.setPatientName(request.getPatientName());
					Request updateRequest=requestRepository.save(req);
					return ResponseEntity.ok(updateRequest);
				}
				
				//delete request rest api
				@DeleteMapping("/request/{id}")
				public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Long id){
					Request req=requestRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User Not Exist with Id="+id));
					
					requestRepository.delete(req);
					Map<String, Boolean> response=new HashMap<>();
					response.put("deleted", Boolean.TRUE);
					return ResponseEntity.ok(response);
				}
}
