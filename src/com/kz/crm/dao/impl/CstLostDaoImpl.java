package com.kz.crm.dao.impl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.CstLostDao;
import com.kz.crm.entity.CstActivity;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLost;
import com.kz.crm.entity.Orders;


public class CstLostDaoImpl extends HibernateDaoSupport implements CstLostDao {

	@Override
	public List<CstLost> selByPage(int page,int index) {
		Session session = this.getSession();
		List<CstLost> list = session.createQuery("from CstLost").setFirstResult((index-1)*page).setMaxResults(page).list();
		return list;
	}	

	@Override
	public CstLost selById(int id) {
		Session session = this.getSession();
		CstLost object = (CstLost) session.get(CstLost.class, id);
		return object;
	}

	@Override
	public void update(CstLost cstl) {
		Session session = this.getSession();
		CstLost object = (CstLost) session.get(CstLost.class, cstl.getLstId());
		String reason = cstl.getLstReason();
		object.setLstReason(reason);
		session.update(object);
	}
	
	@Override
	public void updateT(CstLost cstl) {
		Session session = this.getSession();
		CstLost object = (CstLost) session.get(CstLost.class, cstl.getLstId());
		object.setLstDelay(cstl.getLstDelay());
		System.out.println(object+"---------------------------------");
		session.update(object);
	}
//	private String lstCustNo;
//	private String lstCustName;
//	private Integer lstCustManagerId;
//	private String lstCustManagerName;
//	private Timestamp lstLastOrderDate;
//	private Timestamp lstLostDate;
//	private String lstDelay;
//	private String lstReason;
//	private String lstStatus;
	@Override
	public void add(CstLost cstl) {
		Session session = this.getSession();
		session.save(cstl);
	}
	
	public List<CstLost> checkOutTime(){
		Session session = this.getSession();
		String hql1 = "from Orders where months_between(sysdate,odrDate) > 6 ";
		String hql2 = "from CstCustomer where custName=?";
		List<Orders> list1 = session.createQuery(hql1).list();
		List<CstCustomer> list2 = new ArrayList<CstCustomer>();
		List<CstLost> list3 = new ArrayList<CstLost>();
		for(int i =0;i<list1.size();i++){
			CstLost cl = new CstLost();
			System.out.println(1);
			list2 = session.createQuery(hql2).setParameter(0, list1.get(i).getOdrCustomer()).list();
			cl.setLstCustManagerId(list2.get(i).getCustManagerId());
			cl.setLstCustManagerName(list2.get(i).getCustManagerName());
			cl.setLstCustName(list2.get(i).getCustName());
			cl.setLstStatus(list2.get(i).getCustStatus());
			cl.setLstDelay("ÔÝÎÞ");
			cl.setLstLastOrderDate(list1.get(i).getOdrDate());
			cl.setLstCustNo(list2.get(i).getCustNo());
			list3.add(cl);
		}
		return list3;
	}
}
