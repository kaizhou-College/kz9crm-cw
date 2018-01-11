package com.kz.crm.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.CstCustomerDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;
import com.kz.crm.entity.SalChance;

public class CstCustomerDaoImpl extends HibernateDaoSupport implements CstCustomerDao {
	//分页查询
	public List<CstCustomer> findByPage(int page, int pageSize) {
		Session session = this.getSession();
		int start=(page-1)*pageSize;
		List<CstCustomer> list = session.createCriteria(CstCustomer.class).setFirstResult(start).setMaxResults(pageSize).list();
		return list;
		
	}

	//查询共有多少条
	public int queryCount() {
		Session session = this.getSession();
		int size = session.createCriteria(CstCustomer.class).list().size();
		
		//System.out.println(size+"是的");
		return size;
	}
	//查询最大页
	public int queryMax(int pageSize) {
		Session session = this.getSession();
		//共有多少条
		//System.out.println(pageSize+"共有");
		int size = session.createCriteria(CstCustomer.class).list().size();
		//最大页
		int max=(size-1)/pageSize+1;
		
		return max;
	}
	//非空判断
	public Boolean contextIsNull(String context){
		if(context!=null&&context.trim().length()>0){
			return true;
		}else{
			return false;
		}
	}
	public List<CstCustomer> findByGaoJi(int page, int pageSize,CstCustomer cstCustomer) {
		Session session = this.getSession();
		Criteria criteria = session.createCriteria(CstCustomer.class);
		//客户编号
		if(contextIsNull(cstCustomer.getCustNo())){
			criteria.add(Restrictions.eq("custNo", cstCustomer.getCustNo()));
		}
		//客户名称
		if(contextIsNull(cstCustomer.getCustName())){
			criteria.add(Restrictions.eq("custName", cstCustomer.getCustName()));
		}
		//地区
		if(contextIsNull(cstCustomer.getCustRegion())){
			if(!cstCustomer.getCustRegion().equals("-1")){
				criteria.add(Restrictions.eq("custRegion", cstCustomer.getCustRegion()));
			}
			
		}
		//客户经理
		if(contextIsNull(cstCustomer.getCustManagerName())){
			criteria.add(Restrictions.eq("custManagerName", cstCustomer.getCustManagerName()));
		}
		//客户等级
		if(contextIsNull(cstCustomer.getCustLevelLabel())){
			if(!cstCustomer.getCustLevelLabel().equals("-1")){
				criteria.add(Restrictions.eq("custLevelLabel", cstCustomer.getCustLevelLabel()));
			}
		}
		int start=(page-1)*pageSize;
		criteria.setFirstResult(start);
		criteria.setMaxResults(pageSize);
		List<CstCustomer> list = criteria.list();
		System.out.println(list+"发");
		return list;
	}

	public int queryCountByGaoJi(CstCustomer cstCustomer) {
		Session session = this.getSession();
		Criteria criteria = session.createCriteria(CstCustomer.class);
		//客户编号
		if(contextIsNull(cstCustomer.getCustNo())){
			criteria.add(Restrictions.eq("custNo", cstCustomer.getCustNo()));
		}
		//客户名称
		if(contextIsNull(cstCustomer.getCustName())){
			criteria.add(Restrictions.eq("custName", cstCustomer.getCustName()));
		}
		//地区
		if(contextIsNull(cstCustomer.getCustRegion())){
			if(!cstCustomer.getCustRegion().equals("-1")){
				criteria.add(Restrictions.eq("custRegion", cstCustomer.getCustRegion()));
			}
			
		}
		//客户经理
		if(contextIsNull(cstCustomer.getCustManagerName())){
			criteria.add(Restrictions.eq("custManagerName", cstCustomer.getCustManagerName()));
		}
		//客户等级
		if(contextIsNull(cstCustomer.getCustLevelLabel())){
			if(!cstCustomer.getCustLevelLabel().equals("-1")){
				criteria.add(Restrictions.eq("custLevelLabel", cstCustomer.getCustLevelLabel()));
			}
		}
		int size = criteria.list().size();
		//System.out.println(size+"共有");
		return size;
	}

	public int queryMaxByGaoJi(int pageSize, CstCustomer cstCustomer) {
		Session session = this.getSession();
		int size = queryCountByGaoJi(cstCustomer);
		int max=(size-1)/pageSize+1;
		System.out.println("最大页"+max);
		return max;
	}
	//删除
	public void del(String custNo) {
		//System.out.println(custNo+"编号");
		Session session = this.getSession();
		CstCustomer cstCustomer = (CstCustomer) session.get(CstCustomer.class, custNo);
		//System.out.println(cstCustomer+"删除的数据");
		session.delete(cstCustomer);
		
	}
	//根据id查询
	public CstCustomer select(String custNo) {
		Session session = this.getSession();
		CstCustomer cstCustomer = (CstCustomer) session.get(CstCustomer.class, custNo);
		//System.out.println(cstCustomer+"edit编辑的数据");
		return cstCustomer;
		
	}
	//更新
	public void update(CstCustomer cstCustomer) {
		Session session = this.getSession();
		session.update(cstCustomer);
		
	}
}
