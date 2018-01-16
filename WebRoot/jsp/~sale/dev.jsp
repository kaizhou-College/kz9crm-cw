<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/common/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${basePath}/script/jquery-1.4.2.min.js"></script>
<script src="${basePath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户开发计划</div>


<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button> 
</div>

<form id="from1">
<table class="query_form_table">
	<tr>
		<th>客户名称</th>
		<td><input id="name" name="pdl.name" /></td>
		<th>概要</th>
		<td><input id="gy" name="pdl.gy"/></td>
		<th>联系人</th>
		<td>
			<input name="pdl.lxr" id="lxr" size="20"  />
		</td>
	</tr>
	</table>
</form>

	
<br />
<table class="data_list_table">
<thead>
	<tr>
		<th>编号</th>
		<th>客户名称</th>
		<th>概要</th>
		<th>联系人</th>
		<th>联系人电话</th>
		<th>创建时间</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
</thead>
	
	
<tbody id="chance_list">	
<c:forEach items="${chances}" var="list">
	<tr>
		<td class="list_data_number">${list.chcId}</td>
		<td class="list_data_text">${list.chcCustName}</td>
		<td class="list_data_ltext">${list.chcTitle}</td>
		<td class="list_data_text">${list.chcLinkman}</td>
		<td class="list_data_text">${list.chcTel}</td>
		<td class="list_data_text">${list.chcCreateDate}</td>
		<td class="list_data_text">
			<c:if test="${list.chcStatus<4}">开发中</c:if>
			<c:if test="${list.chcStatus==4}">已结档</c:if>
		</td>
		<td class="list_data_op">
			<c:if test="${list.chcStatus<4}">
			<img onclick="to('plan_planListBeing?sc.chcId=${list.chcId}');" title="制定计划" src="${basePath}/images/bt_plan.gif" class="op_button" />
				<img onclick="to('plan_planExecuteList?sc.chcId=${list.chcId}');" title="执行计划" src="${basePath}/images/bt_feedback.gif" class="op_button" />
				<img onclick="to('plan_planSuccess?sc.chcId=${list.chcId}')" title="开发成功" src="${basePath}/images/bt_yes.gif" class="op_button" />
			</c:if>
			<c:if test="${list.chcStatus==4}">
				<img onclick="to('plan_planList?sc.chcId=${list.chcId}');" title="查看" src="${basePath}/images/bt_detail.gif" class="op_button" />
			</c:if>
		</td>
	</tr>
	
</c:forEach>
	<tr>
	<th colspan="10" class="pager">
		<div class="pager" >
			<kz:page max="${max}" url="sale_list2" page="${page}"></kz:page>
		</div>
	</th>
	</tr>
</tbody>	
<s:debug></s:debug>
</table>
	<script type="text/javascript">
		function formSkip(){
			var page=document.getElementById("pageIndex").value;
			location.href="'+${pageUrl}+'?pageIndex="+page;
		}
		
	</script>
</body>

</html>