package com.elearn.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Query {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int queryId;
	private String queryname;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id_answer")
	 private AnswerQuery answerQuery;
 
	 @JoinColumn(name = "id_student") 
	 private Student student;
	 
	 
	public Query() {
		super();
	}
 
	 

	public Query(int queryId, String queryname, AnswerQuery answerQuery, Student student) {
		super();
		this.queryId = queryId;
		this.queryname = queryname;
		this.answerQuery = answerQuery;
		this.student = student;
	}

 
	public int getQueryId() {
		return queryId;
	}

	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}

	public String getQueryname() {
		return queryname;
	}

	public void setQueryname(String queryname) {
		this.queryname = queryname;
	}

	 
	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	@Override
	public String toString() {
		return "Query [queryId=" + queryId + ", queryname=" + queryname + ", answerQuery=" + answerQuery + "]";
	}

	 
	 
	 	
}
