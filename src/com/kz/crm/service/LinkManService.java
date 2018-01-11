package com.kz.crm.service;

import java.util.Set;

import com.kz.crm.entity.CstLinkman;

public interface LinkManService {

	Set<CstLinkman> select(String lkmcustNo);
	//新增
	void save(CstLinkman cstLinkman);

}
