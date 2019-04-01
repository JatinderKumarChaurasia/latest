package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "mechanic")
public class Mechanic{
	@Id
	@Column(name="MECHANIC_ID")
	private long mechanicId;
	@Column(name="MECHANIC_NAME")
	private String mechanicName;
	@Column(name="MECHANIC_DOB")
	private String mechanicDOB;
	@Column(name="MECHANIC_CONTACTNO")
	private int mechanicContactNo;
	@Column(name="MECHANIC_PASSWORD")
	private String mechanicPassword;
	@Column(name="MECHANIC_GENDER")
	private String mechanicGender;
	@Column(name="MECHANIC_EMAILID")
	private String mechanicEmailId;
	@Column(name="MECHANIC_LATITUDE")
	private Double mechanicLatitude;
	@Column(name="MECHANIC_LONGITUDE")
	private Double mechanicLongitude;
	public long getMechanicId() {
		return mechanicId;
	}
	public void setMechanicId(long mechanicId) {
		this.mechanicId = mechanicId;
	}
	public String getMechanicName() {
		return mechanicName;
	}
	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
	}
	public String getMechanicDOB() {
		return mechanicDOB;
	}
	public void setMechanicDOB(String mechanicDOB) {
		this.mechanicDOB = mechanicDOB;
	}
	public int getMechanicContactNo() {
		return mechanicContactNo;
	}
	public void setMechanicContactNo(int mechanicContactNo) {
		this.mechanicContactNo = mechanicContactNo;
	}
	public String getMechanicPassword() {
		return mechanicPassword;
	}
	public void setMechanicPassword(String mechanicPassword) {
		this.mechanicPassword = mechanicPassword;
	}
	public String getMechanicGender() {
		return mechanicGender;
	}
	public void setMechanicGender(String mechanicGender) {
		this.mechanicGender = mechanicGender;
	}
	public String getMechanicEmailId() {
		return mechanicEmailId;
	}
	public void setMechanicEmailId(String mechanicEmailId) {
		this.mechanicEmailId = mechanicEmailId;
	}
	public Double getMechanicLatitude() {
		return mechanicLatitude;
	}
	public void setMechanicLatitude(Double mechanicLatitude) {
		this.mechanicLatitude = mechanicLatitude;
	}
	public Double getMechanicLongitude() {
		return mechanicLongitude;
	}
	public void setMechanicLongitude(Double mechanicLongitude) {
		this.mechanicLongitude = mechanicLongitude;
	}
	
	
}
