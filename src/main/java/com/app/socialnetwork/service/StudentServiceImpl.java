package com.app.socialnetwork.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.socialnetwork.entity.Student;
import com.app.socialnetwork.error.StudentNotFoundException;
import com.app.socialnetwork.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired	
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student findStudentById(Long studentId) throws StudentNotFoundException {
		
		
		//Student student =  studentRepository.findById(studentId).orElse(null);


		Optional<Student> student=studentRepository.findById(studentId);
		if(!student.isPresent())
		{
			throw new StudentNotFoundException("Student not found");
		}
			return student.get();
		}
	@Override
	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public void deleteStudentById(Long studentId)throws StudentNotFoundException {
		Optional<Student> student=studentRepository.findById(studentId);
		if(!student.isPresent())
		{
			throw new StudentNotFoundException("Student not found");
		}
		studentRepository.deleteById(studentId);
	}

	@Override
	public Student updateStudent(Long studentId, Student student) throws StudentNotFoundException {
		
		Optional<Student> student1=studentRepository.findById(studentId);
		if(!student1.isPresent())
		{
			throw new StudentNotFoundException("Student not found");
		}  
		     Student depDB = studentRepository.findById(studentId).get();

		        if (Objects.nonNull(student.getStudentName())
		                && !"".equalsIgnoreCase(student.getStudentName())) {
		            depDB.setStudentName(student.getStudentName());
		        }

		        if (Objects.nonNull(student.getStudentEmail())
		                && !"".equalsIgnoreCase(student.getStudentEmail())) {
		            depDB.setStudentEmail(student.getStudentEmail());
		        }

		        if (Objects.nonNull(student.getStudentAddress())
		                && !"".equalsIgnoreCase(student.getStudentAddress())) {
		            depDB.setStudentAddress(student.getStudentAddress());
		        }
		        
		        if (Objects.nonNull(student.getStudentPhoneNo())
		                && !(null==student.getStudentPhoneNo())) {
		            depDB.setStudentPhoneNo(student.getStudentPhoneNo());
		        }

		        if (Objects.nonNull(student.getStudentUsername())
		                && !"".equalsIgnoreCase(student.getStudentUsername())) {
		            depDB.setStudentUsername(student.getStudentUsername());
		        }

		        if (Objects.nonNull(student.getStudentPassword())
		                && !"".equalsIgnoreCase(student.getStudentPassword())) {
		            depDB.setStudentPassword(student.getStudentPassword());
		        }
		        return studentRepository.save(depDB);
		    }

	@Override
	public Student fetchStudentByName(String studentName) {
        return studentRepository.findByStudentNameIgnoreCase(studentName);
	}
	

}
