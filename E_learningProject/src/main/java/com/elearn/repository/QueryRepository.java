package com.elearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearn.model.Query;

public interface QueryRepository extends JpaRepository<Query, Integer> {

	Query findQueryByIdAndName(int queryid, String queryName);
	
}
