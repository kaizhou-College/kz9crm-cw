package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.CstLost;

	public interface CstLostService {
		public List<CstLost> selByPage(int page,int index);
		public CstLost selById(int id);
		public void update(CstLost cstl);
		public void add(CstLost cstl);
		public void check();
		public void updateT(CstLost cstl);
}
