package com.elearn.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.elearn.model.Course;
import com.elearn.model.Student;
import com.elearn.model.Topic;
import com.elearn.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
 
	
	
	@GetMapping("/viewcourses")
	public List<Course> viewCourses()
	{
		return this.studentService.viewCourses();
	}
	
	
	@GetMapping("/searchCourse/{id}")
	public Course searchCourse(@PathVariable(name = "id") int courseId) 
	{
		return this.studentService.searchCourse(courseId);
		 
	}
	
	
	
	
	@GetMapping("/viewtopics/{id}")
	public List<Topic> viewTopics(@PathVariable(name = "id") int courseId) 
	{
		 
		
		return  this.studentService.viewTopics(courseId); 
	}
	
	
	@GetMapping("/viewProfile/{id}")
	public Student viewProfile(@PathVariable(name = "id")  int studentId,@PathVariable(name = "name")  String name) 
	{
		return this.studentService.viewProfile(studentId, name);
	}
	
	
	
	@GetMapping("/raisequery")
	public void raiseQuery(int studentid,String query) 
	{
	
		this.studentService.raiseQuery(studentid, query);
		
	}
	
	
	 
	
}
