package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.ReptDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLost;
import com.kz.crm.entity.CstService;
import com.kz.crm.entity.OrdersLine;
import com.kz.crm.service.ReptService;

@Service
public class ReptServiceImpl implements ReptService{
	@Autowired
	private ReptDao reptDao;
	public List<CstCustomer> select(Class<CstCustomer> clazz) {
		List list=reptDao.select(clazz);
		return list;
	}
	public List<CstService> serSelect(Class<CstService> clazz1) {
		List list1=reptDao.serSelect(clazz1);
		return list1;
	}
/*	public List<CstLost> lostSelect(Class<CstLost> class3) {
		List list3=reptDao.lostSelect(class3);
		return list3;
	}*/
	//分页
	public List<CstLost> byPage(int pageIndex, int pageSize) {
		List<CstLost> list = reptDao.byPage(pageIndex, pageSize);
		return list;
	}
	public long count() {
		Long count = reptDao.count();
		return count;
	}
	public List<OrdersLine> conteSelect() {
		List<OrdersLine> conteSelect = reptDao.conteSelect();
		System.out.println(conteSelect+"--------------");
		return conteSelect;
	}
	public String queryByIds(Integer oddOrderId) {
		return reptDao.queryByIds(oddOrderId);
	}


}
