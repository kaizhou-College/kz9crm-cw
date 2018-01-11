	package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.CstLostDao;
import com.kz.crm.entity.CstLost;
import com.kz.crm.service.CstLostService;

@Service
public class CstLostServiceImpl implements CstLostService {
	@Autowired
	private CstLostDao cldi;
	@Override
	public List<CstLost> selByPage(int page, int index) {
		List<CstLost> list = cldi.selByPage(page, index);
		return list;
	}
	@Override
	public CstLost selById(int id) {
		return cldi.selById(id);
	}
	@Override
	public void update(CstLost cstl) {
		cldi.update(cstl);
	}
	@Override
	public void add(CstLost cstl) {
		cldi.add(cstl);
	}
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
			add(cl);
		}
	}
	@Override
	public void updateT(CstLost cstl) {
		cldi.updateT(cstl);
	}
}
