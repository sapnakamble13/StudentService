package com.app.socialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Post {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studPostId;
	private String studPostDescription;
	private String title;
	@NotBlank(message= "Please add studentId")
	private Long studentId;
	@NotBlank(message= "Please add facultyId")
	private Long facultyId;
	public Long getStudPostId() {
		return studPostId;
	}
	public void setStudPostId(Long studPostId) {
		this.studPostId = studPostId;
	}
	public String getStudPostDescription() {
		return studPostDescription;
	}
	public void setStudPostDescription(String studPostDescription) {
		this.studPostDescription = studPostDescription;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}
	public Post(Long studPostId, String studPostDescription, String title, Long studentId, Long facultyId) {
		super();
		this.studPostId = studPostId;
		this.studPostDescription = studPostDescription;
		this.title = title;
		this.studentId = studentId;
		this.facultyId = facultyId;
	}
	public Post() {
		super();
	}
	
	

}
