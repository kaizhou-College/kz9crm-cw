package com.kz.crm.entity;

public class CustomerDimPaeam {
	private String  id;
	private String name;
	private String region;
	private String level;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	public CustomerDimPaeam(String id, String name, String region, String level) {
		super();
		this.id = id;
		this.name = name;
		this.region = region;
		this.level = level;
	}
	public CustomerDimPaeam() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerDimPaeam [id=" + id + ", level=" + level + ", name="
				+ name + ", region=" + region + "]";
	}
	
	
	
}
