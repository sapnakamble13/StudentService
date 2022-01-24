package com.app.socialnetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.socialnetwork.entity.StudentShare;


@Repository
public interface StudentShareRepository extends JpaRepository<StudentShare,Long> {


	public StudentShare findByStudentShareNameIgnoreCase(String studentShareName);

}
