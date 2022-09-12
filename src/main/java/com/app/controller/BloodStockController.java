package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.ResourceNotFoundException;
import com.app.model.BloodStock;
import com.app.repository.BloodStockRepository;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class BloodStockController {
	@Autowired
	private BloodStockRepository bloodStockRepository;
	
	//get All blood groups availability data
	@GetMapping("/bloodgroup")
	public List<BloodStock> getAllBloodStock(){
		return bloodStockRepository.findAll();
	}
	
	//get Blood group availability by id rest api
		@GetMapping("/bloodgroup/{bloodgrp}")
		public ResponseEntity<BloodStock> getBloodStockById(@PathVariable String bloodgrp) {
			BloodStock bl=bloodStockRepository.findById(bloodgrp).orElseThrow(()->new ResourceNotFoundException("User Not Exist with Id="+bloodgrp));
			return ResponseEntity.ok(bl);
		}
		
	@PutMapping("bloodgroup/{bloodgrp}/{qty}")
	public ResponseEntity<BloodStock> updateBloodStock(@PathVariable String bloodgrp,@PathVariable int qty){
		BloodStock bloodstock=bloodStockRepository.findById(bloodgrp).orElseThrow(()->new ResourceNotFoundException("User Not Exist with Id="+bloodgrp));
	bloodstock.setQuantity(bloodstock.getQuantity()-qty);
	BloodStock updatedStock=bloodStockRepository.save(bloodstock);
	return ResponseEntity.ok(updatedStock);
	}
}

