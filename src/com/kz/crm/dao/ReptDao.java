package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstService;


public interface ReptDao {

	List select(Class<CstCustomer> clazz);

	List serSelect(Class<CstService> clazz1);

	//List lostSelect(Class<CstLost> class3);

	List byPage(int pageIndex, int pageSize);

	Long count();

	List conteSelect();

	String queryByIds(Integer oddOrderId);

}
