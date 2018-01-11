package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.CstLost;

public interface CstLostDao {
	public List<CstLost> selByPage(int page,int index);
	public CstLost selById(int id);
	public void update(CstLost cstl);
	public List<CstLost> checkOutTime();
	public void add(CstLost cstl);
	public void updateT(CstLost cstl);
}
