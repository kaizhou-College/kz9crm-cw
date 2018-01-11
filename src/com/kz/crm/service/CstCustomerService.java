package com.kz.crm.service;

import java.util.List;

import org.hibernate.Session;

import com.kz.crm.entity.CstCustomer;

public interface CstCustomerService {
	//分页查询
	List<CstCustomer> findByPage(int page, int pageSize);
	//查询总条数
	int queryCount();
	//查询最大有多少页
	int queryMax(int pageSize);
	//高级查询分页
	List<CstCustomer> findByGaoJi(int page, int pageSize,CstCustomer cstCustomer);
	//高级查询总条数
	int queryCountByGaoJi(CstCustomer cstCustomer);
	//高级查询最大页数
	int queryMaxByGaoJi(int pageSize, CstCustomer cstCustomer);
	//删除
	void del(String custNo);
	//根据id查询
	public CstCustomer select(String custNo) ;
	//更新
	
	void update(CstCustomer cstCustomer);
}
