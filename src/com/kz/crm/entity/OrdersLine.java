package com.kz.crm.entity;

/**
 * OrdersLine entity. @author MyEclipse Persistence Tools
 */

public class OrdersLine implements java.io.Serializable {

	// Fields

	private Integer oddId;
	private Integer oddOrderId;
	private Integer oddProdId;
	private Integer oddCount;
	private String oddUnit;
	private Integer oddPrice;

	// Constructors

	/** default constructor */
	public OrdersLine() {
	}

	/** minimal constructor */
	public OrdersLine(Integer oddId, Integer oddOrderId, Integer oddProdId,
			Integer oddCount) {
		this.oddId = oddId;
		this.oddOrderId = oddOrderId;
		this.oddProdId = oddProdId;
		this.oddCount = oddCount;
	}

	/** full constructor */
	public OrdersLine(Integer oddId, Integer oddOrderId, Integer oddProdId,
			Integer oddCount, String oddUnit, Integer oddPrice) {
		this.oddId = oddId;
		this.oddOrderId = oddOrderId;
		this.oddProdId = oddProdId;
		this.oddCount = oddCount;
		this.oddUnit = oddUnit;
		this.oddPrice = oddPrice;
	}

	// Property accessors

	public Integer getOddId() {
		return this.oddId;
	}

	public void setOddId(Integer oddId) {
		this.oddId = oddId;
	}

	public Integer getOddOrderId() {
		return this.oddOrderId;
	}

	public void setOddOrderId(Integer oddOrderId) {
		this.oddOrderId = oddOrderId;
	}

	public Integer getOddProdId() {
		return this.oddProdId;
	}

	public void setOddProdId(Integer oddProdId) {
		this.oddProdId = oddProdId;
	}

	public Integer getOddCount() {
		return this.oddCount;
	}

	public void setOddCount(Integer oddCount) {
		this.oddCount = oddCount;
	}

	public String getOddUnit() {
		return this.oddUnit;
	}

	public void setOddUnit(String oddUnit) {
		this.oddUnit = oddUnit;
	}

	public Integer getOddPrice() {
		return this.oddPrice;
	}

	public void setOddPrice(Integer oddPrice) {
		this.oddPrice = oddPrice;
	}

}