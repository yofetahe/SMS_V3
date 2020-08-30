package com.yamget.SMS_V3.StudentProfileMgt;

import java.util.List;

import com.yamget.SMS_V3.RegistrationMgt.Registration;

public interface StudentService {

	public List<Student> getStudentNumPerClass(int academic_year);	
	public Student getStudentInformationById(long si_id);
	public List<Student> getAllNewCandidateStudents();
	public List<Student> getStudentsByStudentIds(List<Long> ids);
	public List<Student> getStudentsByStudentId(String publicId);
	public byte[] getStudentPhotoBySiid(long si_id);	
}
