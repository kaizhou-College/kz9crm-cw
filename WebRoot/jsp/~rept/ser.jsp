<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/common/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
</head>
<body>

<div class="page_title">客户服务分析</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button> 
	</div>
<table class="query_form_table">
	<tr>
		<th>年份</th>
		<td>
			<select>
				<option>全部</option>
				<option>2005</option>
				<option>2006</option>
				<option>2007</option>
				<option>2008</option>
				<option>2009</option>
				<option>2010</option>
			</select>
		</td>
		<th>&nbsp;</th>
		<td>
			&nbsp;
		</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>条目</th>
		<th>服务数量</th>
	</tr>
	<s:iterator var="listcstService" value="listcstService">
	<tr>
		<td class="list_data_number"><s:property value="#listcstService.svrId"/> </td>
		<td class="list_data_text"><s:property value="#listcstService.svrTitle"/></td>
		<td class="list_data_number"><s:property value="#listcstService.svrDueId"/></td>
	</tr>
	</s:iterator>
	</table>
</body>
</html>