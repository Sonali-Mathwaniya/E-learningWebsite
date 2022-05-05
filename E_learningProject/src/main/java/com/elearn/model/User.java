package com.elearn.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String userName;
	private String userEmail;
	private String designation;
	private String userPassword;
	private String userPhone;
	private LocalDate date; 
		
	public User() {
		super();
	}

 
 


	public User(String userName, String userEmail, String designation, String userPassword, String userPhone,
			LocalDate date) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.designation = designation;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.date = date;
	}





	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public String getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

 
	
	

	public int getUserid() {
		return userid;
	}





	public void setUserid(int userid) {
		this.userid = userid;
	}





	public LocalDate getDate() {
		return date;
	}





	public void setDate(LocalDate date) {
		this.date = date;
	}





	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", userEmail=" + userEmail + ", designation="
				+ designation + ", userPassword=" + userPassword + ", userPhone=" + userPhone + ", date=" + date + "]";
	}

 
	 
}
