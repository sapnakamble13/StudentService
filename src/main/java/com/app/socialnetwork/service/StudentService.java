package com.app.socialnetwork.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.socialnetwork.entity.Student;
import com.app.socialnetwork.error.StudentNotFoundException;

public interface StudentService {

	public Student saveStudent(Student student);
	public Student findStudentById(Long studentId) throws StudentNotFoundException;
	public List<Student> findAllStudent();
	public void deleteStudentById(Long studentId)throws StudentNotFoundException;
	public Student updateStudent(Long studentId, Student student)throws StudentNotFoundException;
	public Student fetchStudentByName(String studentName);

}
