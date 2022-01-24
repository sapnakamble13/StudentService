package com.app.socialnetwork;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.socialnetwork.entity.Student;
import com.app.socialnetwork.repository.StudentRepository;  


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentServiceApplicationTests {
@Autowired
StudentRepository studRepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreateStudent() {
		Student s=new Student();
		s.setStudentAddress("abc");
		s.setStudentEmail("sapnakamble@gmail.com");
		s.setStudentId(1L);
		s.setStudentName("sapna");
		s.setStudentPhoneNo(11L);
		s.setStudentUsername("user");
		s.setStudentPassword("pass");

		studRepo.save(s);
		assertNotNull(studRepo.findById(1L).get());
	}
	@Test
	public void testAllStudent() {
		List<Student> allStud=studRepo.findAll();
		
		assertThat(allStud).size().isGreaterThan(1);
	}
	
	
	
	
	
	
	
}
