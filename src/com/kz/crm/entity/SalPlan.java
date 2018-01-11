package com.kz.crm.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class SalPlan implements java.io.Serializable {

	// Fields

	@Id
	@GeneratedValue
	private Integer plaId;
	private Integer plaChcId;

	//private Integer plaChcId;
	private SalChance salChance;

	private Date plaDate;
	private String plaTodo;
	private String plaResult;

	// Constructors

	/** default constructor */
	public SalPlan() {
	}

	/** minimal constructor */

	public SalPlan(Integer plaId, Integer plaChcId, Date plaDate, String plaTodo) {
		this.plaId = plaId;
		this.plaChcId = plaChcId;
	}

	public SalPlan( Date plaDate, String plaTodo) {

		this.plaDate = plaDate;
		this.plaTodo = plaTodo;
	}

	public SalPlan(Date plaDate, String plaTodo,
			String plaResult) {
		this.plaDate = plaDate;
		this.plaTodo = plaTodo;
		this.plaResult = plaResult;
	}

	// Property accessors

	public Integer getPlaId() {
		return this.plaId;
	}

	public void setPlaId(Integer plaId) {
		this.plaId = plaId;
	}

	public Integer getPlaChcId() {
		return this.plaChcId;
	}

	public void setPlaChcId(Integer plaChcId) {
		this.plaChcId = plaChcId;
	}

	public SalChance getSalChance() {
		return salChance;
	}

	public void setSalChance(SalChance salChance) {
		this.salChance = salChance;
	}

	public Date getPlaDate() {
		return this.plaDate;
	}

	public void setPlaDate(Date plaDate) {
		this.plaDate = plaDate;
	}

	public String getPlaTodo() {
		return this.plaTodo;
	}

	public void setPlaTodo(String plaTodo) {
		this.plaTodo = plaTodo;
	}

	public String getPlaResult() {
		return this.plaResult;
	}

	public void setPlaResult(String plaResult) {
		this.plaResult = plaResult;
	}

	@Override
	public String toString() {
		return "SalPlan [plaDate=" + plaDate + ", plaId=" + plaId
				+ ", plaResult=" + plaResult + ", plaTodo=" + plaTodo + "]";
	}

}