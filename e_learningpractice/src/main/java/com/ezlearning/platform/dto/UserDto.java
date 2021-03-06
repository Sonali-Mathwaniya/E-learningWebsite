package com.ezlearning.platform.dto;
 


 
public class UserDto {
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
   
    
    
    public UserDto() {
		super();
	}



	public UserDto(String username, String password, String phoneNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "UserDto [username=" + username + ", password=" + password + ", phoneNumber=" + phoneNumber + ", email="
				+ email + "]";
	}



 
   
    
}
