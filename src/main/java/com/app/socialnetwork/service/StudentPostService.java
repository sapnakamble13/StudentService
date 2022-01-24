package com.app.socialnetwork.service;

import java.util.List;

import com.app.socialnetwork.entity.Post;
import com.app.socialnetwork.error.StudentPostNotFoundException;

public interface StudentPostService {

	public Post savePost(Post post);

	public List<Post> findAllStudentPost();

	public void deleteStudentPostById(Long studPostId)throws StudentPostNotFoundException;

	public Post updateStudentPost(Long studPostId, Post post) throws StudentPostNotFoundException;

	public Post findStudentPostById(Long postId) throws StudentPostNotFoundException;

}
