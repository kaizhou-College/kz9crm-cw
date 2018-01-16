package com.kz.crm.entity;

public class PageParam {
	private int pageIndex;
	private int pageSize;
	private String pageUrl;
	private int pageMax;
	private Long countPlan;
	private int count;
	
	public PageParam() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public PageParam(int pageIndex, int pageSize, String pageUrl, int pageMax,
			Long countPlan, int count) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.pageUrl = pageUrl;
		this.pageMax = pageMax;
		this.countPlan = countPlan;
		this.count = count;
	}


	public PageParam(int pageIndex, int pageSize, String pageUrl, int pageMax,
			Long countPlan) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.pageUrl = pageUrl;
		this.pageMax = pageMax;
		this.countPlan = countPlan;
	}


	public int getPageIndex() {
		return pageIndex;
	}


	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public String getPageUrl() {
		return pageUrl;
	}


	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}


	public int getPageMax() {
		return pageMax;
	}


	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}


	public Long getCountPlan() {
		return countPlan;
	}


	public void setCountPlan(Long countPlan) {
		this.countPlan = countPlan;
	}


	@Override
	public String toString() {
		return "PageParam [count=" + count + ", countPlan=" + countPlan
				+ ", pageIndex=" + pageIndex + ", pageMax=" + pageMax
				+ ", pageSize=" + pageSize + ", pageUrl=" + pageUrl + "]";
	}


}