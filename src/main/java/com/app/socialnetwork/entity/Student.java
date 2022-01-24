package com.app.socialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	@NotBlank(message= "Please add student name")
	private String studentName;
	@Email
	private String studentEmail;
	private Long studentPhoneNo;
	private String studentAddress;
	@NotBlank(message= "Please add username")
	private String studentUsername;
	@NotBlank(message= "Please add password")
	private String studentPassword;
	
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public Long getStudentPhoneNo() {
		return studentPhoneNo;
	}
	public void setStudentPhoneNo(Long studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentUsername() {
		return studentUsername;
	}
	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StudentEmail=" + studentEmail
				+ ", studentPhoneNo=" + studentPhoneNo + ", StudentAddress=" + studentAddress + ", StudentUsername="
				+ studentUsername + ", StudentPassword=" +studentPassword + "]";
	}
	public Student(Long studentId, String studentName, String studentEmail, Long studentPhoneNo, String studentAddress,
			String studentUsername, String studentPassword) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhoneNo = studentPhoneNo;
		this.studentAddress = studentAddress;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
	}
	public Student() {
		super();
	}
	
	
	
	

}
