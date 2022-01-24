package com.app.socialnetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.socialnetwork.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

	Student findByStudentId(Long studentId);
	Student findByStudentNameIgnoreCase(String studentName);
	
	

}
