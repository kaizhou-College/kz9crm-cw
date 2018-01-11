package com.kz.crm.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLost;
import com.kz.crm.entity.Orders;
import com.kz.crm.service.impl.CstLostServiceImpl;
public class Test01 {
	@Test
	public void test01(){
		Configuration cfg = new Configuration().configure();
		//2,构建sessionFactory 会话工厂
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		//3,得到会话对象
		Session session = sessionFactory.openSession();
		//////////////////开启事务:增删改//////////////////////////
		session.beginTransaction();
		/////////////////////////////////////////////
		//4,添加一个对象到数据库的users表
		
		String hql1 = "from Orders where months_between(sysdate,odrDate) > 6 ";
		String hql2 = "from CstCustomer where custName=?";
		List<Orders> list1 = session.createQuery(hql1).list();
		List<CstCustomer> list2 = new ArrayList<CstCustomer>();
		for(int i =0;i<list1.size();i++){
			CstLost cl = new CstLost();
			System.out.println(1);
			list2 = session.createQuery(hql2).setParameter(0, list1.get(i).getOdrCustomer()).list();
			cl.setLstCustManagerId(list2.get(i).getCustManagerId());
			cl.setLstCustManagerName(list2.get(i).getCustManagerName());
			cl.setLstCustName(list2.get(i).getCustName());
			cl.setLstStatus(list2.get(i).getCustStatus());
			cl.setLstDelay("暂无");
			cl.setLstLastOrderDate(list1.get(i).getOdrDate());
			cl.setLstCustNo(list2.get(i).getCustNo());
			System.out.println(cl);
			session.save(cl);
		}
		
		//////////////////提交事务//////////////////////////
		session.beginTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
}
