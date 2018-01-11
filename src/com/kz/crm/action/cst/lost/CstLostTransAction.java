package com.kz.crm.action.cst.lost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CstLost;
import com.kz.crm.service.CstLostService;

@Controller
@Scope("prototype")
public class CstLostTransAction {
	@Autowired
 	private CstLostService clsi;
	private CstLost cstl;
	public String Update(){
		clsi.update(cstl);
		return "Updateok";
	}
	public String superUpdate(){
		clsi.updateT(cstl);
		return "Updateok";
	}
	public CstLost getCstl() {
		return cstl;
	}
	public void setCstl(CstLost cstl) {
		this.cstl = cstl;
	}
}
