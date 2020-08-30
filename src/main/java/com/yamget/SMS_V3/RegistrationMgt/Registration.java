package com.yamget.SMS_V3.RegistrationMgt;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Transient;

@Entity
@Table(name="stud_registration")
public class Registration {

	@Id
	@GeneratedValue
	private long sr_id;
	private String public_id;
	private long cl_id;
	private long cd_id;
	private long si_id;
	private int academic_year;
	private String stud_status;
	private String reg_status;
	private long create_by;
	private Date create_date;
	private long update_by;
	private Date update_date;
	
	public long getSr_id() {
		return sr_id;
	}
	public void setSr_id(long sr_id) {
		this.sr_id = sr_id;
	}
	public String getPublic_id() {
		return public_id;
	}
	public void setPublic_id(String public_id) {
		this.public_id = public_id;
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
	public long getSi_id() {
		return si_id;
	}
	public void setSi_id(long si_id) {
		this.si_id = si_id;
	}
	public int getAcademic_year() {
		return academic_year;
	}
	public void setAcademic_year(int academic_year) {
		this.academic_year = academic_year;
	}
	public String getStud_status() {
		return stud_status;
	}
	public void setStud_status(String stud_status) {
		this.stud_status = stud_status;
	}
	public String getReg_status() {
		return reg_status;
	}
	public void setReg_status(String reg_status) {
		this.reg_status = reg_status;
	}
	public long getCreate_by() {
		return create_by;
	}
	public void setCreate_by(long create_by) {
		this.create_by = create_by;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public long getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(long update_by) {
		this.update_by = update_by;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}	
}
