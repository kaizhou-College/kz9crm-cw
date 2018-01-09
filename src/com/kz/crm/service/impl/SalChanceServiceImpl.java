package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kz.crm.dao.SalChanceDao;
import com.kz.crm.entity.SalChance;
import com.kz.crm.service.SalChanceService;
@Service
public class SalChanceServiceImpl implements SalChanceService{
	@Autowired
	private SalChanceDao salChanceDao;
	
	public List<SalChance> findByPage(int page, int pageSize) {
		
		return salChanceDao.findByPage(page,pageSize);
	}
	//高级查询
	public List<SalChance> findByGaoJi(int page, int pageSize,SalChance salChance) {
		return salChanceDao.findByGaoJi(page,pageSize,salChance);
			
	}
	//高级查询共有多少条
	public int queryCountByGaoJi(SalChance salChance){
		
		return salChanceDao.queryCountByGaoJi(salChance);
		
	};
	//高级查询最大页
	public int queryMaxByGaoJi(int pageSize,SalChance salChance){
		
		return salChanceDao.queryMaxByGaoJi(pageSize, salChance);
	};
	//查询最大页
	public int queryMax(int pageSize){
		return salChanceDao.queryMax(pageSize);
	};
	//查询共有多少条
	public int queryCount(){
		return salChanceDao.queryCount();
	}
	public void del(Integer chcId) {
		
		salChanceDao.del(chcId);
	};
	//指派
	public SalChance queryDis(Integer chcId){
		
		return salChanceDao.queryDis(chcId);
	};
}
