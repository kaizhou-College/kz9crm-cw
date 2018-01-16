package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLost;
import com.kz.crm.entity.CstService;
import com.kz.crm.entity.OrdersLine;



public interface ReptService {

	List<CstCustomer> select(Class<CstCustomer> class1);

	List<CstService> serSelect(Class<CstService> class2);

	//List<CstLost> lostSelect(Class<CstLost> class3);
//分页
	long count();

	List<CstLost> byPage(int pageIndex, int pageSize);

	List<OrdersLine> conteSelect();

	String queryByIds(Integer oddOrderId);
}
