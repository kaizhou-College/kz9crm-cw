package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.PlanDimList;
import com.kz.crm.entity.SalChance;
import com.kz.crm.entity.SalPlan;

public interface PlanBiz {
	List byPage(int page ,int pageSize);
	Long countPlan();
	List byPageDim(PlanDimList pdl,int page,int pageSize );
	Long countPlanList(PlanDimList pdl);
	SalChance planList(Integer id);
	void planUpdate(SalPlan salPlan);
	void planDelete(SalPlan salPlan);
	void planAdd(SalChance sc,SalPlan salplan);
	void planResultUpdate(SalPlan salPlan);
	void planSuccessUpdate(SalChance sc);
}
