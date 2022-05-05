package com.elearn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	private String name;
	private String teacherEmail;
	private String teacherPhone;
	  
	
	
	public Teacher() {
		super();
	}

 


	public Teacher(int teacherId, String name, String teacherEmail, String teacherPhone) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.teacherEmail = teacherEmail;
		this.teacherPhone = teacherPhone;
	}




	public int getTeacherId() {
		return teacherId;
	}




	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getTeacherEmail() {
		return teacherEmail;
	}




	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}




	public String getTeacherPhone() {
		return teacherPhone;
	}




	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}




	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", teacherEmail=" + teacherEmail
				+ ", teacherPhone=" + teacherPhone + "]";
	}
	
	
	 
	
}
