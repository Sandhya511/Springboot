package com.twitter.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private int twId ;
	public int getTwId() {
		return twId;
	}
	public void setTwId(int twId) {
		this.twId = twId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String name ;
	private String email ;
	

}
