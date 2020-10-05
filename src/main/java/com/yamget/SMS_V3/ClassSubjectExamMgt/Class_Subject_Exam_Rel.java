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
public class Class_Subject_Exam_Rel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cse_id;
	@Column(nullable = false, unique = false)
	private long cl_id;
	@Column(nullable = false, unique = false)
	private long sub_id;
	@Column(nullable = false, unique = false)
	private long et_id;
	@Column(nullable = false, unique = false)
	private double total_mark;
	@Column(nullable = false, unique = false)
	private double pass_mark;	
	@Column(nullable = false, unique = false)
	private String rel_status;
	private long created_by;
	private String create_date;
	private long update_by;
	private String update_date;
	
	public Class_Subject_Exam_Rel() {
		super();
	}
	
	public Class_Subject_Exam_Rel(long cse_id, long cl_id, long sub_id, long et_id, double total_mark, double pass_mark,
			String rel_status, long created_by, String create_date, long update_by, String update_date) {
		super();
		this.cse_id = cse_id;
		this.cl_id = cl_id;
		this.sub_id = sub_id;
		this.et_id = et_id;
		this.total_mark = total_mark;
		this.pass_mark = pass_mark;
		this.rel_status = rel_status;
		this.created_by = created_by;
		this.create_date = create_date;
		this.update_by = update_by;
		this.update_date = update_date;
	}
	public long getCse_id() {
		return cse_id;
	}
	public void setCse_id(long cse_id) {
		this.cse_id = cse_id;
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
	public long getEt_id() {
		return et_id;
	}
	public void setEt_id(long et_id) {
		this.et_id = et_id;
	}
	public double getTotal_mark() {
		return total_mark;
	}
	public void setTotal_mark(double total_mark) {
		this.total_mark = total_mark;
	}
	public double getPass_mark() {
		return pass_mark;
	}
	public void setPass_mark(double pass_mark) {
		this.pass_mark = pass_mark;
	}
	public String getRel_status() {
		return rel_status;
	}
	public void setRel_status(String rel_status) {
		this.rel_status = rel_status;
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
