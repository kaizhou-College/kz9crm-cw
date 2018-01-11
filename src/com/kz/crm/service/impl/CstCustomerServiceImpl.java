package com.kz.crm.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.CstCustomerDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.service.CstCustomerService;
@Service
public class CstCustomerServiceImpl implements CstCustomerService {
	@Autowired
	private CstCustomerDao ccDao;
	//分页查询
	public List<CstCustomer> findByPage(int page, int pageSize) {
		return ccDao.findByPage(page,pageSize);
		
	}
	public int queryCount() {
		
		return ccDao.queryCount();
	}
	public int queryMax(int pageSize) {
		
		return ccDao.queryMax(pageSize);
	}
	public List<CstCustomer> findByGaoJi(int page, int pageSize,CstCustomer cstCustomer) {
		
		return ccDao.findByGaoJi(page,pageSize,cstCustomer);
	}
	//高级查询总条数
	public int queryCountByGaoJi(CstCustomer cstCustomer) {
		
		return ccDao.queryCountByGaoJi(cstCustomer);
	}
	//高级查询最大页数
	public int queryMaxByGaoJi(int pageSize, CstCustomer cstCustomer) {
		
		return ccDao.queryMaxByGaoJi(pageSize,cstCustomer);
	}
	//删除
	public void del(String custNo) {
		ccDao.del(custNo);
		
	}
	//根据id查询
	public CstCustomer select(String custNo) {
		return ccDao.select(custNo);
		
	}
	//更新
	public void update(CstCustomer cstCustomer) {
		ccDao.update(cstCustomer);
		
	}
}
