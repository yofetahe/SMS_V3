package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/csm")
@CrossOrigin
public class CSEController {
	
	@Autowired
	CSEService cseService;
	
	//**** Class Type ****//
	
	@GetMapping(value="/class")
	public ResponseEntity<List<ClassType>> getClassList(){
	
		List<ClassType> class_list = cseService.getClassList();
				
		return new ResponseEntity<List<ClassType>>(class_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/class/{publicId}")
	public ResponseEntity<ClassType> getClassById(@PathVariable String publicId){
	
		ClassType class_list = cseService.getClassById(publicId);
				
		return new ResponseEntity<ClassType>(class_list, HttpStatus.OK);
	}
	
	@PostMapping(value="/class")
	public ResponseEntity<List<ClassType>> addClass(@ModelAttribute("classType")ClassType classType, BindingResult result, Errors errors){
	
		long classId = cseService.addClass(classType);
				
		return null;
	}
	
	@PostMapping(value="/class/{publicId}")
	public ResponseEntity<List<ClassType>> updateClass(@ModelAttribute("classType")ClassType classType, BindingResult result, Errors errors){
	
		ClassType classValue = cseService.updateClass(classType);
				
		return null;
	}

	//**** Class Detail ****//
	
	@GetMapping(value="/classDetails/{classId}")
	public ResponseEntity<List<ClassDetail>> getClassDetailByClassId(@PathVariable String classId){
	
		List<ClassDetail> class_list = cseService.getClassDetailsByClassId(classId);
				
		return new ResponseEntity<List<ClassDetail>>(class_list, HttpStatus.OK);
	}
	
	@GetMapping(value="/classDetail/{classDetailId}")
	public ResponseEntity<ClassDetail> getClassDetailById(@PathVariable String classDetailId){
	
		ClassDetail class_list = cseService.getClassDetailById(classDetailId);
				
		return new ResponseEntity<ClassDetail>(class_list, HttpStatus.OK);
	}

	@PostMapping(value="/classDetail")
	public ResponseEntity<List<ClassDetail>> addClassDetail(@ModelAttribute("classType")ClassDetail classDetail, BindingResult result, Errors errors){
	
		long classDetailId = cseService.addClassDetail(classDetail);
				
		return null;
	}
	
	@PostMapping(value="/classDetail/{classDetailId}")
	public ResponseEntity<List<ClassDetail>> updateClassDetail(@ModelAttribute("classDetail")ClassDetail classDetail, BindingResult result, Errors errors){
	
		ClassDetail classDetailVal = cseService.updateClassDetail(classDetail);
				
		return null;
	}
	
	//**** Subject Type ****//
		
	//**** Exam Type ****//	
	
	//**** Exam Grading Type ****//
	
	//**** Class & ClassDetail relation ****//
	
	//**** Class & Subject relation ****//
	
	//**** Class-Subject-Rel & Exam relation ****//
	
	//**** Class-Subject-Rel & Grading relation ****//
}
