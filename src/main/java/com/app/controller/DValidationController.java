package com.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
import com.app.model.DValidation;
import com.app.model.Request;
import com.app.model.User;
import com.app.repository.DValidationRepository;
import com.app.repository.RequestRepository;
import com.app.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class DValidationController {
	

	@Autowired
	private DValidationRepository dvalidationRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	//get all validation
		@GetMapping("/dvalidation")
		public List<DValidation> getAllDValidation() {
			return dvalidationRepository.findAll();
		}
		
		// create validation rest api
			@PostMapping("/dvalidation/{id}")
			public DValidation createDValidation(@RequestBody DValidation dvalidation,@PathVariable Long id) {
				return dvalidationRepository.save(dvalidation);
			}
			
			// get request by id rest api
			@GetMapping("/dvalidation/{id}")
			public ResponseEntity<DValidation> getRequestById(@PathVariable Long id) {
				DValidation dval = dvalidationRepository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundException("User Not Exist with Id=" + id));
				return ResponseEntity.ok(dval);
			}
			
			//update request rest api
					@PutMapping("/dvalidation/{id}")
					public ResponseEntity<DValidation> updateDValidation(@PathVariable Long id, @RequestBody DValidation dvalidation){
						DValidation dval = dvalidationRepository.findById(id)
								.orElseThrow(() -> new ResourceNotFoundException("User Not Exist with Id=" + id));
						dval.setQ1(dvalidation.isQ1());
						dval.setQ2(dvalidation.isQ2());
						dval.setQ3(dvalidation.getQ3());
						dval.setQ4(dvalidation.isQ4());
						dval.setQ5(dvalidation.isQ5());
						dval.setQ6(dvalidation.isQ6());
						dval.setQ7(dvalidation.isQ7());
						dval.setQ8(dvalidation.isQ8());
						dval.setQ9(dvalidation.isQ9());
						dval.setQ10(dvalidation.isQ10());
						dval.setQ11(dvalidation.getQ11());
						dval.setQ12(dvalidation.isQ12());
						dval.setQ13(dvalidation.isQ13());
						dval.setQ14(dvalidation.isQ14());
						dval.setQ15(dvalidation.isQ15());
						dval.setQ16(dvalidation.getQ16());
						dval.setQ17(dvalidation.isQ17());
						dval.setQ18(dvalidation.getQ18());
						dval.setQ19(dvalidation.getQ19());
						dval.setQ20(dvalidation.isQ20());
						dval.setQ21(dvalidation.isQ21());
						dval.setQ22(dvalidation.isQ22());
						DValidation updateddval=dvalidationRepository.save(dval);
						return ResponseEntity.ok(updateddval);
					}
					
					//delete request rest api
					@DeleteMapping("/dvalidation/{id}")
					public ResponseEntity<Map<String, Boolean>> deleteDValidation(@PathVariable Long id){
						DValidation dval=dvalidationRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User Not Exist with Id="+id));
						
						dvalidationRepository.delete(dval);
						Map<String, Boolean> response=new HashMap<>();
						response.put("deleted", Boolean.TRUE);
						return ResponseEntity.ok(response);
					}

}
