package com.kz.crm.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.dao.PlanDao;
import com.kz.crm.dao.impl.PlanDaoImpl;
import com.kz.crm.entity.PlanDimList;
import com.kz.crm.entity.SalChance;
import com.kz.crm.entity.SalPlan;
import com.kz.crm.service.PlanBiz;

@Controller
@Scope("prototype")
public class PlanAction {
	@Autowired
	private PlanBiz planBiz;
	
	private PlanDimList pdl;
	private SalChance sc;
	private SalPlan salplan;
	private List<SalChance> byPage;
	private Long countPlan;//一共多少条数据
	private int pageIndex;//传进来的从第几有开始
	private int pageSize;//传进来的最大页数
	private String pageUrl;//传进来的路径
	private int pageMax;//最大页数
	private int page;//初始页数
	private SalChance planList;//Chance对象
	
	
	//修改   机会开发成功就添加到客户管理里面
	public String planSuccess(){
		planBiz.planSuccessUpdate(sc);
		return "planSuccess";
	}
	
	//执行计划时的结果
	public String planResult(){
		planBiz.planResultUpdate(salplan);
		return "planResult";
	}
	
	//执行计划时显示
	public String planExecuteList(){
		planList = planBiz.planList(sc.getChcId());
		return "planExecuteList";
	}
	
	
	//删除一个计划
	public String planDelete(){
		planBiz.planDelete(salplan);
		return "planDelete";
	}
	
	//添加计划
	public String planAdd(){
		System.out.println("jraction");
		System.out.println(sc);
		System.out.println(salplan);
		planBiz.planAdd(sc, salplan);
		return "planAdd";
	}
	//plan保存
	public void  ajaxPlanUpdate(){
		planBiz.planUpdate(salplan);
	}
	
	//正在开放中的机会显示
	public String planListBeing(){
		planList = planBiz.planList(sc.getChcId());
		return "planListBeing";
	}
	
	
	
	// 已经开放成功了的机会  显示
	public String planList(){
		planList = planBiz.planList(sc.getChcId());
		
		return "planList";
	}
	
	
	
	
	
	//plan分页查询
	public String byPage(){
		if(pdl==null){
			pdl=new PlanDimList(" "," "," ");
		}
		pageUrl="plan_byPage";//給页面赋值
		
		page=1;//初始页面
		pageSize=3;//每页显示的页数
	
		if(pageIndex>1){//当点上下也的时候然后pageIndex》1就用pageIndex的页数   否则就用初始页数1
			page=pageIndex;
		}
		countPlan = planBiz.countPlan();//查找所有数据的条数
		
		int max=new Long(countPlan).intValue();
		pageMax=((max-1)/pageSize)+1;
		
		byPage = planBiz.byPage(page, pageSize);
		return "byPage";
	}
	
	
	
	//plan高级查询
	public String  ajaxPlanDim(){
		if(pdl==null){
			pdl=new PlanDimList();
		}
		
		pageUrl="plan_ajaxPlanDim";//給页面赋值
		page=1;//初始页面
		pageSize=3;//每页显示的页数
	
		if(pageIndex>1){//当点上下也的时候然后pageIndex》1就用pageIndex的页数   否则就用初始页数1
			page=pageIndex;
		}
		countPlan = planBiz.countPlanList(pdl);//查找所有数据的条数
		int max=new Long(countPlan).intValue();
		pageMax=((max-1)/pageSize)+1;
		
		byPage = planBiz.byPageDim(pdl,page, pageSize);
		return "ajaxPlanDim";
	}


	public List<SalChance> getByPage() {
		return byPage;
	}



	public void setByPage(List<SalChance> byPage) {
		this.byPage = byPage;
	}



	public Long getCountPlan() {
		return countPlan;
	}
	public void setCountPlan(Long countPlan) {
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public PlanDimList getPdl() {
		return pdl;
	}
	public void setPdl(PlanDimList pdl) {
		this.pdl = pdl;
	}




	public SalChance getPlanList() {
		return planList;
	}




	public void setPlanList(SalChance planList) {
		this.planList = planList;
	}




	public SalChance getSc() {
		return sc;
	}




	public void setSc(SalChance sc) {
		this.sc = sc;
	}

	public SalPlan getSalplan() {
		return salplan;
	}

	public void setSalplan(SalPlan salplan) {
		this.salplan = salplan;
	}

	
	
}
