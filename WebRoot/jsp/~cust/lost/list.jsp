<%@page contentType="text/html; charset=utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="/common/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户流失管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户</th>
		<td><input /></td>
		<th>客户经理</th>
		<td><input /></td>
		<th>状态</th>
		<td>
			<select>
				<option>全部</option>
				<option>预警</option>
				<option>暂缓流失</option>
				<option>确认流失</option>
			</select>
		</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户</th>
		<th>客户经理</th>
		<th>上次下单时间</th>
		<th>确认流失时间</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${list}" var="list">
		<tr align="center">
			<td class="list_data_number" name="cl.lstId">${list.lstId}</td>
			<td class="list_data_text" name="cl.lstCustName">${list.lstCustName}</td>
			<td class="list_data_ltext" name="cl.lstCustManagerName">${list.lstCustManagerName}</td>
			<td class="list_data_text" name="cl.lstLastOrderDate">${list.lstLastOrderDate}</td>
			<td class="list_data_text" name="cl.lstLostDate">${list.lstLostDate}</td>
			<td class="list_data_text" name="cl.lstStatus">${list.lstStatus}</td>
			<td class="list_data_op">
				<img onclick="to('custLostSel_SelById?cstl.lstId=${list.lstId}');" title="确认流失" src="${basePath}/images/bt_confirm.gif" class="op_button" />
				<img onclick="to('custLostSel_SelByIdT?cstl.lstId=${list.lstId}');" title="暂缓流失" src="${basePath}/images/bt_relay.gif" class="op_button" />
			</td>
	</tr>
	</c:forEach>
	<tr>
		<th colspan="7" class="pager">
<div class="pager">
	共59条记录 每页<input value="10" size="2" />条
	第<input value="1" size="2"/>页/共5页
	<a href="#">第一页</a>
	<a href="custLostSel_SelByPage?index=${index-1}">上一页</a>
	<a href="custLostSel_SelByPage?index=${index+1}">下一页</a>
	<a href="#">最后一页</a>
	转到<input value="1" size="2" />页
	<button width="20" onclick="reload();">GO</button>
</div>
		</th>
	</tr>
</table>
</body>
</html>