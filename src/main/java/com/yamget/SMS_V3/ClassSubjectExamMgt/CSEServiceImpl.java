package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CSEServiceImpl implements CSEService {
	
	@Autowired
	ClassTypeRepository classTypeRepository;
	@Autowired
	ClassDetailRepository classDetailRepository;
	@Autowired
	SubjectTypeRepository subjectTypeRespository;
	@Autowired
	ExamTypeRepository examTypeRespository;
	@Autowired
	ExamGradeRepository examGradeRepository;	
	@Autowired
	Class_ClassDetail_RelRepository classClassDetailRelRepository;
	@Autowired
	Class_Subject_RelRepository classSubjectRelRepository;
	@Autowired
	Class_Subject_Exam_RelRepository classSubjectExamRelRepository;
	@Autowired
	Class_Subject_ExamGrading_RelRepository classSubjectExamGradingRelRepository;
	
	//===== Class Type =====//
	
	@Override
	public List<ClassType> getClassList() {
		
		return (List<ClassType>) classTypeRepository.findAll();
	}
	
	@Override
	public List<ClassType> getActiveClassList() {
		
		return (List<ClassType>) classTypeRepository.getActiveClassList();
	}

	@Override
	public ClassType getClassById(long class_id) {
		
		return classTypeRepository.findById(class_id).get();
	}

	@Override
	public long addClass(ClassType classType) {
		
		return classTypeRepository.save(classType).getCl_id();
	}

	@Override
	public ClassType updateClass(ClassType classType) {
		
		return classTypeRepository.save(classType);
	}

	@Override
	public List<ClassType> getClassListOtherThanCurrentClass(int class_id) {
		
		return null;
	}
	
	//===== Class Detail =====//
	
	@Override
	public List<ClassDetail> getClassDetailList() {
		
		return (List<ClassDetail>) classDetailRepository.findAll();
	}
	
	@Override
	public ClassDetail getClassDetailById(long detail_id) {
		
		return classDetailRepository.findById(detail_id).get();
	}

	@Override
	public long addClassDetail(ClassDetail classDetail) { 
		
		return classDetailRepository.save(classDetail).getCd_id();
	}

	@Override
	public ClassDetail updateClassDetail(ClassDetail classDetail) {
		
		return classDetailRepository.save(classDetail);
	}

	//===== Subject Type =====//
	
	@Override
	public List<SubjectType> getSubjectList() {
		
		return (List<SubjectType>) subjectTypeRespository.findAll();
	}

	@Override
	public SubjectType getSubjectById(long subjectId) {
		
		return subjectTypeRespository.findById(subjectId).get();
	}

	@Override
	public long addSubjectType(SubjectType subjectType) {
		
		return subjectTypeRespository.save(subjectType).getSub_id();
	}

	@Override
	public SubjectType updateSubjectType(SubjectType subjectType) {
		
		return subjectTypeRespository.save(subjectType);
	}
	
	//===== Exam Type =====//
	
	@Override
	public List<ExamType> getExamTypeList() {
		
		return (List<ExamType>) examTypeRespository.findAll();
	}

	@Override
	public ExamType getExamTypeId(long examTypeId) {
		
		return examTypeRespository.findById(examTypeId).get();
	}

	@Override
	public long addExamType(ExamType examType) {
		
		return examTypeRespository.save(examType).getEt_id();
	}

	@Override
	public ExamType updateExamType(ExamType examType) {
		
		return examTypeRespository.save(examType);
	}
	
	//===== Exam Grading Type =====//
	
	@Override
	public List<ExamGrade> getExamGradeList() {
		
		return (List<ExamGrade>) examGradeRepository.findAll();
	}

	@Override
	public ExamGrade getExamGradeId(long examGradeId) {
		
		return examGradeRepository.findById(examGradeId).get();
	}

	@Override
	public long addExamGrade(ExamGrade examGrade) {
		
		return examGradeRepository.save(examGrade).getEg_id();
	}

	@Override
	public ExamGrade updateExamGrade(ExamGrade examGrade) {
		
		return examGradeRepository.save(examGrade);
	}
	
	//===== Class & ClassDetail relation =====//
	
	@Override
	public List<ClassDetail> getRelatedClassDetailsByClassId(long class_id) {
		
		return classClassDetailRelRepository.getClassDetailByClassId(class_id);
	}

	@Override
	public List<ClassDetail> getUnrelatedClassDetailsByClassId(long class_id) {
		
		return classClassDetailRelRepository.getUnrelatedClassDetailByClassId(class_id);
	}

	@Override
	public Class_ClassDetail_Rel getClassClassDetailRelById(long clcd_id) {
		
		return classClassDetailRelRepository.findById(clcd_id).get();
	}
	
	@Override
	public long addClassAndClassDetailRel(Class_ClassDetail_Rel classClassDetailRel) {
		
		return classClassDetailRelRepository.save(classClassDetailRel).getClcd_id();
	}

	@Override
	public Class_ClassDetail_Rel updateClassAndClassDetailRel(Class_ClassDetail_Rel classClassDetailRel) {
		
		return classClassDetailRelRepository.save(classClassDetailRel);
	}
	
	//===== Class & Subject relation =====//
	
	@Override
	public List<SubjectType> getRelatedSubjectByClassId(long class_id) {
		
		return classSubjectRelRepository.getRelatedSubjectByClassId(class_id);
	}

	@Override
	public List<SubjectType> getUnrelatedSubjectByClassId(long class_id) {
		
		return classSubjectRelRepository.getUnrelatedSubjectByClassId(class_id);
	}

	@Override
	public Class_Subject_Rel getClassSubjectRelById(long cl_sub_id) {
		
		return classSubjectRelRepository.findById(cl_sub_id).get();
	}

	@Override
	public long addClassAndSubjectRel(Class_Subject_Rel classSubjectRel) {
		
		return classSubjectRelRepository.save(classSubjectRel).getCl_sub_id();
	}

	@Override
	public Class_Subject_Rel updateClassAndSubjectRel(Class_Subject_Rel classSubjectRel) {
		
		return classSubjectRelRepository.save(classSubjectRel);
	}

	//===== Class-Subject-Rel & Exam relation =====//
	
	@Override
	public List<ExamType> getRelatedExamTypeByClIdSubId(long cl_id, long sub_id) {
		
		return classSubjectExamRelRepository.getRelatedExamTypeByClIdSubId(cl_id, sub_id);
	}

	@Override
	public List<ExamType> getUnrelatedExamTypeByClIdSubId(long cl_id, long sub_id) {
		
		return classSubjectExamRelRepository.getUnrelatedExamTypeByClIdSubId(cl_id, sub_id);
	}

	@Override
	public Class_Subject_Exam_Rel getClassSubjectExamTypeRelById(long cse_id) {
		
		return classSubjectExamRelRepository.findById(cse_id).get();
	}

	@Override
	public long addClassSubjectExamTypeRel(Class_Subject_Exam_Rel classSubjectExamRel) {
		
		return classSubjectExamRelRepository.save(classSubjectExamRel).getCse_id();
	}

	@Override
	public Class_Subject_Exam_Rel updateClassSubjectExamTypeRel(Class_Subject_Exam_Rel classSubjectExamRel) {
		
		return classSubjectExamRelRepository.save(classSubjectExamRel);
	}

	//===== Class-Subject-Exam-Rel & Grading relation =====//
	
	@Override
	public List<ExamGrade> getRelatedExamGradingByClIdSubId(long cl_id, long sub_id) {
		
		return classSubjectExamGradingRelRepository.getRelatedExamGradingByClIdSubId(cl_id, sub_id);
	}

	@Override
	public List<ExamGrade> getUnrelatedExamGradingByClIdSubId(long cl_id, long sub_id) {
		
		return classSubjectExamGradingRelRepository.getUnrelatedExamGradingByClIdSubId(cl_id, sub_id);
	}

	@Override
	public Class_Subject_ExamGrading_Rel getClassSubjectExamGradingRelById(long cseg_id) {
		
		return classSubjectExamGradingRelRepository.findById(cseg_id).get();
	}

	@Override
	public long addClassSubjectExamGradingRel(Class_Subject_ExamGrading_Rel classSubjectExamGradingRel) {
		
		return classSubjectExamGradingRelRepository.save(classSubjectExamGradingRel).getCseg_id();
	}

	@Override
	public Class_Subject_ExamGrading_Rel updateClassSubjectExamGradingRel(
			Class_Subject_ExamGrading_Rel classSubjectExamGradingRel) {
		
		return classSubjectExamGradingRelRepository.save(classSubjectExamGradingRel);
	}

}
