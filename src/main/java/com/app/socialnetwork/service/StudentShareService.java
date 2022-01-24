package com.app.socialnetwork.service;

import java.util.List;

import com.app.socialnetwork.entity.StudentShare;
import com.app.socialnetwork.error.StudentShareNotFoundException;


public interface StudentShareService {

	public StudentShare saveShare(StudentShare studentShare);

	public StudentShare findStudentShareById(Long studentShareId) throws StudentShareNotFoundException;

	public List<StudentShare> findAllStudentShare();

	public void deleteStudentShareById(Long studentShareId) throws StudentShareNotFoundException;

	public StudentShare fetchStudentShareByName(String studentShareName);

	public StudentShare updateStudentShare(Long studentShareId, StudentShare studentShare)throws StudentShareNotFoundException;

}
