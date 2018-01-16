package com.kz.crm.action.basd.dict;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.BasDict;
import com.kz.crm.entity.ListPage;
import com.kz.crm.service.BasDictService;

@Controller
@Scope("prototype")
public class SelDictAction {
	@Autowired
	BasDictService bds;
	List<BasDict> list;
	private ListPage listpage;
	private int pageIndex;
	private BasDict db;
	public BasDict getDb() {
		return db;
	}
	public void setDb(BasDict db) {
		this.db = db;
	}
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=5;
	public ListPage getListpage() {
		return listpage;
	}
	public void setListpage(ListPage listpage) {
		this.listpage = listpage;
	}
	public String SelByPage(){
		System.out.println("-------------------------------");
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("seldict_SelByPage");//跳转路径
		listpage.setCount(bds.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		list = bds.byPage(listpage.getPageIndex(), listpage.getPageSize());
		System.out.println(list);
		return "SelDictOk";
	}
	public String selById(){
		db = bds.SelById(db.getDictId());
		return "SelByIdOk";
	}
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public List<BasDict> getList() {
		return list;
	}
	public void setList(List<BasDict> list) {
		this.list = list;
	}
}
