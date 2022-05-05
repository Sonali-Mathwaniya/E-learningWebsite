package com.elearn.model;
 

import javax.persistence.*;

 
import java.time.LocalDate;

 
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column( nullable = false, unique = true)
    private String username;
     
    
       
    
    
    private String email;
    private String password;
    
    private String phoneNumber;
     
      
    private LocalDate fecha;
 
    
    
	public User() {
		super();
	}




	public User(String username, String password, String phoneNumber, String email, LocalDate fecha) {
		super();
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.fecha = fecha;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
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




	public LocalDate getFecha() {
		return fecha;
	}




	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", fecha=" + fecha + "]";
	}

    
   
}
