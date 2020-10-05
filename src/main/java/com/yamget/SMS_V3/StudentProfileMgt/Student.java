package com.yamget.SMS_V3.StudentProfileMgt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.yamget.SMS_V3.RegistrationMgt.Registration;

@Entity
@Table(name="stud_information")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long si_id;	
	
	@Column(nullable = false)
	private String public_id;
	
	@Column(nullable = false)
	private String fname;
	
	@Column(nullable = false)
	private String mname;
	
	@Column(nullable = false)
	private String gname;
	
	@Column(nullable = false)
	private String mother_name;
	
	@Column(nullable = false)
	private String sex;
	
	@Column(nullable = false)
	private String dob;
	
	@Column(nullable = false)
	private String pob;
	
	@Column(nullable = false)
	private String nationality;
	
	@Column(nullable = false)
	private String id_no;
	
	@Column(nullable = false)
	private String photo_name;
	
	@Column(nullable = false)
	private String photo_path;
	
	//On-Process, Registered
	@Column(nullable = false)
	private String si_status;
	
	private int create_by;
	private String create_date;
	private int update_by;
	private String update_date;
	
	@Transient
	private Registration registration;
	@Transient
	private String selectedBroSisIdList;
	@Transient
	private Student_EmergencyContact studentEmergencyContact;
	@Transient
	private List<Long> idsList;
	
	public Student(){}
	
	public Student(int si_id, String public_id, String fname, String mname, String gname, String mother_name, String sex,
			String dob, String pob, String nationality, String id_no, String photo_name, String photo_path,
			String si_status){
		
		super();
		this.si_id = si_id;
		this.public_id = public_id;
		this.fname = fname;
		this.mname = mname;
		this.gname = gname;
		this.mother_name = mother_name;
		this.sex = sex;
		this.dob = dob;
		this.pob = pob;
		this.nationality = nationality;
		this.id_no = id_no;
		this.photo_name = photo_name;
		this.photo_path = photo_path;
		this.si_status = si_status;
	}
	
	public long getSi_id() {
		return si_id;
	}
	public void setSi_id(long si_id) {
		this.si_id = si_id;
	}
	public String getPublic_id() {
		return public_id;
	}
	public void setPublic_id(String public_id) {
		this.public_id = public_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getId_no() {
		return id_no;
	}
	public void setId_no(String id_no) {
		this.id_no = id_no;
	}
	public String getPhoto_name() {
		return photo_name;
	}
	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}
	public String getPhoto_path() {
		return photo_path;
	}
	public void setPhoto_path(String photo_path) {
		this.photo_path = photo_path;
	}
	public String getSi_status() {
		return si_status;
	}
	public void setSi_status(String si_status) {
		this.si_status = si_status;
	}
	public int getCreate_by() {
		return create_by;
	}
	public void setCreate_by(int create_by) {
		this.create_by = create_by;
	}
	public String getCreate_date() {
		return create_date;
	}
	
	public int getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(int update_by) {
		this.update_by = update_by;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	public String getSelectedBroSisIdList() {
		return selectedBroSisIdList;
	}
	public void setSelectedBroSisIdList(String selectedBroSisIdList) {
		this.selectedBroSisIdList = selectedBroSisIdList;
	}
	public Student_EmergencyContact getStudentEmergencyContact() {
		return studentEmergencyContact;
	}
	public void setStudentEmergencyContact(Student_EmergencyContact studentEmergencyContact) {
		this.studentEmergencyContact = studentEmergencyContact;
	}
	public List<Long> getIdsList() {
		return idsList;
	}
	public void setIdsList(List<Long> idsList) {
		this.idsList = idsList;
	}
	@PrePersist
	void createdAt() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		String strDate = dateFormat.format(date); 
	    this.create_date = strDate;
	}
}
