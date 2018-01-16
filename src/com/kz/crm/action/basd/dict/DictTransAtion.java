package com.kz.crm.action.basd.dict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.BasDict;
import com.kz.crm.service.BasDictService;

@Controller
@Scope("prototype")
public class DictTransAtion {
	@Autowired
	BasDictService bds;
	private BasDict db;
	public String update(){
		bds.update(db);
		return "updateok";
	}
	
	public String delete(){
		bds.delete(db);
		return "deleteok";
	}
	public String add(){
		bds.add(db);
		return "updateok";
	}
	public BasDict getDb() {
		return db;
	}
	public void setDb(BasDict db) {
		this.db = db;
	}
	
}
