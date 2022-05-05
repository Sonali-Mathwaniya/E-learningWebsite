package com.elearn.model;

public class LoginUser {

	
	private String userEmail;
	private String userPassword;
	private String designation;
	
	
	 
	
	public LoginUser() {
		super();
	}

 


	public LoginUser(String userEmail, String userPassword, String designation) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.designation = designation;
	}




	public String getUserEmail() {
		return userEmail;
	}




	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}




	public String getUserPassword() {
		return userPassword;
	}




	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}




	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}




	@Override
	public String toString() {
		return "LoginUser [userEmail=" + userEmail + ", userPassword=" + userPassword + ", designation=" + designation
				+ "]";
	}
	
	 
}
