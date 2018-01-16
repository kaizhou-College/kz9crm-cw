package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.BasDict;

public interface BasDictService {
	public List<BasDict> queryAll();
	public void update(BasDict db);
	public void delete(BasDict db);
	public BasDict SelById(int id);
	public long count();
	public List<BasDict> byPage(int pageIndex, int pageSize);
	public void add(BasDict db);
}
