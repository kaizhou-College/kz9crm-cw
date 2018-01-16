<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp"%>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
</head>
<body>

<div class="page_title">销售机会管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('${basePath}html/~sale/add.jsp');">新建</button>  
	<button class="common_button" onclick="reload();">查询</button> 
	</div>
	<s:debug></s:debug>
<table class="query_form_table">
	<tr>
		<th>客户名称</th>
		<td><input /></td>
		<th>概要</th>
		<td><input /></td>
		<th>联系人</th>
		<td>
			<input name="T1" size="20" />
		</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户名称</th>
		<th>概要</th>
		<th>联系人</th>
		<th>联系人电话</th>
		<th>创建时间</th>
		<th>操作</th>
	</tr>
	<s:iterator value="list" var="chance">
	<tr>
		<td class="list_data_number"><s:property value="#chance.chcId"/></td>
		<td class="list_data_text"><s:property value="#chance.chcCustName"/></td>
		<td class="list_data_ltext"><s:property value="#chance.chcTitle"/></td>
		<td class="list_data_text"><s:property value="#chance.chcLinkman"/></td>
		<td class="list_data_text"><s:property value="#chance.chcTel"/></td>
		<td class="list_data_text"><s:property value="#chance.chcCreateDate"/></td>
		<td class="list_data_op">
			<img onclick="to('dispatch.html');" title="指派" src="${basePath}/html/images/bt_linkman.gif" class="op_button" />
			<img onclick="to('${basePath}html/~sale/change_toupdate?chcId='+<s:property value='#chance.chcId'/>);" title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />
			<img onclick=del("<s:property value='#chance.chcId'/>"); title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />
			
		</td>
	</tr>
	</s:iterator>
	<tr>
		<th colspan="7" class="pager">
<div class="pager">
</div>
		</th>
	</tr>
</table>
</body>
</html>