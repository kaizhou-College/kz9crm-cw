package com.kz.crm.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.LinkManDao;
import com.kz.crm.entity.CstLinkman;
import com.kz.crm.service.LinkManService;
@Service
public class LinkManServiceImpl implements LinkManService {
	@Autowired
	private LinkManDao linkmandao;
	public Set<CstLinkman> select(String lkmcustNo) {
		// TODO Auto-generated method stub
		return linkmandao.select(lkmcustNo);
	}
	//新增
	public void save(CstLinkman cstLinkman) {
		// TODO Auto-generated method stub
		linkmandao.save(cstLinkman);
	}

}
