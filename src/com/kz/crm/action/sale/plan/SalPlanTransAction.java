package com.kz.crm.action.sale.plan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.SalPlan;
import com.kz.crm.service.SalPlanService;
import com.kz.crm.service.impl.SalPlanServiceImpl;

@Controller
@Scope("prototype")
public class SalPlanTransAction{
	SalPlan salplan;
	String sdate;
	@Autowired
	private SalPlanService sps;
	public String AddPlan(){
		salplan.setPlaId(1);
		salplan.setPlaChcId(1);
		SimpleDateFormat dataformat = new SimpleDateFormat("yyyy/MM/dd");
		Date plaDate = null;
		try {
			plaDate = dataformat.parse(sdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		salplan.setPlaDate(plaDate);
		sps.save(salplan);
		return "PlanAddok";
	}
	
	public SalPlan getSalplan() {
		return salplan;
	}
	public void setSalplan(SalPlan salplan) {
		this.salplan = salplan;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
}
