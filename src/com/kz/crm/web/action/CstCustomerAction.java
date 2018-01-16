package com.kz.crm.web.action;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;
import com.kz.crm.entity.CustomerDimPaeam;
import com.kz.crm.entity.PageParam;
import com.kz.crm.service.CstCustomerService;
import com.kz.crm.service.CustomerBiz;
import com.kz.crm.service.LinkManService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class CstCustomerAction extends ActionSupport{
	@Autowired
	private CstCustomerService ccservice;
	@Autowired
	private LinkManService linkmanservice;
	
	private List<CstCustomer> customers ;
	private CstCustomer cstCustomer;
	private Set<CstLinkman> cstLinkman;
	//客户管理的总条数，最大多少页，当前页，每页放多少条
	private int count;
	private int max;
	private int page;
	private int pageSize;
	
	
	@Autowired
	private CustomerBiz coustomerBiz;
	
	//分页 上下跳  时会使用的数据
	private   PageParam byPage;

	//分页的初始数据   当前页面与每也显示的条数
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=3;
	//分頁跳過去的list
	private List byPageCustomerDao;
	
	private CstCustomer cus;
	
	
	//高级查询时的数据
	private CustomerDimPaeam cdp;
	//新增
	public String customerDimList(){
		System.out.println("进入高级查询");
		System.out.println(cdp);
		byPageCustomerDao=coustomerBiz.cutomerDimList(cdp);
		return "customerDimList";
	}
	
	//编辑
	public String customerUpdate(){
		System.out.println(cus);
		coustomerBiz.customerUpdate(cus);
		return "customerUpdate";
	}
	
	//编辑时的显示
	public String customerUpdateList(){
		System.out.println(cus);
		cus = coustomerBiz.listSingle(cus);
		return "customerUpdateList";
	} 
	
	
	//刪除  
	public String customerDelete(){
		System.out.println(cus.getCustNo());
		coustomerBiz.customerDelete(cus);
		return "customerDelete";
	}
	
	public void update(){
		//System.out.println("进入了save方法的action里面"+cstCustomer);
		ccservice.update(cstCustomer);
		
	}
	public String edit(){
		System.out.println("进入了ACTION"+cstCustomer.getCustNo());
		cstCustomer = ccservice.select(cstCustomer.getCustNo());
		
		return "edit_success";
	}
	
	//分頁
	public String customerList(){
		//如果byPage没有初始化就给它设置一个当前页面
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(PAGE_CUSTOMER_INDEX);
		}
		//设置每页显示的数据
		byPage.setPageSize(PAGE_CUSTOMER_SIZE);
		//设置上下页跳的路径
		byPage.setPageUrl("customer_customerList");
		//设置一共有多少条数据
		byPage.setCountPlan(coustomerBiz.countCustomer());
		
		//设置一共有多少页
		int max=new Long(byPage.getCountPlan()).intValue();//long转int 
		byPage.setPageMax(((max-1)/byPage.getPageSize())+1);//算出一共有多少页
		
		byPageCustomerDao = coustomerBiz.byPageCustomerDao(byPage.getPageIndex(), byPage.getPageSize());
		System.out.println(byPageCustomerDao);
		return "customerList";
	}
	
	public String linkman(){
		//这句代码可删除
		System.out.println("二点才下班"+cstCustomer.getCustNo());
		cstCustomer = ccservice.select(cstCustomer.getCustNo());
		cstLinkman = linkmanservice.select(cstCustomer.getCustNo());
		System.out.println("三点才下班"+cstLinkman);
		return "linkman_success";
	}
	public String active(){
		//System.out.println("进入了ACTION"+cstCustomer.getCustNo());
		cstCustomer = ccservice.select(cstCustomer.getCustNo());
		
		return "active_success";
	}
	public String orders(){
		//System.out.println("进入了ACTION"+cstCustomer.getCustNo());
		cstCustomer = ccservice.select(cstCustomer.getCustNo());
		
		return "orders_success";
	}
	
	//分页查询机会数据加高级查询分页
	public String list(){
		System.out.println("进入action");
		if(page==0){
			page=1;
		}
		pageSize=3;
		if(cstCustomer==null){
			customers = ccservice.findByPage(page, pageSize);
			count = ccservice.queryCount();
			max = ccservice.queryMax(pageSize);
			if(customers==null){
				return "list_error";
				
			}
			return "list_success";
		}else{
			//System.out.println(page+"\t page \t"+pageSize+"\t pageSize \t"+cstCustomer);
			customers = ccservice.findByGaoJi(page,pageSize,cstCustomer);
			count = ccservice.queryCountByGaoJi(cstCustomer);
			max = ccservice.queryMaxByGaoJi(pageSize, cstCustomer);
			if(customers==null){
				return "gaolist_error";
				
			}
			return "gaolist_success";
			
			
		}
	
	}
	//删除
	public String delcust(){
		//System.out.println(cstCustomer.getCustNo()+"这是id");
		ccservice.del(cstCustomer.getCustNo());
		return "delcust_success";
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
	public PageParam getByPage() {
		return byPage;
	}

	public void setByPage(PageParam byPage) {
		this.byPage = byPage;
	}


	public List getByPageCustomerDao() {
		return byPageCustomerDao;
	}


	public void setByPageCustomerDao(List byPageCustomerDao) {
		this.byPageCustomerDao = byPageCustomerDao;
	}


	public CstCustomer getCus() {
		return cus;
	}


	public void setCus(CstCustomer cus) {
		this.cus = cus;
	}

	public CustomerDimPaeam getCdp() {
		return cdp;
	}

	public void setCdp(CustomerDimPaeam cdp) {
		this.cdp = cdp;
	}


	public List<CstCustomer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<CstCustomer> customers) {
		this.customers = customers;
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
	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}
	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}
	public Set<CstLinkman> getCstLinkman() {
		return cstLinkman;
	}
	public void setCstLinkman(Set<CstLinkman> cstLinkman) {
		this.cstLinkman = cstLinkman;
	}
}
