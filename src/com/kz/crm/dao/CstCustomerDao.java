package com.kz.crm.dao;

import java.util.List;

import org.hibernate.Session;

import com.kz.crm.entity.CstCustomer;

public interface CstCustomerDao {

	List<CstCustomer> findByPage(int page, int pageSize);

	int queryCount();

	int queryMax(int pageSize);

	List<CstCustomer> findByGaoJi(int page, int pageSize,CstCustomer cstCustomer);

	int queryCountByGaoJi(CstCustomer cstCustomer);

	int queryMaxByGaoJi(int pageSize, CstCustomer cstCustomer);

	void del(String custNo);

	//根据id查询
	CstCustomer select(String custNo);

	void update(CstCustomer cstCustomer);
		
}
