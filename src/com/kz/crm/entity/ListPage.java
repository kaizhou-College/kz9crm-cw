package com.kz.crm.entity;
//分页呀用到的
public class ListPage {
	private int pageIndex;
	private int pageSize;
	private String pageUrl;
	private int pageMax;
	private long count;
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
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "ListPage [count=" + count + ", pageIndex=" + pageIndex
				+ ", pageMax=" + pageMax + ", pageSize=" + pageSize
				+ ", pageUrl=" + pageUrl + "]";
	}
}
