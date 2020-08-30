package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

public interface CSEService {

	// **** Class Type ****//
	public List<ClassType> getClassList();

	public List<ClassType> getActiveClassList();

	public ClassType getClassById(String cl_id);

	public long addClass(ClassType classType);

	public ClassType updateClass(ClassType classType);

	// **** Class Detail ****//
	public List<ClassDetail> getAllClassDetail();

	public List<ClassDetail> getClassDetailsByClassId(String cl_id);

	public ClassDetail getClassDetailById(String classDetailId);
	
	public List<ClassDetail> getFilteredClassDetailUnderSelectedClass(String cl_id, String cd_id);

	public long addClassDetail(ClassDetail classDetail);

	public ClassDetail updateClassDetail(ClassDetail classDetail);
		

	// **** Subject Type ****//

	// **** Exam Type ****//

	// **** Exam Grading Type ****//

	// **** Class & ClassDetail relation ****//

	// **** Class & Subject relation ****//

	// **** Class-Subject-Rel & Exam relation ****//

	// **** Class-Subject-Rel & Grading relation ****//

	public List<SubjectType> getRelatedSubjectByCl_id(int cl_id);

	public List<SubjectType> getUnrelatedSubjectByCl_id(int cl_id);

	public List<ExamType> getRelatedExamTypeBySubCl_id(int subcl_id);

	public List<ExamGrade> getRelatedExamGradingBySubCl_id(int subcl_id);

	public List<ClassType> getClassListOtherThanCurrentClass(int cl_id);

}
