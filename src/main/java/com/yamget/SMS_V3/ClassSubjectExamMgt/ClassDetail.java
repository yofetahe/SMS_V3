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
@Table(name="class_detail")
public class ClassDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cd_id;
	@Column(nullable = false, unique = false)
	private String cd_name;
	@Column(nullable = false, unique = false)
	private String cd_status;
	private long created_by;
	private String create_date;
	private long update_by;
	private String update_date;
	
	public ClassDetail() {
		super();
	}
	
	public ClassDetail(long cd_id, String cd_name, String cd_status) {
		super();
		this.cd_id = cd_id;
		this.cd_name = cd_name;
		this.cd_status = cd_status;
	}
	
	public long getCd_id() {
		return cd_id;
	}
	public void setCd_id(long cd_id) {
		this.cd_id = cd_id;
	}
	public String getCd_name() {
		return cd_name;
	}
	public void setCd_name(String cd_name) {
		this.cd_name = cd_name;
	}
	public String getCd_status() {
		return cd_status;
	}
	public void setCd_status(String cd_status) {
		this.cd_status = cd_status;
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
