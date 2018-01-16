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

<div class="page_title">客户构成分析</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button> 
	</div>
<table class="query_form_table">
	<tr>
		<th>报表方式</th>
		<td>
			<select>
				<option>按等级</option>
				<option>按信用度</option>
				<option>按满意度</option>
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
		<th>等级</th>
		<th>客户数量</th>
	</tr>
	<s:iterator var="listcstCustomer" value="listcstCustomer">
	<tr>
		<td class="list_data_number"><s:property value="#listcstCustomer.custNo"/> </td>
		<td class="list_data_text"><s:property value="#listcstCustomer.custLevel"/></td>
		<td class="list_data_number"><s:property value="#listcstCustomer.custManagerId"/></td>
	</tr>
	</s:iterator>
	</table>
</body>
</html>