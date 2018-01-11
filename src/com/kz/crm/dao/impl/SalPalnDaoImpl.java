package com.kz.crm.dao.impl;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.SalPalnDao;
import com.kz.crm.entity.SalPlan;

public class SalPalnDaoImpl extends HibernateDaoSupport implements SalPalnDao {
	@Override
	public void save(SalPlan salplan) {
		Session session = this.getSession();
		session.save(salplan);
	}
}
