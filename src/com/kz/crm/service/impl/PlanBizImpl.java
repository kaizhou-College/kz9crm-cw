package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.PlanDao;
import com.kz.crm.entity.PlanDimList;
import com.kz.crm.entity.SalChance;
import com.kz.crm.entity.SalPlan;
import com.kz.crm.service.PlanBiz;
@Service
public class PlanBizImpl implements PlanBiz {
	@Autowired
	private PlanDao planDao;
	
	public List byPage(int page, int pageSize) {
		
		List byPage = planDao.byPage(page, pageSize);
		
		return byPage;
	}

	public Long countPlan() {
		Long countPlan = planDao.countPlan();
		return countPlan;
	}

	public List byPageDim(PlanDimList pdl,int page,int pageSize ) {
		List list = planDao.byPageDim(pdl,page,pageSize );
		return list;
	}

	public Long countPlanList(PlanDimList pdl) {
		Long countPlanList = planDao.countPlanList(pdl);
		return countPlanList;
	}

	public SalChance planList(Integer id) {
		SalChance planList = planDao.planList(id);
		return planList;
	}

	public void planUpdate(SalPlan salPlan) {
		planDao.planUpdate(salPlan);
	}

	public void planAdd(SalChance sc, SalPlan salplan) {
		planDao.planAdd(sc, salplan);
	}

	public void planDelete(SalPlan salPlan) {
		planDao.planDelete(salPlan);
	}

	public void planResultUpdate(SalPlan salPlan) {
		planDao.planResultUpdate(salPlan);
	}

	public void planSuccessUpdate(SalChance sc) {
		planDao.planSuccessUpdate(sc);
	}
	
}
