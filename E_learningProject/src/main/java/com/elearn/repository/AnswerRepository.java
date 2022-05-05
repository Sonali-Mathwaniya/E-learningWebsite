package com.elearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearn.model.AnswerQuery;

public interface AnswerRepository extends JpaRepository<AnswerQuery, Integer> {

}
