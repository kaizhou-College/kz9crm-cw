package com.kz.crm.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;
import com.kz.crm.service.CstCustomerService;
import com.kz.crm.service.LinkManService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class CstLinkManAction extends ActionSupport{
	@Autowired
	private LinkManService linkmanservice;
	@Autowired
	private CstCustomerService ccservice;
	private CstLinkman cstLinkman;
	private CstCustomer cstCustomer;
	public void save(){
		//System.out.println(cstLinkman.getCstCustomer().getCustNo()+"进入了联系人的action");
		linkmanservice.save(cstLinkman);
		
	}
	public String select(){
		//System.out.println(cstCustomer.getCustNo()+"狼");
		cstCustomer = ccservice.select(cstCustomer.getCustNo());
		return "select_success";
	}
	public CstLinkman getCstLinkman() {
		return cstLinkman;
	}
	public void setCstLinkman(CstLinkman cstLinkman) {
		this.cstLinkman = cstLinkman;
	}
	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}
	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}
	
}
