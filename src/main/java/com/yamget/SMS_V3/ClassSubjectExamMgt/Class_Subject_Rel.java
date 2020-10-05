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
public class Class_Subject_Rel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cl_sub_id;
	@Column(nullable = false, unique = false)
	private long sub_id;
	@Column(nullable = false, unique = false)
	private long cl_id;
	private boolean doesIncludeInTotal;
	@Column(nullable = false, unique = false)
	private boolean convert_to_grade;
	@Column(nullable = false, unique = false)
	private String rel_status;
	private long created_by;
	private String create_date;
	private long update_by;
	private String update_date;
	
	public Class_Subject_Rel() {
		super();
	}
	
	public Class_Subject_Rel(long cl_sub_id, long sub_id, long cl_id, boolean doesIncludeInTotal,
			boolean convert_to_grade, String rel_status, long created_by, String create_date, long update_by,
			String update_date) {
		super();
		this.cl_sub_id = cl_sub_id;
		this.sub_id = sub_id;
		this.cl_id = cl_id;
		this.doesIncludeInTotal = doesIncludeInTotal;
		this.convert_to_grade = convert_to_grade;
		this.rel_status = rel_status;
		this.created_by = created_by;
		this.create_date = create_date;
		this.update_by = update_by;
		this.update_date = update_date;
	}
	public long getCl_sub_id() {
		return cl_sub_id;
	}
	public void setCl_sub_id(long cl_sub_id) {
		this.cl_sub_id = cl_sub_id;
	}
	public long getSub_id() {
		return sub_id;
	}
	public void setSub_id(long sub_id) {
		this.sub_id = sub_id;
	}
	public long getCl_id() {
		return cl_id;
	}
	public void setCl_id(long cl_id) {
		this.cl_id = cl_id;
	}
	public boolean getConvert_to_grade() {
		return convert_to_grade;
	}
	public void setConvert_to_grade(boolean convert_to_grade) {
		this.convert_to_grade = convert_to_grade;
	}
	public String getRel_status() {
		return rel_status;
	}
	public void setRel_status(String rel_status) {
		this.rel_status = rel_status;
	}
	public boolean isDoesIncludeInTotal() {
		return doesIncludeInTotal;
	}
	public void setDoesIncludeInTotal(boolean doesIncludeInTotal) {
		this.doesIncludeInTotal = doesIncludeInTotal;
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
