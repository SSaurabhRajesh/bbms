package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import com.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
	PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
	
	User findByUsername(String username);

	User findByEmailAndMobile(String email, long mobileno);

	
}
