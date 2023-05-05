package com.restapi.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RestApi {
	@Id
	private int studentId ;
	private String studentName ;
	private String courses ;
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
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	

}
