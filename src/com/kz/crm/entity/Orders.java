package com.kz.crm.entity;

import java.sql.Timestamp;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields
	private CstCustomer cstCustomer;
	private Integer odrId;
	private Timestamp odrDate;
	private String odrCustomer;
	private String odrAddr;
	private String odrStatus;
	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}
	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}
	public Integer getOdrId() {
		return odrId;
	}
	public void setOdrId(Integer odrId) {
		this.odrId = odrId;
	}
	public Timestamp getOdrDate() {
		return odrDate;
	}
	public void setOdrDate(Timestamp odrDate) {
		this.odrDate = odrDate;
	}
	public String getOdrAddr() {
		return odrAddr;
	}
	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr;
	}
	public String getOdrStatus() {
		return odrStatus;
	}
	public void setOdrStatus(String odrStatus) {
		this.odrStatus = odrStatus;
	}
	public String getOdrCustomer() {
		return odrCustomer;
	}
	public void setOdrCustomer(String odrCustomer) {
		this.odrCustomer = odrCustomer;
	}
	public Orders(CstCustomer cstCustomer, Integer odrId, Timestamp odrDate,
			String odrAddr, String odrStatus) {
		super();
		this.cstCustomer = cstCustomer;
		this.odrId = odrId;
		this.odrDate = odrDate;
		this.odrAddr = odrAddr;
		this.odrStatus = odrStatus;
	}
	public Orders() {
		super();
	}
	@Override
	public String toString() {
		return "Orders [cstCustomer=" + cstCustomer + ", odrAddr=" + odrAddr
				+ ", odrDate=" + odrDate + ", odrId=" + odrId + ", odrStatus="
				+ odrStatus + "]";
	}
	
}