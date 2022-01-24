package com.app.socialnetwork.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.socialnetwork.entity.Post;
import com.app.socialnetwork.error.StudentPostNotFoundException;
import com.app.socialnetwork.repository.StudentPostRepository;


@Service
public class StudentPostServiceImpl implements StudentPostService {

	@Autowired
	private StudentPostRepository studentPostRepository;
	
	@Override
	public Post savePost(Post post) {
		return studentPostRepository.save(post);
	}

	@Override
	public List<Post> findAllStudentPost() {
		return studentPostRepository.findAll();
	}
	@Override
	public void deleteStudentPostById(Long studPostId)throws StudentPostNotFoundException {
		Optional<Post> post=studentPostRepository.findById(studPostId);
		if(!post.isPresent())
		{
			throw new StudentPostNotFoundException("Student post not found");
		}
		
		studentPostRepository.deleteById(studPostId);
	}

	@Override
	public Post updateStudentPost(Long studPostId, Post post) throws StudentPostNotFoundException {
		Optional<Post> studentShare1=studentPostRepository.findById(studPostId);
		if(!studentShare1.isPresent())
		{
			throw new StudentPostNotFoundException("Student Post not found");
		} 
		
		 Post postDB = studentPostRepository.findById(studPostId).get();

	        if (Objects.nonNull(post.getStudPostDescription())
	                && !"".equalsIgnoreCase(post.getStudPostDescription())) {
	            postDB.setStudPostDescription(post.getStudPostDescription());
	        }
	        if (Objects.nonNull(post.getTitle())
	                && !(null==post.getTitle())) {
	            postDB.setTitle(post.getTitle());
	        }

	        if (Objects.nonNull(post.getStudentId())
	                && !(null==post.getStudentId())) {
	            postDB.setStudentId(post.getStudentId());
	        }

	        if (Objects.nonNull(post.getFacultyId())
	                && !(null==post.getFacultyId())) {
	           postDB.setFacultyId(post.getFacultyId());
	        }
	        
	    
	        return studentPostRepository.save(postDB);
	}



	public Post findStudentPostById(Long studPostId) throws StudentPostNotFoundException {
		
		Optional<Post> post=studentPostRepository.findById(studPostId);
		if(!post.isPresent())
		{
			throw new StudentPostNotFoundException("Student post not found");
		}
			return post.get();
		}




}
