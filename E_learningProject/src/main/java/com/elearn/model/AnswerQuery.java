package com.elearn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AnswerQuery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ansid;
	 private String answerQueryName;
	 
	 @OneToOne
	 private Query query;


	  
	 
	 public AnswerQuery() {
		super();
	}

 
	public AnswerQuery(int ansid, String answerQueryName, Query query) {
		super();
		this.ansid = ansid;
		this.answerQueryName = answerQueryName;
		this.query = query;
	}


	public int getAnsid() {
		return ansid;
	}


	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}


	public String getAnswerQueryName() {
		return answerQueryName;
	}


	public void setAnswerQueryName(String answerQueryName) {
		this.answerQueryName = answerQueryName;
	}


	public Query getQuery() {
		return query;
	}


	public void setQuery(Query query) {
		this.query = query;
	}


	@Override
	public String toString() {
		return "AnswerQuery [ansid=" + ansid + ", answerQueryName=" + answerQueryName + ", query=" + query + "]";
	}
	 
	  	
}
