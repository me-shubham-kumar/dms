package com.iskconhaldia.devoteemanager.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonalInformation {
	
	@Id
	@GeneratedValue
	private int personalId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private long whatsAppNumber;
	private String profilePictureImageLink;
	private String profileWallpaperImageLink;
	private String gender;
	private String dob;
	private int age;
	private String cast;
	private String marriageStatus;
	private Date created;
	private Date updated;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address permanentAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private Address currentAddress;
	public int getPersonalId() {
		return personalId;
	}
	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getWhatsAppNumber() {
		return whatsAppNumber;
	}
	public void setWhatsAppNumber(long whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
	}
	public String getProfilePictureImageLink() {
		return profilePictureImageLink;
	}
	public void setProfilePictureImageLink(String profilePictureImageLink) {
		this.profilePictureImageLink = profilePictureImageLink;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getMarriageStatus() {
		return marriageStatus;
	}
	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
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
	public String getProfileWallpaperImageLink() {
		return profileWallpaperImageLink;
	}
	public void setProfileWallpaperImageLink(String profileWallpaperImageLink) {
		this.profileWallpaperImageLink = profileWallpaperImageLink;
	}
	@Override
	public String toString() {
		return "PersonalInformation [personalId=" + personalId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", email=" + email + ", whatsAppNumber=" + whatsAppNumber
				+ ", profilePictureImageLink=" + profilePictureImageLink + ", profileWallpaperImageLink="
				+ profileWallpaperImageLink + ", gender=" + gender + ", dob=" + dob + ", age=" + age + ", cast=" + cast
				+ ", marriageStatus=" + marriageStatus + ", created=" + created + ", updated=" + updated
				+ ", permanentAddress=" + permanentAddress + ", currentAddress=" + currentAddress + "]";
	}
}
