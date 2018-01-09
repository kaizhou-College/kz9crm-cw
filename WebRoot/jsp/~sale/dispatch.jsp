<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../common/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
</head>
<s:debug></s:debug>
<body>

<div class="page_title">销售机会管理&nbsp; &gt; 指派销售机会</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('list.html');">保存</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>${salChance.chcId}</td>
		<th>机会来源</th>
		<td>${salChance.chcSource}
			　</td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td>${salChance.chcCustName}</td>
		<th>成功机率（%）</th>
		<td>&nbsp;${salChance.chcRate}</td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3">${salChance.chcTitle}</td>
	</tr>
	<tr>
		<th>联系人</th>
		<td>${salChance.chcLinkman}</td>
		<th>联系人电话</th>
		<td>${salChance.chcTel}</td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3">${salChance.chcDesc}</td>
	</tr>
	<tr>
		<th>创建人</th>
		<td>${salChance.chcCreateBy}</td>
		<th>创建时间</th>
		<td>${salChance.chcCreateDate}</td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table1">
	<tr>
		<th>指派给</th>
		<td>
			<select name="D1">
				<option>请选择...</option>
				<option>小明</option>
				<option>旺财</option>
				<option>球球</option>
				<option>孙小美</option>
				<option>周洁轮</option>
			</select> <span class="red_star">*</span></td>
		<th>指派时间</th>
		<td>
			<input id="t2" name="T20" readonly size="20" /><span class="red_star">*</span></td>
	</tr>
</table>
<script>
	setCurTime('t2');
</script>
</body>
</html>