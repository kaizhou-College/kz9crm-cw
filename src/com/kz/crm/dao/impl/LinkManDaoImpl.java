package com.kz.crm.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.LinkManDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;

public class LinkManDaoImpl extends HibernateDaoSupport implements LinkManDao {
	//根据id查询,在客户里面找到联系人信息
	public Set<CstLinkman> select(String lkmcustNo) {
		Session session = this.getSession();
		CstCustomer cstCustomer = (CstCustomer) session.get(CstCustomer.class, lkmcustNo);
		//System.out.println("客户自己的数据"+cstCustomer);
		Set<CstLinkman> cstlinkman = cstCustomer.getCstlinkman();
		//System.out.println("客户对应的cstlinkman的数据"+cstlinkman);
		return cstlinkman;
		
	}
	//新增
	public void save(CstLinkman cstLinkman) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		CstCustomer cstCustomer = (CstCustomer) session.get(CstCustomer.class, cstLinkman.getCstCustomer().getCustNo());
		cstCustomer.getCstlinkman().add(cstLinkman);
		cstLinkman.setCstCustomer(cstCustomer);
	}
	
}
