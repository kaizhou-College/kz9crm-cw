package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.SalChance;
import com.kz.crm.service.SalChanceService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class SalChanceAction extends ActionSupport{
	@Autowired
	private SalChanceService salChanceService;
	
	private List<SalChance> chances;
	private SalChance salChance;
	private int page;
	private int pageSize;
	private int count;
	private int max;
	private String str;
	//指派
	public String queryDis(){
		//System.out.println(salChance.getChcId()+"指派");
		salChance = salChanceService.queryDis(salChance.getChcId());
		
		return "queryDis_success";
	}
	public String editQuery(){
		//System.out.println(salChance.getChcId()+"指派");
		salChance = salChanceService.queryDis(salChance.getChcId());
		
		return "editQuery_success";
	}
	
	//新增
	public String add(){
		System.out.println(salChance+"进入action");
		return "add_success";
	}
	//删除
	public String del(){
		//System.out.println("进入了action"+salChance.getChcId());
		salChanceService.del(salChance.getChcId());
		return "del_success";
	}
	
	//分页查询机会数据加高级查询分页
	public String list(){
		if(page==0){
			page=1;
		}
		pageSize=3;
		if(salChance==null){
			chances = salChanceService.findByPage(page, pageSize);
			count = salChanceService.queryCount();
			max = salChanceService.queryMax(pageSize);
			if(chances==null){
				return "list_error";
				
			}
			return "list_success";
			
		}else{
			chances = salChanceService.findByGaoJi(page,pageSize,salChance);
			count = salChanceService.queryCountByGaoJi(salChance);
			max = salChanceService.queryMaxByGaoJi(pageSize, salChance);
			if(chances==null){
				return "gQuery_error";
				
			}
			return "gQuery_success";
			
		}
		
	}
	/*public String list(){
		//System.out.println("进入action中");
		if(page==0){
			page=1;
		}
		pageSize=3;
		chance = salChanceService.findByPage(page, pageSize);
		count = salChanceService.queryCount();
		max = salChanceService.queryMax(pageSize);
		str="list";
		if(chance==null){
			return "list_error";
			
		}
		return "list_success";
	}
	//高级查询
	public String gQuery(){
		//System.out.println("进入action"+salChance);
		if(page==0){
			page=1;
		}
		pageSize=3;
		chance = salChanceService.findByGaoJi(page,pageSize,salChance);
		//System.out.println(chance+"高级查询之后的数据");
		count = salChanceService.queryCountByGaoJi(salChance);
		max = salChanceService.queryMaxByGaoJi(pageSize, salChance);
		str="gQuery";
		if(chance==null){
			return "gQuery_error";
		}
		return "gQuery_success";
	}*/
	public SalChance getSalChance() {
		return salChance;
	}
	public void setSalChance(SalChance salChance) {
		this.salChance = salChance;
	}
	

	public List<SalChance> getChances() {
		return chances;
	}
	public void setChances(List<SalChance> chances) {
		this.chances = chances;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
}
