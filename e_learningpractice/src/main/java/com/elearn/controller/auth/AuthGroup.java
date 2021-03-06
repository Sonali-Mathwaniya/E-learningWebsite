package com.elearn.controller.auth;
 
import javax.persistence.*;
 
@Entity
@Table(name = "AUTH_USER_GROUP")
public class AuthGroup {
    @Id
    @Column(name = "AUTH_USER_GROUP_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "AUTH_GROUP")
    private String authgroup;
    
    
    public AuthGroup() {
		super();
	}

	public AuthGroup(String username, String authgroup) {
        this.username = username;
        this.authgroup = authgroup;
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

	public String getAuthgroup() {
		return authgroup;
	}

	public void setAuthgroup(String authgroup) {
		this.authgroup = authgroup;
	}

	@Override
	public String toString() {
		return "AuthGroup [id=" + id + ", username=" + username + ", authgroup=" + authgroup + "]";
	}
    
   
}
