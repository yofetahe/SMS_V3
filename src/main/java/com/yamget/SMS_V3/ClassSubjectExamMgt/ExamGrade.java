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
@Table(name="exam_grade")
public class ExamGrade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eg_id;
	@Column(nullable = false, unique = false)
	private String eg_value;
	@Column(nullable = false, unique = false)
	private String eg_desc;
	@Column(nullable = false, unique = false)
	private String eg_status;
	private long created_by;
	private String create_date;
	private long update_by;
	private String update_date;
	
	public ExamGrade() {
		super();
	}
	
	public ExamGrade(long eg_id, String eg_value, double eg_from, double eg_to, String eg_desc, String eg_status) {
		super();
		this.eg_id = eg_id;
		this.eg_value = eg_value;
		this.eg_desc = eg_desc;
		this.eg_status = eg_status;
	}
	
	public long getEg_id() {
		return eg_id;
	}
	public void setEg_id(long eg_id) {
		this.eg_id = eg_id;
	}
	public String getEg_value() {
		return eg_value;
	}
	public void setEg_value(String eg_value) {
		this.eg_value = eg_value;
	}
	public String getEg_desc() {
		return eg_desc;
	}
	public void setEg_desc(String eg_desc) {
		this.eg_desc = eg_desc;
	}
	public String getEg_status() {
		return eg_status;
	}
	public void setEg_status(String eg_status) {
		this.eg_status = eg_status;
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
