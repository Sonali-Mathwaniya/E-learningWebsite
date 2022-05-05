package com.elearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearn.model.AnswerQuery;
import com.elearn.model.Course;
import com.elearn.model.Query;
import com.elearn.repository.AnswerRepository;
import com.elearn.repository.CourseRepository;
import com.elearn.repository.QueryRepository;
 

@Service
public class TeacherService {

	@Autowired
	private CourseRepository courseRepo;

	@Autowired
	private AnswerRepository answerRepository;	
	
	@Autowired
	private QueryRepository queryRepository;
	
	    public void addCourse(Course course)
	   {
	      
		 courseRepo.save(course);
		   
	    }
	 

	    public void update(Course course, int courseId) {
	        Course courseUpdate = courseRepo.findById(courseId).get();

	        courseUpdate.setCourseName(course.getCourseName());
	        courseUpdate.setCoursePrice(course.getCoursePrice());
	        courseUpdate.setTopics(course.getTopics());
	            

	            courseRepo.save(courseUpdate);

	    }

	    public void delete(Course course) 
	    {
	    	courseRepo.delete(course);
	    	
	    }


	    public List<Course> getAll() {
	        return courseRepo.findAll();
	    }

	
	public List<Query> browseQuerys()
	{
		return queryRepository.findAll();
		
	}
	
	
	public void replyQuery(int queryid, AnswerQuery answerQuery) 
	{ 
		AnswerQuery ansQueryUpdate = new AnswerQuery();
		
		ansQueryUpdate.setAnswerQueryName(answerQuery.getAnswerQueryName());
        Query query=queryRepository.getById(queryid);
		ansQueryUpdate.setQuery(query);		
		
		answerRepository.save(ansQueryUpdate);
 		
	}
	
}
