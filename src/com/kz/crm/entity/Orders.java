package com.kz.crm.entity;

import java.sql.Timestamp;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer odrId;
	private String odrCustomer;
	private Timestamp odrDate;
	private String odrAddr;
	private String odrStatus;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Integer odrId, String odrCustomer, Timestamp odrDate,
			String odrStatus) {
		this.odrId = odrId;
		this.odrCustomer = odrCustomer;
		this.odrDate = odrDate;
		this.odrStatus = odrStatus;
	}

	@Override
	public String toString() {
		return "Orders [odrAddr=" + odrAddr + ", odrCustomer=" + odrCustomer
				+ ", odrDate=" + odrDate + ", odrId=" + odrId + ", odrStatus="
				+ odrStatus + "]";
	}

	/** full constructor */
	public Orders(Integer odrId, String odrCustomer, Timestamp odrDate,
			String odrAddr, String odrStatus) {
		this.odrId = odrId;
		this.odrCustomer = odrCustomer;
		this.odrDate = odrDate;
		this.odrAddr = odrAddr;
		this.odrStatus = odrStatus;
	}

	// Property accessors

	public Integer getOdrId() {
		return this.odrId;
	}

	public void setOdrId(Integer odrId) {
		this.odrId = odrId;
	}

	public String getOdrCustomer() {
		return this.odrCustomer;
	}

	public void setOdrCustomer(String odrCustomer) {
		this.odrCustomer = odrCustomer;
	}

	public Timestamp getOdrDate() {
		return this.odrDate;
	}

	public void setOdrDate(Timestamp odrDate) {
		this.odrDate = odrDate;
	}

	public String getOdrAddr() {
		return this.odrAddr;
	}

	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr;
	}

	public String getOdrStatus() {
		return this.odrStatus;
	}

	public void setOdrStatus(String odrStatus) {
		this.odrStatus = odrStatus;
	}

}