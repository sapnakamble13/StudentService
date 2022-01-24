package com.app.socialnetwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.socialnetwork.entity.Student;
import com.app.socialnetwork.error.StudentNotFoundException;
import com.app.socialnetwork.service.StudentService;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api/v1")
public class StudentController {
	@Autowired
	private StudentService studentService;
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/students/")
	public Student saveStudent(@RequestBody Student student)
	{
	    logger.info("Inside save method");
		return studentService.saveStudent(student);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/students/{id}")
	public Student findStudentById(@PathVariable("id") Long studentId) throws StudentNotFoundException
	{
	    logger.info("Inside findStudentById method");
		return studentService.findStudentById(studentId);
			
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/students/allStudent/")
	public List<Student> findAllStudent()
	{
	    logger.info("Inside findAllStudent method");
		return studentService.findAllStudent();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable("id") Long studentId)throws StudentNotFoundException
	{
		studentService.deleteStudentById(studentId);
		return "Student Deleted Successfully";
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable("id") Long studentId,@RequestBody Student student)throws StudentNotFoundException
	{
		return studentService.updateStudent(studentId,student);
		
	}
	
	  @GetMapping("/students/name/{name}")
	  public Student fetchStudentByName(@PathVariable("name") String studentName) {
	           return  studentService.fetchStudentByName(studentName);
	           
	           
	  }
		
	
	
}
