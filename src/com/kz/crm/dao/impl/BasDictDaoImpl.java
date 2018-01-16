package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.BasDictDao;
import com.kz.crm.entity.BasDict;
import com.kz.crm.entity.CstLost;

public class BasDictDaoImpl extends HibernateDaoSupport implements BasDictDao {

	@Override
	public List<BasDict> queryAll() {
		Session session = this.getSession();
		String hql = "from BasDict";
		List<BasDict> list = session.createQuery(hql).list();
		return list;
	}

	@Override
	public void delete(BasDict db) {
		Session session = this.getSession();
		session.delete(session.get(BasDict.class, db.getDictId()));
	}

	@Override
	public void update(BasDict db) {
		Session session = this.getSession();
		session.update(db);
	}

	@Override
	public BasDict SelById(int id) {
		Session session = this.getSession();
		BasDict object = (BasDict) session.get(BasDict.class, id);
		return object;
	}

	@Override
	public long count() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(BasDict.class);
		//加投影
		createCriteria.setProjection(Projections.count("dictId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}
	
	@Override
	public List byPage(int pageIndex, int pageSize) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(BasDict.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

	@Override
	public void add(BasDict db) {
		Session session = this.getSession();
		session.save(db);
	}
}
