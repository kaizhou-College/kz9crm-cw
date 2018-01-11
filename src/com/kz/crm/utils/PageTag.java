package com.kz.crm.utils;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PageTag extends SimpleTagSupport{
	private int max;
	private int page;
	private String url;
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		System.out.println("max===="+max+"\t"+page);
		StringBuffer sql=new StringBuffer("<span>");
		sql.append("第<input value="+page+" size='2'/>页/共"+max+"页");
		if (page!=1) {
			sql.append("<a href='"+url+"?page=1'>首页</a>");
			sql.append("<a href='"+url+"?page="+(page-1)+"'>上一页</a>");
		}
		
		if (page!=max) {
			sql.append("<a href='"+url+"?page="+(page+1)+"'>下一页</a>");
			sql.append("<a href='"+url+"?page="+max+"'>尾页</a>");
		}
		sql.append("</span>");
		out.print(sql.toString());
	}
	public int getMax() {
		return max;
	}
	public int getPage() {
		return page;
	}
	public String getUrl() {
		return url;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
