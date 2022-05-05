package com.elearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearn.model.Course;
 
public interface CourseRepository extends JpaRepository<Course, Integer> {

	Course findByCourseName(String courseName);
	 

}
