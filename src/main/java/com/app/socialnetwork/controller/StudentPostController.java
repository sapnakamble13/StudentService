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

import com.app.socialnetwork.entity.Post;
import com.app.socialnetwork.error.StudentPostNotFoundException;
import com.app.socialnetwork.service.StudentPostService;


@RestController
@RequestMapping("api/v2")
public class StudentPostController {
	
	@Autowired
	private StudentPostService studentPostService;
	private static final Logger logger = LoggerFactory.getLogger(StudentPostController.class);

	@PostMapping("/posts/")
	public Post savePost(@RequestBody Post post)
	{
	    logger.info("Inside save method");
		return studentPostService.savePost(post);
	}
	
	@GetMapping("/posts/{id}")
	public Post findStudentPostById(@PathVariable("id") Long postId) throws StudentPostNotFoundException
	{
	    logger.info("Inside findStudentById method");
		return studentPostService.findStudentPostById(postId);
			
	}
	
	@GetMapping("/posts/allStudentPost/")
	public List<Post> findAllStudentPost()
	{
	    logger.info("Inside findAllStudent method");
		return studentPostService.findAllStudentPost();
	}
	
	@DeleteMapping("/posts/{id}")
	public String deleteStudentPostById(@PathVariable("id") Long studPostId)throws StudentPostNotFoundException
	{
		studentPostService.deleteStudentPostById(studPostId);
		return "Student Deleted Successfully";
	}
	@PutMapping("/posts/{id}")
	public Post updateStudentPost(@PathVariable("id") Long studPostId,@RequestBody Post post)throws StudentPostNotFoundException
	{
		return studentPostService.updateStudentPost(studPostId,post);
		
	}
	
	

}
