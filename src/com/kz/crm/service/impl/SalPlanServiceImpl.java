package com.kz.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.SalPalnDao;
import com.kz.crm.entity.SalPlan;
import com.kz.crm.service.SalPlanService;

@Service
public class SalPlanServiceImpl implements SalPlanService{
	@Autowired
	private SalPalnDao spdi;
	@Override
	public void save(SalPlan salplan) {
		spdi.save(salplan);
	}
}
