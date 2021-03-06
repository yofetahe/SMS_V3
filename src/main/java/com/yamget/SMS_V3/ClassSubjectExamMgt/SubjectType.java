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
@Table(name="subject_list")
public class SubjectType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sub_id;
	@Column(nullable = false, unique = false)
	private String sub_name;
	@Column(nullable = false, unique = false)
	private String sub_status;
	private long created_by;
	private String create_date;
	private long update_by;
	private String update_date;
		
	public SubjectType() {
		super();
	}
	
	public SubjectType(long sub_id, String sub_name, String sub_status, int created_by, String create_date, int update_by,
			String update_date) {
		super();
		this.sub_id = sub_id;
		this.sub_name = sub_name;
		this.sub_status = sub_status;
		this.created_by = created_by;
		this.create_date = create_date;
		this.update_by = update_by;
		this.update_date = update_date;
	}
	
	public long getSub_id() {
		return sub_id;
	}
	public void setSub_id(long sub_id) {
		this.sub_id = sub_id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public String getSub_status() {
		return sub_status;
	}
	public void setSub_status(String sub_status) {
		this.sub_status = sub_status;
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
