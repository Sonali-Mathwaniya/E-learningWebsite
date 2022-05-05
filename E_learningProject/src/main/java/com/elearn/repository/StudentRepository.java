package com.elearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearn.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findStudentByIdAndName(int studentId, String name);
	
}
