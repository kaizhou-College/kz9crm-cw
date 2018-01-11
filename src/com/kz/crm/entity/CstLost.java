package com.kz.crm.entity;

import java.sql.Timestamp;

/**
 * CstLost entity. @author MyEclipse Persistence Tools
 */

public class CstLost implements java.io.Serializable {

	// Fields

	private Integer lstId;
	private String lstCustNo;
	private String lstCustName;
	private Integer lstCustManagerId;
	private String lstCustManagerName;
	private Timestamp lstLastOrderDate;
	private Timestamp lstLostDate;
	private String lstDelay;
	private String lstReason;
	private String lstStatus;

	// Constructors

	/** default constructor */
	public CstLost() {
	}

	/** minimal constructor */
	public CstLost(Integer lstId, String lstCustNo, Integer lstCustManagerId,
			String lstCustManagerName, String lstDelay, String lstStatus) {
		this.lstId = lstId;
		this.lstCustNo = lstCustNo;
		this.lstCustManagerId = lstCustManagerId;
		this.lstCustManagerName = lstCustManagerName;
		this.lstDelay = lstDelay;
		this.lstStatus = lstStatus;
	}

	/** full constructor */
	public CstLost(Integer lstId, String lstCustNo, String lstCustName,
			Integer lstCustManagerId, String lstCustManagerName,
			Timestamp lstLastOrderDate, Timestamp lstLostDate, String lstDelay,
			String lstReason, String lstStatus) {
		this.lstId = lstId;
		this.lstCustNo = lstCustNo;
		this.lstCustName = lstCustName;
		this.lstCustManagerId = lstCustManagerId;
		this.lstCustManagerName = lstCustManagerName;
		this.lstLastOrderDate = lstLastOrderDate;
		this.lstLostDate = lstLostDate;
		this.lstDelay = lstDelay;
		this.lstReason = lstReason;
		this.lstStatus = lstStatus;
	}

	// Property accessors

	public Integer getLstId() {
		return this.lstId;
	}

	public void setLstId(Integer lstId) {
		this.lstId = lstId;
	}

	public String getLstCustNo() {
		return this.lstCustNo;
	}

	public void setLstCustNo(String lstCustNo) {
		this.lstCustNo = lstCustNo;
	}

	public String getLstCustName() {
		return this.lstCustName;
	}

	public void setLstCustName(String lstCustName) {
		this.lstCustName = lstCustName;
	}

	public Integer getLstCustManagerId() {
		return this.lstCustManagerId;
	}

	public void setLstCustManagerId(Integer lstCustManagerId) {
		this.lstCustManagerId = lstCustManagerId;
	}

	public String getLstCustManagerName() {
		return this.lstCustManagerName;
	}

	public void setLstCustManagerName(String lstCustManagerName) {
		this.lstCustManagerName = lstCustManagerName;
	}

	public Timestamp getLstLastOrderDate() {
		return this.lstLastOrderDate;
	}

	public void setLstLastOrderDate(Timestamp lstLastOrderDate) {
		this.lstLastOrderDate = lstLastOrderDate;
	}

	public Timestamp getLstLostDate() {
		return this.lstLostDate;
	}

	public void setLstLostDate(Timestamp lstLostDate) {
		this.lstLostDate = lstLostDate;
	}

	public String getLstDelay() {
		return this.lstDelay;
	}

	public void setLstDelay(String lstDelay) {
		this.lstDelay = lstDelay;
	}

	public String getLstReason() {
		return this.lstReason;
	}

	public void setLstReason(String lstReason) {
		this.lstReason = lstReason;
	}

	public String getLstStatus() {
		return this.lstStatus;
	}

	public void setLstStatus(String lstStatus) {
		this.lstStatus = lstStatus;
	}

	@Override
	public String toString() {
		return "CstLost [lstCustManagerId=" + lstCustManagerId
				+ ", lstCustManagerName=" + lstCustManagerName
				+ ", lstCustName=" + lstCustName + ", lstCustNo=" + lstCustNo
				+ ", lstDelay=" + lstDelay + ", lstId=" + lstId
				+ ", lstLastOrderDate=" + lstLastOrderDate + ", lstLostDate="
				+ lstLostDate + ", lstReason=" + lstReason + ", lstStatus="
				+ lstStatus + "]";
	}
	
	
	
}