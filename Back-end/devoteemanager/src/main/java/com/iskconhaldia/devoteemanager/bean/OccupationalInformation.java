package com.iskconhaldia.devoteemanager.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OccupationalInformation {
	
	@Id
	@GeneratedValue
	private int occupationId;
	private String studyQualification;
	private String occupation;
	private Date created;
	private Date updated;
	
	public int getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(int occupationId) {
		this.occupationId = occupationId;
	}
	public String getStudyQualification() {
		return studyQualification;
	}
	public void setStudyQualification(String studyQualification) {
		this.studyQualification = studyQualification;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
		return "OccupationalInformation [occupationId=" + occupationId + ", studyQualification=" + studyQualification
				+ ", occupation=" + occupation + ", created=" + created + ", updated=" + updated + "]";
	}
	
	

}
