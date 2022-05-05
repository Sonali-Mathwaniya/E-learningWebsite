package com.elearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearn.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String uname);
	
	User findByUserEmail(String email);
	
	
}
