package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.BasDictDao;
import com.kz.crm.entity.BasDict;
import com.kz.crm.service.BasDictService;
@Service
public class BasDictServiceImpl implements BasDictService {
	@Autowired
	BasDictDao bdd;
	@Override
	public List<BasDict> queryAll() {
		System.out.println(1);
		return bdd.queryAll();
	}
	@Override
	public void delete(BasDict db) {
		bdd.delete(db);
	}
	@Override
	public void update(BasDict db) {
		bdd.update(db);
	}
	@Override
	public BasDict SelById(int id) {
		return bdd.SelById(id);
	}
	@Override
	public long count() {
		Long count = bdd.count();
		return count;
	}
	@Override
	public List<BasDict> byPage(int pageIndex, int pageSize) {
		return bdd.byPage(pageIndex, pageSize);
	}
	@Override
	public void add(BasDict db) {
		bdd.add(db);
	}
}
