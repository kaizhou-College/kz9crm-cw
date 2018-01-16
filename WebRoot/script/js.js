
function ajaxPlanUpdate(id){
	$.ajax({
		type:"POST",
		url:"plan_ajaxPlanUpdate",
		data:{"salplan.plaId":id,"salplan.plaTodo":$("#plan_doto").val()},
		error:function(){
			alert("ajaxPlanUpdate");
		}
	});
}

//customer删除
function customerDelete(id){
	location.href="customer_customerDelete?cus.custNo="+id;
}
//customer 修改的显示
function customerUpdateList(id){
	location.href="customer_customerUpdateList?cus.custNo="+id;
}
//Activity显示

function activityList(id){
	location.href="activity_activityList?cus.custNo="+id;
}