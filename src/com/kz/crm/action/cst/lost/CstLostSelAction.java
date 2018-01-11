package com.kz.crm.action.cst.lost;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CstLost;
import com.kz.crm.service.CstLostService;

@Controller
@Scope("prototype")
public class CstLostSelAction {
	@Autowired
 	private CstLostService clsi;
	private List<CstLost> list;
	private CstLost cstl;
	private int index;
	public String SelByPage(){
		if(index==0){
			index = 1;
		}
		list = clsi.selByPage(1, index);
		return "SelByPageok";
	}
	public String SelById(){
		System.out.println(cstl);
		List<CstLost> l = new ArrayList<CstLost>();
		l.add(clsi.selById(cstl.getLstId()));
		list = l;
		return "SelByIdok";
	}
	public String SelByIdT(){
		System.out.println(cstl);
		List<CstLost> l = new ArrayList<CstLost>();
		l.add(clsi.selById(cstl.getLstId()));
		list = l;
		return "SelByIdokT";
	}
	
	
	

	public CstLost getCstl() {
		return cstl;
	}
	public void setCstl(CstLost cstl) {
		this.cstl = cstl;
	}
	public List<CstLost> getList() {
		return list;
	}
	public void setList(List<CstLost> list) {
		this.list = list;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
