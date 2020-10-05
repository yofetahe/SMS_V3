package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

public interface CSEService {

	// **** Class Type ****//
	public List<ClassType> getClassList();

	public List<ClassType> getActiveClassList();

	public ClassType getClassById(long cl_id);

	public long addClass(ClassType classType);

	public ClassType updateClass(ClassType classType);
	
	public List<ClassType> getClassListOtherThanCurrentClass(int cl_id);

	// **** Class Detail ****//
	public List<ClassDetail> getClassDetailList();	

	public ClassDetail getClassDetailById(long classDetailId);
	
	public long addClassDetail(ClassDetail classDetail);

	public ClassDetail updateClassDetail(ClassDetail classDetail);		

	// **** Subject Type ****//
	public List<SubjectType> getSubjectList();	

	public SubjectType getSubjectById(long subjectId);
	
	public long addSubjectType(SubjectType subjectType);

	public SubjectType updateSubjectType(SubjectType subjectType);	

	// **** Exam Type ****//
	public List<ExamType> getExamTypeList();	

	public ExamType getExamTypeId(long examTypeId);
	
	public long addExamType(ExamType examType);

	public ExamType updateExamType(ExamType examType);

	// **** Exam Grading Type ****//
	public List<ExamGrade> getExamGradeList();	

	public ExamGrade getExamGradeId(long examGradeId);
	
	public long addExamGrade(ExamGrade examGrade);

	public ExamGrade updateExamGrade(ExamGrade examGrade);

	// **** Class & ClassDetail relation ****//
	public List<ClassDetail> getRelatedClassDetailsByClassId(long cl_id);

	public List<ClassDetail> getUnrelatedClassDetailsByClassId(long cl_id);
	
	public Class_ClassDetail_Rel getClassClassDetailRelById(long clcd_id);
	
	public long addClassAndClassDetailRel(Class_ClassDetail_Rel classClassDetailRel);
	
	public Class_ClassDetail_Rel updateClassAndClassDetailRel(Class_ClassDetail_Rel classClassDetailRel);

	// **** Class & Subject relation ****//
	public List<SubjectType> getRelatedSubjectByClassId(long cl_id);
	
	public List<SubjectType> getUnrelatedSubjectByClassId(long cl_id);
	
	public Class_Subject_Rel getClassSubjectRelById(long cl_sub_id);
	
	public long addClassAndSubjectRel(Class_Subject_Rel classSubjectRel);
	
	public Class_Subject_Rel updateClassAndSubjectRel(Class_Subject_Rel classSubjectRel);

	// **** Class-Subject-Rel & Exam relation ****//
	public List<ExamType> getRelatedExamTypeByClIdSubId(long cl_id, long sub_id);
	
	public List<ExamType> getUnrelatedExamTypeByClIdSubId(long cl_id, long sub_id);
	
	public Class_Subject_Exam_Rel getClassSubjectExamTypeRelById(long cse_id);
	
	public long addClassSubjectExamTypeRel(Class_Subject_Exam_Rel classSubjectExamRel);
	
	public Class_Subject_Exam_Rel updateClassSubjectExamTypeRel(Class_Subject_Exam_Rel classSubjectExamRel);

	// **** Class-Subject-Rel & Grading relation ****//
	public List<ExamGrade> getRelatedExamGradingByClIdSubId(long cl_id, long sub_id);

	public List<ExamGrade> getUnrelatedExamGradingByClIdSubId(long cl_id, long sub_id);
	
	public Class_Subject_ExamGrading_Rel getClassSubjectExamGradingRelById(long cseg_id);
	
	public long addClassSubjectExamGradingRel(Class_Subject_ExamGrading_Rel classSubjectExamGradingRel);
	
	public Class_Subject_ExamGrading_Rel updateClassSubjectExamGradingRel(Class_Subject_ExamGrading_Rel classSubjectExamGradingRel);
}
