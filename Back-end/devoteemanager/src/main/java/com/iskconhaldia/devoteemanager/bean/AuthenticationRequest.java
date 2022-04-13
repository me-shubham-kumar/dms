package com.iskconhaldia.devoteemanager.bean;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long phoneNumber;
	private String password;
	
	
	
	public AuthenticationRequest(long phoneNumber, String password) {
		super();
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AuthenticationRequest [phoneNumber=" + phoneNumber + ", password=" + password + "]";
	}
	
	
}
