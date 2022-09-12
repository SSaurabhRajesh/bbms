package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.DValidation;

public interface DValidationRepository extends JpaRepository<DValidation, Long> {
}
