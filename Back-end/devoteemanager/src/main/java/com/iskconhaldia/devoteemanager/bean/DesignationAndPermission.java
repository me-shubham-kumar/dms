package com.iskconhaldia.devoteemanager.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DesignationAndPermission implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int designationId;
	private String designationName;
	private boolean isRead;
	private boolean isWrite;
	private boolean isDelete;
	private boolean isUpdate;
	private boolean isDefaultDesignation;
	private Date created;
	private Date updated;
	
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public boolean getIsRead() {
		return isRead;
	}
	public void setIsRead(boolean isRead) {
		this.isRead = isRead;
	}
	public boolean getIsWrite() {
		return isWrite;
	}
	public void setIsWrite(boolean isWrite) {
		this.isWrite = isWrite;
	}
	public boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	public boolean getIsUpdate() {
		return isUpdate;
	}
	public void setIsUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}
	public boolean getIsDefaultDesignation() {
		return isDefaultDesignation;
	}
	public void setIsDefaultDesignation(boolean isDefaultDesignation) {
		this.isDefaultDesignation = isDefaultDesignation;
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
		return "DesignationAndPermission [designationId=" + designationId + ", designationName=" + designationName
				+ ", isRead=" + isRead + ", isWrite=" + isWrite + ", isDelete=" + isDelete + ", isUpdate=" + isUpdate
				+ ", isDefaultDesignation=" + isDefaultDesignation + ", created=" + created + ", updated=" + updated
				+ "]";
	}
	

}
