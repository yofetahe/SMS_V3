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
@Table(name="exams_type")
public class ExamType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long et_id;
	@Column(nullable = false, unique = false)
	private String et_name;
	@Column(nullable = false, unique = false)
	private String et_status;
	private long created_by;
	private String create_date;
	private long update_by;
	private String update_date;
	
	public ExamType() {
		super();
	}
	
	public ExamType(long et_id, String et_name, String et_status) {
		super();
		this.et_id = et_id;
		this.et_name = et_name;
		this.et_status = et_status;
	}
		
	public long getEt_id() {
		return et_id;
	}
	public void setEt_id(long et_id) {
		this.et_id = et_id;
	}
	public String getEt_name() {
		return et_name;
	}
	public void setEt_name(String et_name) {
		this.et_name = et_name;
	}
	public String getEt_status() {
		return et_status;
	}
	public void setEt_status(String et_status) {
		this.et_status = et_status;
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
