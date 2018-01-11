package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.SalChanceDao;
import com.kz.crm.entity.SalChance;

public class SalChanceDaoImpl extends HibernateDaoSupport implements SalChanceDao {
	
	public List<SalChance> findByPage(int page, int pageSize) {
		Session session = this.getSession();
		int start=(page-1)*pageSize;
		List<SalChance> list = session.createCriteria(SalChance.class).setFirstResult(start).setMaxResults(pageSize).list();
		return list;
	}
	//非空判断
	public Boolean contextIsNull(String context){
		if(context!=null&&context.trim().length()>0){
			return true;
		}else{
			return false;
		}
	}
	public List<SalChance> findByGaoJi(int page,int pageSize, SalChance salChance) {
		Session session = this.getSession();
		Criteria criteria = session.createCriteria(SalChance.class);
		if(contextIsNull(salChance.getChcCustName())){
			criteria.add(Restrictions.eq("chcCustName", salChance.getChcCustName()));
		}
		if(contextIsNull(salChance.getChcTitle())){
			criteria.add(Restrictions.like("chcTitle", "%"+salChance.getChcTitle()+"%"));
		}
		if(contextIsNull(salChance.getChcLinkman())){
			criteria.add(Restrictions.eq("chcLinkman", salChance.getChcLinkman()));
		}
		int start=(page-1)*pageSize;
		criteria.setFirstResult(start);
		criteria.setMaxResults(pageSize);
		List<SalChance> list = criteria.list();
		//System.out.println(list+"发");
		return list;
	}
	//高级查询共有多少条
	public int queryCountByGaoJi(SalChance salChance) {
		Session session = this.getSession();
		Criteria criteria = session.createCriteria(SalChance.class);
		if(contextIsNull(salChance.getChcCustName())){
			criteria.add(Restrictions.eq("chcCustName", salChance.getChcCustName()));
		}
		if(contextIsNull(salChance.getChcTitle())){
			criteria.add(Restrictions.like("chcTitle", "%"+salChance.getChcTitle()+"%"));
		}
		if(contextIsNull(salChance.getChcLinkman())){
			criteria.add(Restrictions.eq("chcLinkman", salChance.getChcLinkman()));
		}
		int size = criteria.list().size();
		//System.out.println(size+"没用的");
		return size;
	}
	//查询最大页
	public int queryMaxByGaoJi(int pageSize,SalChance salChance) {
		Session session = this.getSession();
		int size = queryCountByGaoJi(salChance);
		int max=(size-1)/pageSize+1;
		
		return max;
	}
	//查询共有多少条
	public int queryCount() {
		Session session = this.getSession();
		int size = session.createCriteria(SalChance.class).list().size();
		
		//System.out.println(size+"是的");
		return size;
	}
	//查询最大页
	public int queryMax(int pageSize) {
		Session session = this.getSession();
		//共有多少条
		//System.out.println(pageSize+"共有");
		int size = session.createCriteria(SalChance.class).list().size();
		//最大页
		int max=(size-1)/pageSize+1;
		
		return max;
	}
	//删除
	public void del(Integer chcId) {
		Session session = this.getSession();
		SalChance salChance = (SalChance) session.get(SalChance.class, chcId);
		session.delete(salChance);
		
	}
	//指派根据id查询
	public SalChance queryDis(Integer chcId) {
		Session session = this.getSession();
		SalChance salChance = (SalChance) session.get(SalChance.class, chcId);
		return salChance;
		
	}

}
