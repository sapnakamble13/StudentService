package com.app.socialnetwork.repository;

import org.springframework.stereotype.Repository;

import com.app.socialnetwork.entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface StudentPostRepository extends JpaRepository<Post,Long> {


	

}
