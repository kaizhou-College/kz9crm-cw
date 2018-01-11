<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../../common/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
</head>
<s:debug></s:debug>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 联系人 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('${basePath}/link_select?cstCustomer.custNo=${cstCustomer.custNo}');">新建</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td>${cstCustomer.custNo}</td>
		<th>客户名称</th>
		<td>${cstCustomer.custName}</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>姓名</th>
		<th>性别</th>
		<th>职位</th>
		<th>办公电话</th>
		<th>手机</th>
		<th>备注</th>
		<th>操作</th>
	</tr>
	<s:iterator value="cstLinkman" var="linkman">
		<tr>
			<td class="list_data_text">${linkman.lkmName}</td>
			<td class="list_data_ltext">${linkman.lkmSex}</td>
			<td class="list_data_text">${linkman.lkmPostion}</td>
			<td class="list_data_text">${linkman.lkmTel}</td>
			<td class="list_data_text">${linkman.lkmMobile}</td>
			<td class="list_data_op">${linkman.lkmMemo}
				　</td>
			<td class="list_data_op">
				<img onclick="to('linkman_edit.html');" title="编辑" src="${basePath}/images/bt_edit.gif" class="op_button" />
				<img onclick="del('“联系人：沈聪林”');" title="删除" src="${basePath}/images/bt_del.gif" class="op_button" />
				
			</td>
		</tr>
	</s:iterator>
	</table>
</body>
</html>