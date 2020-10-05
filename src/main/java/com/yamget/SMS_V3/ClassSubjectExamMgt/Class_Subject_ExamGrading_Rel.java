package com.yamget.SMS_V3.ClassSubjectExamMgt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.yamget.SMS_V3.Utils.TodayDate_YYYYMMDD;

@Entity
@Table
public class Class_Subject_ExamGrading_Rel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cseg_id;
	@Column(nullable = false, unique = false)
	private long cl_id;
	@Column(nullable = false, unique = false)
	private long sub_id;
	@Column(nullable = false, unique = false)
	private long eg_id;
	@Column(nullable = false, unique = false)
	private double grade_from;
	@Column(nullable = false, unique = false)
	private double grade_to;
	@Column(nullable = false, unique = false)
	private String escg_status;
	private long created_by;
	private String create_date;
	private long update_by;
	private String update_date;
	
	public Class_Subject_ExamGrading_Rel() {
		super();
	}
	
	public Class_Subject_ExamGrading_Rel(long cseg_id, long cl_id, long sub_id, long eg_id, double grade_from,
			double grade_to, String escg_status, long created_by, String create_date, long update_by, String update_date) {
		super();
		this.cseg_id = cseg_id;
		this.cl_id = cl_id;
		this.sub_id = sub_id;
		this.eg_id = eg_id;
		this.grade_from = grade_from;
		this.grade_to = grade_to;
		this.escg_status = escg_status;
		this.created_by = created_by;
		this.create_date = create_date;
		this.update_by = update_by;
		this.update_date = update_date;
	}
	public long getCseg_id() {
		return cseg_id;
	}
	public void setCseg_id(long cseg_id) {
		this.cseg_id = cseg_id;
	}
	public long getCl_id() {
		return cl_id;
	}
	public void setCl_id(long cl_id) {
		this.cl_id = cl_id;
	}
	public long getSub_id() {
		return sub_id;
	}
	public void setSub_id(long sub_id) {
		this.sub_id = sub_id;
	}
	public long getEg_id() {
		return eg_id;
	}
	public void setEg_id(long eg_id) {
		this.eg_id = eg_id;
	}
	public double getGrade_from() {
		return grade_from;
	}
	public void setGrade_from(double grade_from) {
		this.grade_from = grade_from;
	}
	public double getGrade_to() {
		return grade_to;
	}
	public void setGrade_to(double grade_to) {
		this.grade_to = grade_to;
	}
	public String getEscg_status() {
		return escg_status;
	}
	public void setEscg_status(String escg_status) {
		this.escg_status = escg_status;
	}
	public long getCreated_by() {
		return created_by;
	}
	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public long getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(long update_by) {
		this.update_by = update_by;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	@PrePersist
	void createdAt() {		
	    this.create_date = TodayDate_YYYYMMDD.getDateForModels();;
	}
	@PreUpdate
	void updatedAt() {		
		this.update_date = TodayDate_YYYYMMDD.getDateForModels();
	}
}
