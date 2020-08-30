package com.yamget.SMS_V3.StudentProfileMgt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
import org.springframework.web.servlet.ModelAndView;

import com.yamget.SMS_V3.ClassSubjectExamMgt.CSEService;
import com.yamget.SMS_V3.RegistrationMgt.Registration;
import com.yamget.SMS_V3.Utils.TodayDate_YYYYMMDD;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping(value="/getStudents", method=RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudentsByIds(@ModelAttribute("student")Student student, BindingResult result, Errors errors){
		
		List<Student> stud_list = studentService.getStudentsByStudentIds(student.getIdsList());
				
		return new ResponseEntity<List<Student>>(stud_list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getStudent/{publicId}", method=RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudentById(@PathVariable String publicId, BindingResult result, Errors errors){
		
		List<Student> stud_list = studentService.getStudentsByStudentId(publicId);
				
		return new ResponseEntity<List<Student>>(stud_list, HttpStatus.OK);
	}
		
	@PostMapping(value="/save")
	public ResponseEntity<List<Student>> saveStudent(@ModelAttribute("studentInformation")Student studentInformation, BindingResult result){

		///--->>> 1 - SAVE Student Info
		//boolean rslt = studentService.saveStudentProfileInformation(studReg);
		
		///--->>> 2 - SAVE Emergency Contact info - 1. Share if s/he has a brother/sister OR 2. Save info
		
		///--->>> 3 - SAVE Student Relation Info
		
		// Probably return a success message
		return null;
	}
	
	@PostMapping(value="/upate/{publicId}")
	public ResponseEntity<List<Student>> updateStudentById(@ModelAttribute("studentInformation")Student studentInformation, BindingResult result){

		return null;
	}
	
	@RequestMapping(value="/getAllNewCandidateStudents", method=RequestMethod.GET)
	public ResponseEntity<List<Student>> getAllNewCandidateStudents(){
		
		// New students that are not assigned to any class must have a unique flag
		// the flag help to filter the list for this method call response
		List<Student> stud_list = studentService.getAllNewCandidateStudents();
		
		return new ResponseEntity<List<Student>>(stud_list, HttpStatus.OK);
	}
		
	@RequestMapping(value="/getStudentPhoto", method=RequestMethod.GET)
	public void getStudentPhoto(@ModelAttribute("studReg")Registration studReg, HttpServletResponse response){
		
		byte[] readImg = studentService.getStudentPhotoBySiid(studReg.getSi_id());
		
		if(readImg == null){
			
			File image = new File("C:\\sms_system_file\\everest\\Photos\\stud_photo\\default.jpeg");
			byte[] fileContent;
			try {
				fileContent = Files.readAllBytes(image.toPath());
				readImg = fileContent;
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		
		if(readImg != null){
						
			try {
//				response.reset();
				response.setContentType("image/jpeg");
				response.getOutputStream().write(readImg, 0, readImg.length);
				response.getOutputStream().flush();
				response.getOutputStream().close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Must move to Student_EmergencyContact
//	@RequestMapping(value="/getStudentContactInformationListPerGrade", method=RequestMethod.GET)
//	public ResponseEntity<List<Student_EmergencyContact>> getStudentContactInformationListPerGrade(@ModelAttribute("studReg")Registration studReg, BindingResult result, Errors errors){
//
//		List<Student_EmergencyContact> contactInfo = studentService.getStudentContactInformationListPerGradeDetail(studReg.getClcdRelation().getCl_id(), studReg.getClcdRelation().getCd_id(), studReg.getAcademic_year());
//		
//		return new ResponseEntity<List<Student_EmergencyContact>>(contactInfo, HttpStatus.OK);
//	}
	
	//Need to check if it is REGISTRATION functionality or not
//	@GetMapping(value="/searchBrotherSisterByName")
//	public ResponseEntity<List<Student>> searchBrotherSisterByName(@ModelAttribute("studentReg")Registration studReg, BindingResult result, Errors errors){
//
//		List<Student> student_search_result = studentService.searchStudentByCl_idCd_idName(studReg.getClcdRelation().getCl_id(), studReg.getClcdRelation().getCd_id(), studReg.getStudentInformation().getFname());
//		
//		return new ResponseEntity<List<Student>>(student_search_result, HttpStatus.OK);
//	}
	
//	@RequestMapping(value="/getStudentDetailInformationForm", method=RequestMethod.GET)
//	public ResponseEntity<Student> getStudentDetailInformationForm(@ModelAttribute("studReg")Registration studReg, BindingResult result, Errors errors){
//		
//		///*** Used to display student profile information for update ***///
//		Student stud_info = studentService.getStudentInformationById(studReg.getSi_id());
//		
//		return new ResponseEntity<Student>(stud_info, HttpStatus.OK);
//	}
}
