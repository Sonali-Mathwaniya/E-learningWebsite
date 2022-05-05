package com.elearn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private int courseEnrolled;
	
	 
	
	public Student() {
		super();
	}

 	public Student(int studentId, String studentName, int courseEnrolled) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseEnrolled = courseEnrolled;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(int courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseEnrolled=" + courseEnrolled
				+ "]";
	}
	
	
 
}
