package com.app.socialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class StudentShare {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentShareId;
	@NotBlank(message= "Please add student share name")
	private String studentShareName;
	private String studentSharedesc;
	@NotBlank(message= "Please add student share")
	private String studentSharePost;
	

	public Long getStudentShareId() {
		return studentShareId;
	}
	public void setStudentShareId(Long studentShareId) {
		this.studentShareId = studentShareId;
	}
	public String getStudentShareName() {
		return studentShareName;
	}
	public void setStudentShareName(String studentShareName) {
		this.studentShareName = studentShareName;
	}
	public String getStudentSharedesc() {
		return studentSharedesc;
	}
	public void setStudentSharedesc(String studentSharedesc) {
		this.studentSharedesc = studentSharedesc;
	}
	public String getStudentSharePost() {
		return studentSharePost;
	}
	public void setStudentSharePost(String studentSharePost) {
		this.studentSharePost = studentSharePost;
	}
	public StudentShare(Long studentshareId, String studentShareName, String studentSharedesc,
			String studentSharePost) {
		super();
		this.studentShareId = studentShareId;
		this.studentShareName = studentShareName;
		this.studentSharedesc = studentSharedesc;
		this.studentSharePost = studentSharePost;
	}
	public StudentShare() {
		super();
	}

}
