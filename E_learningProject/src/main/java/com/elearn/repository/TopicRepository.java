package com.elearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearn.model.Topic;

public interface TopicRepository  extends JpaRepository<Topic, Integer>{

}
