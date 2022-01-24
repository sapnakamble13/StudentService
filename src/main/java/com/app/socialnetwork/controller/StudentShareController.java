package com.app.socialnetwork.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.socialnetwork.entity.StudentShare;
import com.app.socialnetwork.error.StudentShareNotFoundException;
import com.app.socialnetwork.service.StudentShareService;

@RestController
@RequestMapping("api/v3")
public class StudentShareController {
	@Autowired
	private StudentShareService studentShareService;
	private static final Logger logger = LoggerFactory.getLogger(StudentShareController.class);

	@PostMapping("/shares/")
	public StudentShare savePost(@RequestBody StudentShare studentShare)
	{
	    logger.info("Inside save method");
		return studentShareService.saveShare(studentShare);
	}
	
	@GetMapping("/shares/{id}")
	public StudentShare findStudentPostById(@PathVariable("id") Long studentShareId) throws StudentShareNotFoundException
	{
	    logger.info("Inside findStudentShareById method");
		return studentShareService.findStudentShareById(studentShareId);
			
	}
	
	@GetMapping("/shares/allStudentShare/")
	public List<StudentShare> findAllStudentPost()
	{
	    logger.info("Inside findAllStudentShare method");
		return studentShareService.findAllStudentShare();
	}
	
	@DeleteMapping("/shares/{id}")
	public String deleteStudentShareById(@PathVariable("id") Long studentShareId)throws StudentShareNotFoundException
	{
		studentShareService.deleteStudentShareById(studentShareId);
		return "Student share Deleted Successfully";
	}
	
	@PutMapping("/shares/{id}")
	public StudentShare updateStudentShare(@PathVariable("id") Long studentShareId,@RequestBody StudentShare studentShare)throws StudentShareNotFoundException
	{
		return studentShareService.updateStudentShare(studentShareId,studentShare);
		
	}
	
	  @GetMapping("/shares/name/{name}")
	  public StudentShare fetchStudentByName(@PathVariable("name") String studentShareName) {
	           return  studentShareService.fetchStudentShareByName(studentShareName);
	           
	           
	  }
		
	

}
