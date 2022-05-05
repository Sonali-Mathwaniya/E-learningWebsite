package com.elearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearn.model.Course;
import com.elearn.model.Query;
import com.elearn.model.Student;
import com.elearn.model.Topic;
import com.elearn.repository.CourseRepository;
import com.elearn.repository.QueryRepository;
import com.elearn.repository.StudentRepository;
import com.elearn.repository.TopicRepository;

@Service
public class StudentService {

	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private QueryRepository queryRepository;
	

	
	
	public List<Course> viewCourses()
	{
		return courseRepo.findAll();
		
	}
	
	
	public Course searchCourse(int courseId) 
	{
		return courseRepo.getById(courseId);
		 
	}
	
	
	
	public List<Topic> viewTopics(int courseId) 
	{
		Course  course = courseRepo.getById(courseId);
		 List<Topic> topics=course.getTopics();
		
		return  topics; 
	}
	
	
	
	public Student viewProfile(int studentId, String name) 
	{
		return studentRepository.findStudentByIdAndName(studentId, name);
	}
	
	
	
	
	 
	public void raiseQuery(int studentid,String query) 
	{
	Student	student=studentRepository.getById(studentid);
		
	Query queryupdate=new Query();
	queryupdate.setQueryname(query);
	queryupdate.setStudent(student);
	
	queryRepository.save(queryupdate);
	
		
	}
	
	
	/*
	public void joinCourse(int courseId) 
	{
		Course coursePurchase = courseRepo.findById(courseId).get();
		
		
		
	}
	
	
	public String payForCourse()
	{
		return 
		
		
	}
	*/
	
	
	
	
}
