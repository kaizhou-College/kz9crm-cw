package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CustomerDimPaeam;

public interface CustomerDao {
	List byPageCustomerDao(int page,int pageSize);//分页
	Long countCustomer();//统计有多少条数据
	void customerDelete(CstCustomer cus);
	CstCustomer listSingle(CstCustomer cus);//查询单个
	void customerUpdate(CstCustomer cus);//修改单个
	List cutomerDimList(CustomerDimPaeam cdp);
}
