package com.yamget.SMS_V3.RegistrationMgt;

import java.util.List;

public interface RegistrationService {

	public List<Long> getStudentsPerClassDetailByAcademicYear(long cl_id, long cd_id, int academic_year);
	public List<Long> getStudentsPerClassByAcademicYear(long cl_id, int academic_year);
	public List<Long> getStudentsByAcademicYear(int academic_year);
	public List<Long> getInactiveStudentsByAcademicYear(int academic_year);
	public List<Object> getStudentNumPerClassByAcademicYear(int academic_year);
}
