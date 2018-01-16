package com.kz.crm.dao;

import java.util.List;


import com.kz.crm.entity.BasDict;

public interface BasDictDao {
	public List<BasDict> queryAll();
	public void update(BasDict db);
	public void delete(BasDict db);
	public BasDict SelById(int id);
	public long count();
	public void add(BasDict db);
	public List<BasDict> byPage(int pageIndex, int pageSize);
}
