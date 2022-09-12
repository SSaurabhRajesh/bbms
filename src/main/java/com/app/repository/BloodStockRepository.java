package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.BloodStock;

@Repository
public interface BloodStockRepository extends JpaRepository<BloodStock, String>{
	
}
