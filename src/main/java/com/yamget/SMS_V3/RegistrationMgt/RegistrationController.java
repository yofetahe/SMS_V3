package com.yamget.SMS_V3.RegistrationMgt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registration")
@CrossOrigin
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;

//	@RequestMapping(value="/getStudentRegistrationForm", method=RequestMethod.GET)
//	public ResponseEntity<List<Long>> getStudentRegistrationForm(@ModelAttribute("studReg")Registration studReg, BindingResult result, Errors errors){
//		
//		List<Long> studentIds = registrationService.getStudentsListForRegistration(studReg.getCl_id(), studReg.getAcademic_year());
//		
//		return new ResponseEntity<List<Long>>(studentIds, HttpStatus.OK);
//	}
	
	@GetMapping(value="/getStudentsCountPerSelectedAcadmicYear")
	public ResponseEntity<List<Object>> getStudentsCountPerSelectedAcadmicYear(@ModelAttribute("studReg")Registration studReg, BindingResult result, Errors errors){
		
		///*** getting number of student per each class ***///
		// Must be changed to --> getStudentByStudentIds(Ids)
		List<Object> studnum_perclass = registrationService.getStudentNumPerClassByAcademicYear(studReg.getAcademic_year());
				
		return new ResponseEntity<List<Object>>(studnum_perclass, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getStudentIdsPerClassDetail", method=RequestMethod.GET)
	public ResponseEntity<List<Long>> getStudentIdsPerClassDetail(@ModelAttribute("studReg")Registration studReg, BindingResult result, Errors errors){

		List<Long> stud_ids = registrationService.getStudentsPerClassDetailByAcademicYear(studReg.getCl_id(), studReg.getCd_id(), studReg.getAcademic_year());
				
		return new ResponseEntity<List<Long>>(stud_ids, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getStudentIdsPerClass", method=RequestMethod.GET)
	public ResponseEntity<List<Long>> getStudentIdsPerClass(@ModelAttribute("studReg")Registration studReg, BindingResult result, Errors errors){

		List<Long> stud_ids = registrationService.getStudentsPerClassByAcademicYear(studReg.getCl_id(), studReg.getAcademic_year());
				
		return new ResponseEntity<List<Long>>(stud_ids, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getStudentsByAcademicYear", method=RequestMethod.GET)
	public ResponseEntity<List<Long>> getStudentsByAcademicYear(@ModelAttribute("studReg")Registration studReg, BindingResult result, Errors errors){
		
		List<Long> allStudentIds = registrationService.getStudentsByAcademicYear(studReg.getAcademic_year());
		
		return new ResponseEntity<List<Long>>(allStudentIds, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getInactiveStudentsByAcademicYear", method=RequestMethod.GET)
	public ResponseEntity<List<Long>> getInactiveStudentsByAcademicYear(@ModelAttribute("studReg")Registration studReg, BindingResult result, Errors errors){
		
		List<Long> allStudentIds = registrationService.getInactiveStudentsByAcademicYear(studReg.getAcademic_year());
		
		return new ResponseEntity<List<Long>>(allStudentIds, HttpStatus.OK);
	}
}
