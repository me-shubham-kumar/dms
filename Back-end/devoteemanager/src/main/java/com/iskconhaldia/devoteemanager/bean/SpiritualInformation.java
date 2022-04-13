package com.iskconhaldia.devoteemanager.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpiritualInformation {
	
	@Id
	@GeneratedValue
	private int spiritualId;
	private boolean isInitiated;
	private boolean isFirstInitiated;
	private boolean isSecondInitiated;
	private String guruName;
	private String kcStartDate;
	private String facilitator;
	private int noOfRoundChanting;
	private int noOfHoursForPreaching;
	private Date created;
	private Date updated;
	
	public int getSpiritualId() {
		return spiritualId;
	}
	public void setSpiritualId(int spiritualId) {
		this.spiritualId = spiritualId;
	}
	public boolean getIsInitiated() {
		return isInitiated;
	}
	public void setInitiated(boolean isInitiated) {
		this.isInitiated = isInitiated;
	}
	public boolean getIsFirstInitiated() {
		return isFirstInitiated;
	}
	public void setFirstInitiated(boolean isFirstInitiated) {
		this.isFirstInitiated = isFirstInitiated;
	}
	public boolean getIsSecondInitiated() {
		return isSecondInitiated;
	}
	public void setSecondInitiated(boolean isSecondInitiated) {
		this.isSecondInitiated = isSecondInitiated;
	}
	public String getGuruName() {
		return guruName;
	}
	public void setGuruName(String guruName) {
		this.guruName = guruName;
	}
	public String getKcStartDate() {
		return kcStartDate;
	}
	public void setKcStartDate(String kcStartDate) {
		this.kcStartDate = kcStartDate;
	}
	public String getFacilitator() {
		return facilitator;
	}
	public void setFacilitator(String facilitator) {
		this.facilitator = facilitator;
	}
	public int getNoOfRoundChanting() {
		return noOfRoundChanting;
	}
	public void setNoOfRoundChanting(int noOfRoundChanting) {
		this.noOfRoundChanting = noOfRoundChanting;
	}
	public int getNoOfHoursForPreaching() {
		return noOfHoursForPreaching;
	}
	public void setNoOfHoursForPreaching(int noOfHoursForPreaching) {
		this.noOfHoursForPreaching = noOfHoursForPreaching;
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
	@Override
	public String toString() {
		return "SpiritualInformation [spiritualId=" + spiritualId + ", isInitiated=" + isInitiated
				+ ", isFirstInitiated=" + isFirstInitiated + ", isSecondInitiated=" + isSecondInitiated
				+ ", guruName=" + guruName + ", kcStartDate=" + kcStartDate + ", facilitator=" + facilitator
				+ ", noOfRoundChanting=" + noOfRoundChanting + ", noOfHoursForPreaching=" + noOfHoursForPreaching
				+ ", created=" + created + ", updated=" + updated + "]";
	}
	

}
