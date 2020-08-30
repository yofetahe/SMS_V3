package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CSEServiceImpl implements CSEService {
	
	@Autowired
	ClassTypeRepository csmRepository;

	@Override
	public List<ClassType> getActiveClassList() {
		
		return (List<ClassType>) csmRepository.findAll();
	}

	@Override
	public List<ClassType> getClassList() {
		
		return (List<ClassType>) csmRepository.findAll();
	}

	@Override
	public ClassType getClassById(String cl_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassDetail> getAllClassDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassDetail getClassDetailById(String cl_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectType> getRelatedSubjectByCl_id(int cl_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectType> getUnrelatedSubjectByCl_id(int cl_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamType> getRelatedExamTypeBySubCl_id(int subcl_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamGrade> getRelatedExamGradingBySubCl_id(int subcl_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassType> getClassListOtherThanCurrentClass(int cl_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassDetail> getFilteredClassDetailUnderSelectedClass(String cl_id, String cd_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addClass(ClassType classType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ClassType updateClass(ClassType classType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassDetail> getClassDetailsByClassId(String cl_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addClassDetail(ClassDetail classDetail) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ClassDetail updateClassDetail(ClassDetail classDetail) {
		// TODO Auto-generated method stub
		return null;
	}

}
