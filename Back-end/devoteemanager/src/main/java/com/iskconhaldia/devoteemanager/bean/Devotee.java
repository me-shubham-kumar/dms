package com.iskconhaldia.devoteemanager.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Devotee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long phoneNumber;
	@Column(name = "password", nullable = false)
	private String password;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Devotee> listOfDevotee;
	private String remark;
	private String comment;
	private Date created;
	private Date updated;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DesignationAndPermission designationAndPermission;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Role role;
	
	//PersonalInformation
	@OneToOne(cascade = CascadeType.ALL)
	PersonalInformation personalInformation;
	
	//OccupaitonInformation
	@OneToOne(cascade = CascadeType.ALL)
	OccupationalInformation occupationlInformation;
	
	//SpiritualInformation
	@OneToOne(cascade = CascadeType.ALL)
	SpiritualInformation spiritualInformation;

	

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Devotee> getListOfDevotee() {
		return listOfDevotee;
	}

	public void setListOfDevotee(List<Devotee> listOfDevotee) {
		this.listOfDevotee = listOfDevotee;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public DesignationAndPermission getDesignationAndPermission() {
		return designationAndPermission;
	}

	public void setDesignationAndPermission(DesignationAndPermission designationAndPermission) {
		this.designationAndPermission = designationAndPermission;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}

	public OccupationalInformation getOccupationlInformation() {
		return occupationlInformation;
	}

	public void setOccupationlInformation(OccupationalInformation occupationlInformation) {
		this.occupationlInformation = occupationlInformation;
	}

	public SpiritualInformation getSpiritualInformation() {
		return spiritualInformation;
	}

	public void setSpiritualInformation(SpiritualInformation spiritualInformation) {
		this.spiritualInformation = spiritualInformation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Devotee [phoneNumber=" + phoneNumber + ", password=" + password + ", listOfDevotee=" + listOfDevotee
				+ ", remark=" + remark + ", comment=" + comment + ", created=" + created + ", updated=" + updated
				+ ", designationAndPermission=" + designationAndPermission + ", role=" + role + ", personalInformation="
				+ personalInformation + ", occupationlInformation=" + occupationlInformation + ", spiritualInformation="
				+ spiritualInformation + "]";
	}
	
	
	
}
