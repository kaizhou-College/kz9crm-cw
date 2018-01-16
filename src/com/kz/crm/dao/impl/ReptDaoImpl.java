package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.ReptDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLost;
import com.kz.crm.entity.CstService;
import com.kz.crm.entity.Orders;
import com.kz.crm.entity.OrdersLine;


public  class ReptDaoImpl extends HibernateDaoSupport implements ReptDao{

	public List select(Class<CstCustomer> clazz) {
		Session session = this.getSession();
		return session.createCriteria(CstCustomer.class).list();
	}

	public List serSelect(Class<CstService> clazz1) {
		Session session = this.getSession();
		return session.createCriteria(CstService.class).list();
	}

/*	public List lostSelect(Class<CstLost> class3) {
		Session session = this.getSession();
		return session.createCriteria(CstLost.class).list();
	}*/
//分页
	public List byPage(int pageIndex, int pageSize) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstLost.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

	public Long count() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstLost.class);
		//加投影
		createCriteria.setProjection(Projections.count("lstId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}

	public List<OrdersLine> conteSelect() {
		Session session = this.getSession();
		List<OrdersLine> list = session.createCriteria(OrdersLine.class).list();
		System.out.println(list+"?????");
		return list;
	}

	public String queryByIds(Integer oddOrderId) {
		Session session = this.getSession();
		Orders orders = (Orders) session.get(Orders.class, oddOrderId);
		return orders.getOdrCustomer();

	}
	

}
