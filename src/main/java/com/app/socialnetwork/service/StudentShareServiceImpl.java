package com.app.socialnetwork.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.socialnetwork.entity.StudentShare;
import com.app.socialnetwork.error.StudentShareNotFoundException;
import com.app.socialnetwork.repository.StudentShareRepository;

@Service
public class StudentShareServiceImpl implements StudentShareService {

	@Autowired
	private StudentShareRepository studentShareRepository;
	
	@Override
	public StudentShare saveShare(StudentShare studentShare) {
		return studentShareRepository.save(studentShare);
	}

	public StudentShare findStudentShareById(Long studentShareId) throws StudentShareNotFoundException {
		
		
		Optional<StudentShare> studentShare=studentShareRepository.findById(studentShareId);
		if(!studentShare.isPresent())
		{
			throw new StudentShareNotFoundException("Student Share not found");
		}
			return studentShare.get();
		}
	@Override
	public List<StudentShare> findAllStudentShare() {
		return studentShareRepository.findAll();
	}

	@Override
	public void deleteStudentShareById(Long studentShareId) throws StudentShareNotFoundException{
		
		Optional<StudentShare> studentShare=studentShareRepository.findById(studentShareId);
		if(!studentShare.isPresent())
		{
			throw new StudentShareNotFoundException("Student Share not found");
		}
		else {
			studentShareRepository.deleteById(studentShareId);

		}
	}

	@Override
	public StudentShare fetchStudentShareByName(String studentShareName) {
        return studentShareRepository.findByStudentShareNameIgnoreCase(studentShareName);

	}

	@Override
	public StudentShare updateStudentShare(Long studentShareId, StudentShare studentShare)throws StudentShareNotFoundException {
		Optional<StudentShare> studentShare1=studentShareRepository.findById(studentShareId);
		if(!studentShare1.isPresent())
		{
			throw new StudentShareNotFoundException("Student Share not found");
		}  
		
		
		StudentShare shareDB = studentShareRepository.findById(studentShareId).get();

	        if (Objects.nonNull(studentShare.getStudentShareName())
	                && !"".equalsIgnoreCase(studentShare.getStudentShareName())) {
	        	shareDB.setStudentShareName(studentShare.getStudentShareName());
	        }

	        if (Objects.nonNull(studentShare.getStudentSharedesc())
	                && !"".equalsIgnoreCase(studentShare.getStudentSharedesc())) {
	           shareDB.setStudentSharedesc(studentShare.getStudentSharedesc());
	        }

	        if (Objects.nonNull(studentShare.getStudentSharePost())
	                && !"".equalsIgnoreCase(studentShare.getStudentSharePost())) {
	            shareDB.setStudentSharePost(studentShare.getStudentSharePost());
	        }
	        
	      
	        return studentShareRepository.save(shareDB);
	}

	
}
