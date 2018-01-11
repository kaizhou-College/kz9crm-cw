package com.kz.crm.dao;

import java.util.Set;

import com.kz.crm.entity.CstLinkman;

public interface LinkManDao {
	public Set<CstLinkman> select(String lkmcustNo);
	//新增
	public void save(CstLinkman cstLinkman);
}
