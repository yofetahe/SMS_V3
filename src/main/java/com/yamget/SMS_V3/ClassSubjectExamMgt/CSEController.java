package com.yamget.SMS_V3.ClassSubjectExamMgt;

import org.springframework.http.MediaType;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/csm")
@CrossOrigin
public class CSEController {
	
	@Autowired
	CSEService cseService;
	
	//**** Class Type ****//
	
	@GetMapping(value="/class", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClassType>> getClassList(){
	
		List<ClassType> class_list = cseService.getClassList();
				
		return new ResponseEntity<List<ClassType>>(class_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/class/active", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClassType>> getActiveClassList(){
	
		List<ClassType> class_list = this.getClassList().getBody()
				.stream()
				.filter(cl -> cl.getClass_status().equals("Active"))
				.collect(Collectors.toList());
						
		return new ResponseEntity<List<ClassType>>(class_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/class/{publicId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ClassType> getClassById(@PathVariable long publicId){
	
		ClassType class_list = cseService.getClassById(publicId);
				
		return new ResponseEntity<ClassType>(class_list, HttpStatus.OK);
	}
	
	@PostMapping(value="/class", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClassType>> addClass(@RequestBody ClassType classType, 
			BindingResult result, Errors errors){
		
		if (result.hasErrors()) {
			return null;
		}
		
		long classId = cseService.addClass(classType);
				
		return this.getClassList();
	}
	
	@PostMapping(value="/class/{publicId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClassType>> updateClass(@RequestBody ClassType classType, 
			BindingResult result, Errors errors){
		
		if (result.hasErrors()) {
			return null;
		}
		
		ClassType classValue = cseService.updateClass(classType);
				
		return this.getClassList();
	}

	//**** Class Detail ****//
	
	@GetMapping(value="/classDetails")
	public ResponseEntity<List<ClassDetail>> getClassDetailList(){
	
		List<ClassDetail> class_details = cseService.getClassDetailList();
				
		return new ResponseEntity<List<ClassDetail>>(class_details, HttpStatus.OK);
	}	
	
	@GetMapping(value="/classDetail/{classDetailId}")
	public ResponseEntity<ClassDetail> getClassDetailById(@PathVariable long classDetailId){
	
		ClassDetail class_list = cseService.getClassDetailById(classDetailId);
				
		return new ResponseEntity<ClassDetail>(class_list, HttpStatus.OK);
	}	

	@PostMapping(value="/classDetail")
	public ResponseEntity<List<ClassDetail>> addClassDetail(@RequestBody ClassDetail classDetail, BindingResult result, Errors errors){
		
		long classDetailId = cseService.addClassDetail(classDetail);
				
		return this.getClassDetailList();
	}
	
	@PostMapping(value="/classDetail/{classDetailId}")
	public ResponseEntity<List<ClassDetail>> updateClassDetail(@RequestBody ClassDetail classDetail, BindingResult result, Errors errors){
		
		ClassDetail classDetailVal = cseService.updateClassDetail(classDetail);
				
		return this.getClassDetailList();
	}
	
	//**** Subject Type ****//
	
	@GetMapping(value="/subjectType")
	public ResponseEntity<List<SubjectType>> getSubjectTypeList(){
	
		List<SubjectType> subjectTypeList = cseService.getSubjectList();
				
		return new ResponseEntity<List<SubjectType>>(subjectTypeList, HttpStatus.OK);
	}	
	
	@GetMapping(value="/subjectType/{subjectTypeId}")
	public ResponseEntity<SubjectType> getSubjectTypeById(@PathVariable long subjectTypeId){
	
		SubjectType subjectType = cseService.getSubjectById(subjectTypeId);
				
		return new ResponseEntity<SubjectType>(subjectType, HttpStatus.OK);
	}

	@PostMapping(value="/subjectType")
	public ResponseEntity<List<SubjectType>> addSubjectType(@RequestBody SubjectType subjectType, BindingResult result, Errors errors){
	
		long subjectTypeId = cseService.addSubjectType(subjectType);
				
		return this.getSubjectTypeList();
	}
	
	@PostMapping(value="/subjectType/{subjectTypeId}")
	public ResponseEntity<List<SubjectType>> updateSubjectType(@RequestBody SubjectType subjectType, BindingResult result, Errors errors){
	
		SubjectType subjectTypeVal = cseService.updateSubjectType(subjectType);
				
		return this.getSubjectTypeList();
	}
	
	//**** Exam Type ****//	

	@GetMapping(value="/examType")
	public ResponseEntity<List<ExamType>> getExamTypeList(){
	
		List<ExamType> examTypeList = cseService.getExamTypeList();
				
		return new ResponseEntity<List<ExamType>>(examTypeList, HttpStatus.OK);
	}	
	
	@GetMapping(value="/examType/{examTypeId}")
	public ResponseEntity<ExamType> getExamTypeById(@PathVariable long examTypeId){
	
		ExamType examType = cseService.getExamTypeId(examTypeId);
				
		return new ResponseEntity<ExamType>(examType, HttpStatus.OK);
	}

	@PostMapping(value="/examType")
	public ResponseEntity<List<ExamType>> addExamType(@RequestBody ExamType examType, BindingResult result, Errors errors){
	
		long examTypeId = cseService.addExamType(examType);
				
		return this.getExamTypeList();
	}
	
	@PostMapping(value="/examType/{examTypeId}")
	public ResponseEntity<List<ExamType>> updateExamType(@RequestBody ExamType examType, BindingResult result, Errors errors){
	
		ExamType examTypeVal = cseService.updateExamType(examType);
				
		return this.getExamTypeList();
	}
	
	//**** Exam Grading Type ****//

	@GetMapping(value="/examGrade")
	public ResponseEntity<List<ExamGrade>> getExamGradeList(){
	
		List<ExamGrade> examGradeList = cseService.getExamGradeList();
				
		return new ResponseEntity<List<ExamGrade>>(examGradeList, HttpStatus.OK);
	}	
	
	@GetMapping(value="/examGrade/{examGradeId}")
	public ResponseEntity<ExamGrade> getExamGradeById(@PathVariable long examGradeId){
	
		ExamGrade examGrade = cseService.getExamGradeId(examGradeId);
				
		return new ResponseEntity<ExamGrade>(examGrade, HttpStatus.OK);
	}

	@PostMapping(value="/examGrade")
	public ResponseEntity<List<ExamGrade>> addExamGrade(@RequestBody ExamGrade examGrade, BindingResult result, Errors errors){
	
		long examGradeId = cseService.addExamGrade(examGrade);
				
		return this.getExamGradeList();
	}
	
	@PostMapping(value="/examGrade/{examGradeId}")
	public ResponseEntity<List<ExamGrade>> updateExamGrade(@RequestBody ExamGrade examGrade, BindingResult result, Errors errors){
	
		ExamGrade examGradeVal = cseService.updateExamGrade(examGrade);
				
		return this.getExamGradeList();
	}
	
	//**** Class & ClassDetail relation ****//
	
	@GetMapping(value="/classClassDetails/related/{classId}")
	public ResponseEntity<List<ClassDetail>> getClassDetailByClassId(@PathVariable long classId){
	
		List<ClassDetail> class_list = cseService.getRelatedClassDetailsByClassId(classId);
				
		return new ResponseEntity<List<ClassDetail>>(class_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classClassDetails/unrelated/{classId}")
	public ResponseEntity<List<ClassDetail>> getUnrelatedClassDetailByClassId(@PathVariable long classId){
	
		List<ClassDetail> class_list = cseService.getUnrelatedClassDetailsByClassId(classId);
				
		return new ResponseEntity<List<ClassDetail>>(class_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classClassDetail/related/{classClassDetailId}")
	public ResponseEntity<Class_ClassDetail_Rel> getClassClassDetailRelById(@PathVariable long clCdId){
	
		Class_ClassDetail_Rel class_cldetail_rel = cseService.getClassClassDetailRelById(clCdId);
				
		return new ResponseEntity<Class_ClassDetail_Rel>(class_cldetail_rel, HttpStatus.OK);
	}
	
	@PostMapping(value="/classClassDetail")
	public ResponseEntity<List<ClassDetail>> addClassAndClassDetailRel(@RequestBody Class_ClassDetail_Rel class_clDetail_rel, BindingResult result, Errors errors){
	
		long classClassDetailId = cseService.addClassAndClassDetailRel(class_clDetail_rel);
				
		return this.getClassDetailByClassId(class_clDetail_rel.getCl_id());
	}
	
	@PostMapping(value="/classClassDetail/{classClassDetailId}")
	public ResponseEntity<List<ClassDetail>> updateClassAndClassDetailRel(@RequestBody Class_ClassDetail_Rel class_clDetail_rel, BindingResult result, Errors errors){
	
		Class_ClassDetail_Rel examGradeVal = cseService.updateClassAndClassDetailRel(class_clDetail_rel);
				
		return this.getClassDetailByClassId(class_clDetail_rel.getCl_id());
	}
	
	//**** Class & Subject relation ****//
	
	@GetMapping(value="/classSubjects/related/{classId}")
	public ResponseEntity<List<SubjectType>> getRelatedSubjectByClassId(@PathVariable long classId){
	
		List<SubjectType> subject_type_list = cseService.getRelatedSubjectByClassId(classId);
				
		return new ResponseEntity<List<SubjectType>>(subject_type_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classSubjects/unrelated/{classId}")
	public ResponseEntity<List<SubjectType>> getUnrelatedSubjectByClassId(@PathVariable long classId){
	
		List<SubjectType> subject_type_list = cseService.getUnrelatedSubjectByClassId(classId);
				
		return new ResponseEntity<List<SubjectType>>(subject_type_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classSubjects/related/{classSubjectId}")
	public ResponseEntity<Class_Subject_Rel> getClassSubjectRelById(@PathVariable long classSubjectId){
	
		Class_Subject_Rel class_sub_rel = cseService.getClassSubjectRelById(classSubjectId);
				
		return new ResponseEntity<Class_Subject_Rel>(class_sub_rel, HttpStatus.OK);
	}
	
	@PostMapping(value="/classSubject")
	public ResponseEntity<List<SubjectType>> addClassAndSubjectRel(@RequestBody Class_Subject_Rel class_subject_rel, BindingResult result, Errors errors){
	
		long classSubjectId = cseService.addClassAndSubjectRel(class_subject_rel);
				
		return this.getRelatedSubjectByClassId(class_subject_rel.getCl_id());
	}
	
	@PostMapping(value="/classSubjects/{examGradeId}")
	public ResponseEntity<List<SubjectType>> updateClassAndSubjectRel(@RequestBody Class_Subject_Rel class_subject_rel, BindingResult result, Errors errors){
	
		Class_Subject_Rel classSubjectVal = cseService.updateClassAndSubjectRel(class_subject_rel);
				
		return this.getRelatedSubjectByClassId(class_subject_rel.getCl_id());
	}
	
	//**** Class-Subject-Rel & Exam relation ****//
	
	@GetMapping(value="/classSubjectExams/related/{classId}/{subjectId}")
	public ResponseEntity<List<ExamType>> getRelatedExamTypeByClIdSubId(@PathVariable long classId, @PathVariable long subjectId){
	
		List<ExamType> exam_type_list = cseService.getRelatedExamTypeByClIdSubId(classId, subjectId);
				
		return new ResponseEntity<List<ExamType>>(exam_type_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classSubjectExams/unrelated/{classId}/{subjectId}")
	public ResponseEntity<List<ExamType>> getUnrelatedExamTypeByClIdSubId(@PathVariable long classId, @PathVariable long subjectId){
	
		List<ExamType> exam_type_list = cseService.getUnrelatedExamTypeByClIdSubId(classId, subjectId);
				
		return new ResponseEntity<List<ExamType>>(exam_type_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classSubjectExams/related/{classSubjectExamId}")
	public ResponseEntity<Class_Subject_Exam_Rel> getClassSubjectExamTypeRelById(@PathVariable long classSubjectExamId){
	
		Class_Subject_Exam_Rel class_sub_rel = cseService.getClassSubjectExamTypeRelById(classSubjectExamId);
				
		return new ResponseEntity<Class_Subject_Exam_Rel>(class_sub_rel, HttpStatus.OK);
	}
	
	@PostMapping(value="/classSubjectExam")
	public ResponseEntity<List<ExamType>> addClassSubjectExamTypeRel(@RequestBody Class_Subject_Exam_Rel class_subject_exam_rel, BindingResult result, Errors errors){
	
		long classSubjectId = cseService.addClassSubjectExamTypeRel(class_subject_exam_rel);
				
		return this.getRelatedExamTypeByClIdSubId(class_subject_exam_rel.getCl_id(), class_subject_exam_rel.getSub_id());
	}
	
	@PostMapping(value="/classSubjectExams/{examGradeId}")
	public ResponseEntity<List<ExamType>> updateClassSubjectExamTypeRel(@RequestBody Class_Subject_Exam_Rel class_subject_exam_rel, BindingResult result, Errors errors){
	
		Class_Subject_Exam_Rel classSubjectVal = cseService.updateClassSubjectExamTypeRel(class_subject_exam_rel);
				
		return this.getRelatedExamTypeByClIdSubId(class_subject_exam_rel.getCl_id(), class_subject_exam_rel.getSub_id());
	}
	
	//**** Class-Subject-Rel & Grading relation ****//
	
	@GetMapping(value="/classSubjectGradings/related/{classId}/{subjectId}")
	public ResponseEntity<List<ExamType>> getRelatedExamGradingByClIdSubIdExamId(@PathVariable long classId, @PathVariable long subjectId){
	
		List<ExamType> exam_type_list = cseService.getRelatedExamTypeByClIdSubId(classId, subjectId);
				
		return new ResponseEntity<List<ExamType>>(exam_type_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classSubjectGradings/unrelated/{classId}/{subjectId}")
	public ResponseEntity<List<ExamType>> getUnrelatedExamGradingByClIdSubIdExamId(@PathVariable long classId, @PathVariable long subjectId){
	
		List<ExamType> exam_type_list = cseService.getUnrelatedExamTypeByClIdSubId(classId, subjectId);
				
		return new ResponseEntity<List<ExamType>>(exam_type_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classSubjectGradings/related/{classSubjectExamGradingId}")
	public ResponseEntity<Class_Subject_ExamGrading_Rel> getClassSubjectExamGradingRelById(@PathVariable long classSubjectExamGradingId){
	
		Class_Subject_ExamGrading_Rel class_sub_examgrading_rel = cseService.getClassSubjectExamGradingRelById(classSubjectExamGradingId);
				
		return new ResponseEntity<Class_Subject_ExamGrading_Rel>(class_sub_examgrading_rel, HttpStatus.OK);
	}
	
	@PostMapping(value="/classSubjectGrading")
	public ResponseEntity<List<ExamType>> addClassSubjectExamGradingRel(@RequestBody Class_Subject_ExamGrading_Rel classSubjectExamGrading, BindingResult result, Errors errors){
	
		long classSubjectExamGradingId = cseService.addClassSubjectExamGradingRel(classSubjectExamGrading);
				
		return this.getRelatedExamTypeByClIdSubId(classSubjectExamGrading.getCl_id(), classSubjectExamGrading.getSub_id());
	}
	
	@PostMapping(value="/classSubjectGradings/{examGradeId}")
	public ResponseEntity<List<ExamType>> updateClassSubjectExamGradingRel(@RequestBody Class_Subject_ExamGrading_Rel classSubjectExamGrading, BindingResult result, Errors errors){
	
		Class_Subject_ExamGrading_Rel classSubjectVal = cseService.updateClassSubjectExamGradingRel(classSubjectExamGrading);
				
		return this.getRelatedExamTypeByClIdSubId(classSubjectExamGrading.getCl_id(), classSubjectExamGrading.getSub_id());
	}
}
