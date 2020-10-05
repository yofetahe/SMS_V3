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
public class Class_ClassDetail_Rel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long clcd_id;
	
	@Column(nullable = false)
	private long cl_id;
	
	@Column(nullable = false)
	private long cd_id;
		
	@Column(nullable = false)
	private int class_capacity;
	
	@Column(nullable = false)
	private String rel_status;
	private long created_by;
	private String create_date;
	private long update_by;
	private String update_date;
	
	public Class_ClassDetail_Rel() {
		super();
	}
	
	public Class_ClassDetail_Rel(long clcd_id, long cl_id, long cd_id, int class_capacity, String rel_status,
			long created_by, String create_date, long update_by, String update_date) {
		super();
		this.clcd_id = clcd_id;
		this.cl_id = cl_id;
		this.cd_id = cd_id;
		this.class_capacity = class_capacity;
		this.rel_status = rel_status;
		this.created_by = created_by;
		this.create_date = create_date;
		this.update_by = update_by;
		this.update_date = update_date;
	}
	public long getClcd_id() {
		return clcd_id;
	}
	public void setClcd_id(long clcd_id) {
		this.clcd_id = clcd_id;
	}
	public long getCl_id() {
		return cl_id;
	}
	public void setCl_id(long cl_id) {
		this.cl_id = cl_id;
	}
	public long getCd_id() {
		return cd_id;
	}
	public void setCd_id(long cd_id) {
		this.cd_id = cd_id;
	}
	public int getClass_capacity() {
		return class_capacity;
	}
	public void setClass_capacity(int class_capacity) {
		this.class_capacity = class_capacity;
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
