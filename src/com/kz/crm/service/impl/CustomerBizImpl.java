package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.CustomerDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CustomerDimPaeam;
import com.kz.crm.service.CustomerBiz;
@Service
public class CustomerBizImpl implements CustomerBiz {

	@Autowired
	private  CustomerDao customerDao;
	
	public List byPageCustomerDao(int page, int pageSize) {
		List list = customerDao.byPageCustomerDao(page, pageSize);
		return list;
	}

	public Long countCustomer() {
		Long countCustomer = customerDao.countCustomer();
		return countCustomer;
	}
	
	public List cutomerDimList(CustomerDimPaeam cdp) {
		return customerDao.cutomerDimList(cdp);
	}

	public void customerDelete(CstCustomer cus) {
		customerDao.customerDelete(cus);
	}

	public CstCustomer listSingle(CstCustomer cus) {
		CstCustomer listSingle = customerDao.listSingle(cus);
		return listSingle;
	}

	public void customerUpdate(CstCustomer cus) {
		customerDao.customerUpdate(cus);
	}

}
