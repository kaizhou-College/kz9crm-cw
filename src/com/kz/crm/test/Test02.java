package com.kz.crm.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kz.crm.dao.CstLostDao;
import com.kz.crm.entity.CstLost;
import com.kz.crm.service.CstLostService;

public class Test02 {
	@Autowired
	CstLostDao cldi;
	@Autowired
	CstLostService cls;
	public void check(){
		List<CstLost> list = cldi.checkOutTime();
		for(int i =0;i<list.size();i++){
			CstLost cl = new CstLost();
			cl.setLstCustManagerId(list.get(i).getLstCustManagerId());
			cl.setLstCustManagerName(list.get(i).getLstCustManagerName());
			cl.setLstCustName(list.get(i).getLstCustName());
			cl.setLstStatus(list.get(i).getLstStatus());
			cl.setLstDelay("ÔÝÎÞ");
			cl.setLstLastOrderDate(list.get(i).getLstLastOrderDate());
			cl.setLstCustNo(list.get(i).getLstCustNo());
			cls.add(cl);
		}
	}
}
