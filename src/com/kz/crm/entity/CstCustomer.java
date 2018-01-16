package com.kz.crm.entity;


import java.util.HashSet;
import java.util.Set;

/**
 * CstCustomer entity. @author MyEclipse Persistence Tools
 */

public class CstCustomer implements java.io.Serializable {
	private String custName;
	private String custRegion;
	private Integer custManagerId;
	private String custManagerName;
	private Integer custLevel;
	private String custLevelLabel;
	private Integer custSatisfy;
	private Integer custCredit;
	private String custAddr;
	private String custZip;
	private String custTel;
	private String custFax;
	private String custWebsite;
	private String custLicenceNo;
	private String custChieftain;
	private Integer custBankroll;
	private String custTurnover;
	private String custBank;
	private String custBankAccount;
	private String custLocalTaxNo;
	private String custNationalTaxNo;
	private String custStatus;

	//一个客户信息管理对应多个联系人(一对多)
	private Set<CstLinkman> cstlinkman=new HashSet<CstLinkman>();
	private Set<Orders> orders = new HashSet<Orders>();
	// Fields

	private String custNo;
	
	@Override
	public String toString() {
		return "CstCustomer [custAddr=" + custAddr + ", custBank=" + custBank
				+ ", custBankAccount=" + custBankAccount + ", custBankroll="
				+ custBankroll + ", custChieftain=" + custChieftain
				+ ", custCredit=" + custCredit + ", custFax=" + custFax
				+ ", custLevel=" + custLevel + ", custLevelLabel="
				+ custLevelLabel + ", custLicenceNo=" + custLicenceNo
				+ ", custLocalTaxNo=" + custLocalTaxNo + ", custManagerId="
				+ custManagerId + ", custManagerName=" + custManagerName
				+ ", custName=" + custName + ", custNationalTaxNo="
				+ custNationalTaxNo + ", custNo=" + custNo + ", custRegion="
				+ custRegion + ", custSatisfy=" + custSatisfy + ", custStatus="
				+ custStatus + ", custTel=" + custTel + ", custTurnover="
				+ custTurnover + ", custWebsite=" + custWebsite + ", custZip="
				+ custZip + "]";
	}




	public Set<Orders> getOrders() {
		return orders;
	}




	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}




	/** full constructor */
	// Property accessors

	public String getCustNo() {
		return this.custNo;
	}

	public Set<CstLinkman> getCstlinkman() {
		return cstlinkman;
	}

	public void setCstlinkman(Set<CstLinkman> cstlinkman) {
		this.cstlinkman = cstlinkman;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustRegion() {
		return this.custRegion;
	}

	public void setCustRegion(String custRegion) {
		this.custRegion = custRegion;
	}

	public Integer getCustManagerId() {
		return this.custManagerId;
	}

	public void setCustManagerId(Integer custManagerId) {
		this.custManagerId = custManagerId;
	}

	public String getCustManagerName() {
		return this.custManagerName;
	}

	public void setCustManagerName(String custManagerName) {
		this.custManagerName = custManagerName;
	}

	public Integer getCustLevel() {
		return this.custLevel;
	}

	public void setCustLevel(Integer custLevel) {
		this.custLevel = custLevel;
	}

	public String getCustLevelLabel() {
		return this.custLevelLabel;
	}

	public void setCustLevelLabel(String custLevelLabel) {
		this.custLevelLabel = custLevelLabel;
	}

	public Integer getCustSatisfy() {
		return this.custSatisfy;
	}

	public void setCustSatisfy(Integer custSatisfy) {
		this.custSatisfy = custSatisfy;
	}

	public Integer getCustCredit() {
		return this.custCredit;
	}

	public void setCustCredit(Integer custCredit) {
		this.custCredit = custCredit;
	}

	public String getCustAddr() {
		return this.custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	public String getCustZip() {
		return this.custZip;
	}

	public void setCustZip(String custZip) {
		this.custZip = custZip;
	}

	public String getCustTel() {
		return this.custTel;
	}

	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}

	public String getCustFax() {
		return this.custFax;
	}

	public void setCustFax(String custFax) {
		this.custFax = custFax;
	}

	public String getCustWebsite() {
		return this.custWebsite;
	}

	public void setCustWebsite(String custWebsite) {
		this.custWebsite = custWebsite;
	}

	public String getCustLicenceNo() {
		return this.custLicenceNo;
	}

	public void setCustLicenceNo(String custLicenceNo) {
		this.custLicenceNo = custLicenceNo;
	}

	public String getCustChieftain() {
		return this.custChieftain;
	}

	public void setCustChieftain(String custChieftain) {
		this.custChieftain = custChieftain;
	}

	public Integer getCustBankroll() {
		return this.custBankroll;
	}

	public void setCustBankroll(Integer custBankroll) {
		this.custBankroll = custBankroll;
	}

	public String getCustTurnover() {
		return this.custTurnover;
	}

	public void setCustTurnover(String custTurnover) {
		this.custTurnover = custTurnover;
	}

	public String getCustBank() {
		return this.custBank;
	}

	public void setCustBank(String custBank) {
		this.custBank = custBank;
	}

	public String getCustBankAccount() {
		return this.custBankAccount;
	}

	public void setCustBankAccount(String custBankAccount) {
		this.custBankAccount = custBankAccount;
	}

	public String getCustLocalTaxNo() {
		return this.custLocalTaxNo;
	}

	public void setCustLocalTaxNo(String custLocalTaxNo) {
		this.custLocalTaxNo = custLocalTaxNo;
	}

	public String getCustNationalTaxNo() {
		return this.custNationalTaxNo;
	}

	public void setCustNationalTaxNo(String custNationalTaxNo) {
		this.custNationalTaxNo = custNationalTaxNo;
	}

	public String getCustStatus() {
		return this.custStatus;
	}

	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}




	public CstCustomer(String custName, String custRegion,
			Integer custManagerId, String custManagerName, Integer custLevel,
			String custLevelLabel, Integer custSatisfy, Integer custCredit,
			String custAddr, String custZip, String custTel, String custFax,
			String custWebsite, String custLicenceNo, String custChieftain,
			Integer custBankroll, String custTurnover, String custBank,
			String custBankAccount, String custLocalTaxNo,
			String custNationalTaxNo, String custStatus, String custNo) {
		super();
		this.custName = custName;
		this.custRegion = custRegion;
		this.custManagerId = custManagerId;
		this.custManagerName = custManagerName;
		this.custLevel = custLevel;
		this.custLevelLabel = custLevelLabel;
		this.custSatisfy = custSatisfy;
		this.custCredit = custCredit;
		this.custAddr = custAddr;
		this.custZip = custZip;
		this.custTel = custTel;
		this.custFax = custFax;
		this.custWebsite = custWebsite;
		this.custLicenceNo = custLicenceNo;
		this.custChieftain = custChieftain;
		this.custBankroll = custBankroll;
		this.custTurnover = custTurnover;
		this.custBank = custBank;
		this.custBankAccount = custBankAccount;
		this.custLocalTaxNo = custLocalTaxNo;
		this.custNationalTaxNo = custNationalTaxNo;
		this.custStatus = custStatus;
		this.custNo = custNo;
	}




	public CstCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}