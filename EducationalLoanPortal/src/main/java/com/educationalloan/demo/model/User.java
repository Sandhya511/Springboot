package com.educationalloan.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id 
	private int id ;
	private String email ;
	private String password ;
	private String username ;
	private String userRole ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
	
	

}
