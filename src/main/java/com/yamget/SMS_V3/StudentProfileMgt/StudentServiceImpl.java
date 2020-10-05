package com.yamget.SMS_V3.StudentProfileMgt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getStudentNumPerClass(int academic_year) {
		
		return studentRepository.getStudentNumPerClass(academic_year);
	}

	@Override
	public Student getStudentInformationById(long si_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllNewCandidateStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByStudentIds(List<Long> ids) {
		// TODO Auto-generated method stub
		return new ArrayList<Student>();
	}

	@Override
	public byte[] getStudentPhotoBySiid(long si_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByStudentId(String publicId) {
		// TODO Auto-generated method stub
		return null;
	}
}
