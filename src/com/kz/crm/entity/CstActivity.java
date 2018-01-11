package com.kz.crm.entity;
// default package

import java.sql.Timestamp;

/**
 * CstActivity entity. @author MyEclipse Persistence Tools
 */

public class CstActivity implements java.io.Serializable {

	// Fields

	private Integer atvId;
	private String atvCustNo;
	private String atvCustName;
	private Timestamp atvDate;
	private String atvPlace;
	private String atvTitle;
	private String atvDesc;

	// Constructors

	/** default constructor */
	public CstActivity() {
	}

	/** minimal constructor */
	public CstActivity(Integer atvId, String atvCustNo, Timestamp atvDate,
			String atvPlace, String atvTitle) {
		this.atvId = atvId;
		this.atvCustNo = atvCustNo;
		this.atvDate = atvDate;
		this.atvPlace = atvPlace;
		this.atvTitle = atvTitle;
	}

	/** full constructor */
	public CstActivity(Integer atvId, String atvCustNo, String atvCustName,
			Timestamp atvDate, String atvPlace, String atvTitle, String atvDesc) {
		this.atvId = atvId;
		this.atvCustNo = atvCustNo;
		this.atvCustName = atvCustName;
		this.atvDate = atvDate;
		this.atvPlace = atvPlace;
		this.atvTitle = atvTitle;
		this.atvDesc = atvDesc;
	}

	// Property accessors

	public Integer getAtvId() {
		return this.atvId;
	}

	public void setAtvId(Integer atvId) {
		this.atvId = atvId;
	}

	public String getAtvCustNo() {
		return this.atvCustNo;
	}

	public void setAtvCustNo(String atvCustNo) {
		this.atvCustNo = atvCustNo;
	}

	public String getAtvCustName() {
		return this.atvCustName;
	}

	public void setAtvCustName(String atvCustName) {
		this.atvCustName = atvCustName;
	}

	public Timestamp getAtvDate() {
		return this.atvDate;
	}

	public void setAtvDate(Timestamp atvDate) {
		this.atvDate = atvDate;
	}

	public String getAtvPlace() {
		return this.atvPlace;
	}

	public void setAtvPlace(String atvPlace) {
		this.atvPlace = atvPlace;
	}

	public String getAtvTitle() {
		return this.atvTitle;
	}

	public void setAtvTitle(String atvTitle) {
		this.atvTitle = atvTitle;
	}

	public String getAtvDesc() {
		return this.atvDesc;
	}

	public void setAtvDesc(String atvDesc) {
		this.atvDesc = atvDesc;
	}

	@Override
	public String toString() {
		return "CstActivity [atvCustName=" + atvCustName + ", atvCustNo="
				+ atvCustNo + ", atvDate=" + atvDate + ", atvDesc=" + atvDesc
				+ ", atvId=" + atvId + ", atvPlace=" + atvPlace + ", atvTitle="
				+ atvTitle + "]";
	}
}