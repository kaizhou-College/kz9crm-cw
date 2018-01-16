package com.kz.crm.tld;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagFY extends SimpleTagSupport{
	private int pageIndex;
	private int pageSize;
	private String pageUrl;
	private int pageMax;
	private int count;
	/*	共${countPlan }条记录 每页${pageSize }条
	第${page }页/${pageMax}共页
		<a href="${pageUrl}?pageIndex=1">第一页</a>
		<a href="${pageUrl}?pageIndex=${page-1}">上一页</a>
		<a href="${pageUrl}?pageIndex=${page+1}">下一页</a>
		<a href="${pageUrl}?pageIndex=${pageMax}">最后一页</a>
	转到<input value="1" size="2" />页
	<button width="20" onclick="reload();">GO</button>*/
	public void doTag() throws JspException, IOException {
	JspWriter out=getJspContext().getOut();
		out.println("共"+count+"条记录 每页"+pageSize+"条第"+pageIndex+"页/"+pageMax+"共页");
		if(pageIndex!=1){
			out.println("<a href='"+pageUrl+"?pageIndex=1'>第一页</a>");
			out.println("<a href='"+pageUrl+"?pageIndex="+(pageIndex-1)+"'>上一页</a>");
		}else{
			out.println("<a href='#'>第一页</a>");
			out.println("<a href='#'>上一页</a>");
		}
		if(pageIndex!=pageMax){
			out.println("<a href='"+pageUrl+"?pageIndex="+(pageIndex+1)+"'>下一页</a>");
			out.println("<a href='"+pageUrl+"?pageIndex="+pageMax+"'>最后一页</a>");
		}else {
			out.println("<a href='#'>下一页</a>");
			out.println("<a href='#'>最后一页</a>");
		}
		//out.println("转到<input id='pageIndex'  size='2' />页<button width='20' onmousedown='formSkip()' onclick='reload();'>GO</button>");
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
