package com.kz.crm.entity;

public class PlanDimList {
	private String name;
	private String gy;
	private String lxr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGy() {
		return gy;
	}
	public void setGy(String gy) {
		this.gy = gy;
	}
	public String getLxr() {
		return lxr;
	}
	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	public PlanDimList(String name, String gy, String lxr) {
		super();
		this.name = name;
		this.gy = gy;
		this.lxr = lxr;
	}
	public PlanDimList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PlanDimList [gy=" + gy + ", lxr=" + lxr + ", name=" + name
				+ "]";
	}
	
	
	
}
