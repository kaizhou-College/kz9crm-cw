package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.SalChance;

public interface SalChanceDao {
	public List<SalChance> findByPage(int page,int pageSize);
	//高级查询
	public List<SalChance> findByGaoJi(int page, int pageSize,SalChance salChance);
	//查询最大页
	public int queryMax(int pageSize);
	//查询共有多少条
	public int queryCount();
	//高级查询共有多少条
	public int queryCountByGaoJi(SalChance salChance);
	//高级查询最大页
	public int queryMaxByGaoJi(int pageSize,SalChance salChance);
	//删除
	public void del(Integer chcId);
	//指派
	public SalChance queryDis(Integer chcId);
}
