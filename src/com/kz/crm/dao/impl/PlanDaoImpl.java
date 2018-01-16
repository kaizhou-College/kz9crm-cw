package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.PlanDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.PlanDimList;
import com.kz.crm.entity.SalChance;
import com.kz.crm.entity.SalPlan;

public class PlanDaoImpl extends HibernateDaoSupport implements PlanDao {
	public boolean isNotNuhll(String str){
		boolean num=false;
		if(str.trim().length()>0){
			num=true;
		}
		return num;
	}

	public List byPage(int page, int pageSize) {
		int max=(page-1)*pageSize;//从第几条数据开始  算法
		
		Session session = this.getSession();//
		Criteria createCriteria = session.createCriteria(SalChance.class); //查询 SalChance 表
		
//		createCriteria.createAlias("salPlan","s");
		
		createCriteria.setFirstResult(max);//从第几条数据开始
		
		createCriteria.setMaxResults(pageSize);///每页显示的数据
		
		List list = createCriteria.list();
		return list;
	}
	
	
	
	public Long countPlan() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SalChance.class);
		createCriteria.createAlias("salPlan","s");
		//添加投影
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.count("chcId"));
		//把投影放进去
		createCriteria.setProjection(projectionList);
		List<Long> list = createCriteria.list();
		return list.get(0);
	}	
	
	
	
	public List byPageDim(PlanDimList pdl,int page,int pageSize ){
		int max=(page-1)*pageSize;
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SalPlan.class);
		createCriteria.setProjection(Projections.projectionList().add(Projections.property("salChance.chcId")));
		List list3 = createCriteria.list();
		
		Criteria createCriteria1 = session.createCriteria(SalChance.class);
		createCriteria1.add(Restrictions.in("chcId",list3));
		
		
		if(isNotNuhll(pdl.getName())){
			createCriteria1.add(Restrictions.like("chcCustName","%"+pdl.getName()+"%"));
		}
		if(isNotNuhll(pdl.getGy())){
			createCriteria1.add(Restrictions.like("chcTitle","%"+pdl.getGy()+"%"));
		}
		if(isNotNuhll(pdl.getLxr())){
			createCriteria1.add(Restrictions.like("chcLinkman","%"+pdl.getLxr()+"%"));
		}
		
		
		
		createCriteria1.setFirstResult(max);
		createCriteria1.setMaxResults(pageSize);
		List list = createCriteria1.list();
		return list;
	}

	public Long countPlanList(PlanDimList pdl) {
		System.out.println("进入了cunt");
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SalChance.class);
		//添加投影
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.count("chcId"));
		//把投影放进去
		createCriteria.setProjection(projectionList);
		
		
		//添加条件
		if(isNotNuhll(pdl.getName())){
			createCriteria.add(Restrictions.like("chcCustName","%"+pdl.getName()+"%"));
		}
		if(isNotNuhll(pdl.getGy())){
			createCriteria.add(Restrictions.like("chcTitle","%"+pdl.getGy()+"%"));
		}
		if(isNotNuhll(pdl.getLxr())){
			createCriteria.add(Restrictions.like("chcLinkman","%"+pdl.getLxr()+"%"));
		}
		List<Long> list = createCriteria.list();
		 
		return list.get(0);
	}

	public SalChance planList(Integer id) {
		Session session = this.getSession();
		SalChance list =(SalChance) session.get(SalChance.class,id);
		return list;
	}

	public void planUpdate(SalPlan salPlan) {
		Session session = this.getSession();
		SalPlan plan =(SalPlan) session.get(SalPlan.class,salPlan.getPlaId());
		System.out.println(plan);
		plan.setPlaTodo(salPlan.getPlaTodo());
	}
	
	public void planDelete(SalPlan salPaPlan){
		Session session = this.getSession();
		SalPlan plan =(SalPlan) session.get(SalPlan.class,salPaPlan.getPlaId());
		session.delete(plan);
	}

	public void planAdd(SalChance sc,SalPlan salplan) {
		Session session = this.getSession();
		SalChance chance =(SalChance) session.get(SalChance.class,sc.getChcId());
		chance.getSalPlan().add(salplan);
		salplan.setSalChance(chance);
		session.save(salplan);
	}

	public void planResultUpdate(SalPlan salPlan) {
		Session session = this.getSession();
		SalPlan plan =(SalPlan) session.get(SalPlan.class,salPlan.getPlaId());
		if(salPlan.getPlaResult()!=null){
			plan.setPlaResult(salPlan.getPlaResult());
		}
	}

	public void planSuccessUpdate(SalChance sc) {
		Session session = this.getSession();
		SalChance plan =(SalChance) session.get(SalChance.class,sc.getChcId());
		plan.setChcStatus(4);
		CstCustomer customer=new CstCustomer();
		customer.setCustNo(plan.getChcId().toString());
		if(plan.getChcCustName()!=null){
			customer.setCustName(plan.getChcCustName());
		}
		session.save(customer);
	}

	
}
