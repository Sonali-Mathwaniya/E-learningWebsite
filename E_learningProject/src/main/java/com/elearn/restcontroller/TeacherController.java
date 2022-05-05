package com.elearn.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearn.model.AnswerQuery;
import com.elearn.model.Course;
import com.elearn.model.Query;
import com.elearn.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	
	
	
	@PostMapping("/addCourse")
	 public void addCourse(@RequestBody Course course)
	   {
	      
		 this.teacherService.addCourse(course);
		   
	    }
	 

	    @PutMapping("/updateCourse/{id}")
	    public void update(@RequestBody Course course,@PathVariable(name = "id") int courseId) {
	         
	    	this.teacherService.update(course, courseId);
	    	
	    	
	    }

	    
	    @DeleteMapping("/deleteCourse")
	    public void delete(@RequestBody Course course) 
	    {
	    	this.teacherService.delete(course);
	    	
	    }


	    @GetMapping("/getAllcourse")
	    public List<Course> getAll() {
	        return this.teacherService.getAll();
	    }

	    
	    
	
	    @GetMapping("/browsequerys")
	   public List<Query> browseQuerys()
    	{
		return this.teacherService.browseQuerys();
		
	    }
	
	
	    
	 @PostMapping("/replyQuery")   
	public void replyQuery(@PathVariable  int queryid,@RequestBody AnswerQuery answerQuery) 
	{ 
		 this.teacherService.replyQuery(queryid, answerQuery);
		
	}
	
	 	
	
}
