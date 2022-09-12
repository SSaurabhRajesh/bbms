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
import com.app.model.BloodTestLog;
import com.app.repository.BloodTestLogRepository;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class BloodTestLogController {
	@Autowired
	private BloodTestLogRepository bloodTestLogRepository;

	// get all Blood test log
	@GetMapping("/bloodtestlog")
	public List<BloodTestLog> getAllBloodTestLogs() {
		return bloodTestLogRepository.findAll();
	}

	// create bloodtestlog rest api
	@PostMapping("/bloodtestlog")
	public BloodTestLog createBloodTestLog(@RequestBody BloodTestLog bloodTestLog) {
		return bloodTestLogRepository.save(bloodTestLog);
	}

	// get bloodtestlog by id rest api
	@GetMapping("/bloodtestlog/{id}")
	public ResponseEntity<BloodTestLog> getUserById(@PathVariable Long id) {
		BloodTestLog btlog = bloodTestLogRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User Not Exist with Id=" + id));
		return ResponseEntity.ok(btlog);
	}
	
	//update bloodtestlog rest api
		@PutMapping("/bloodtestlog/{id}")
		public ResponseEntity<BloodTestLog> updateBloodTestLog(@PathVariable Long id, @RequestBody BloodTestLog bloodTestLogDetails){
			BloodTestLog btlog = bloodTestLogRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("User Not Exist with Id=" + id));
			btlog.setHepatitisB(bloodTestLogDetails.getHepatitisB());
			btlog.setHepatitisC(bloodTestLogDetails.getHepatitisC());
			btlog.setHiv(bloodTestLogDetails.getHiv());
			btlog.setMaleria(bloodTestLogDetails.getMaleria());
			btlog.setSyphilis(bloodTestLogDetails.getSyphilis());
			BloodTestLog updatedBloodTestLog=bloodTestLogRepository.save(btlog);
			return ResponseEntity.ok(updatedBloodTestLog);
		}
		
		//delete bloodtestlog rest api
		@DeleteMapping("/bloodtestlog/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Long id){
			BloodTestLog btl2=bloodTestLogRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User Not Exist with Id="+id));
			
			bloodTestLogRepository.delete(btl2);
			Map<String, Boolean> response=new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}

}
