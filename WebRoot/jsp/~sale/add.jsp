<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp"%>
</script>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>

</head>
<body>

<div class="page_title">销售机会管理&nbsp; &gt; 新建销售机会</div>


<form action="../salchance_insert" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<input type="submit" value="保存" />
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input readonly name="chance.chcId"/></td>
		<th>机会来源</th>
		<td>
			<input size="20" name="chance.chcSource"/></td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td><input name="chance.chcCustName"/><span class="red_star">*</span></td>
		<th>成功机率</th>
		<td><input name="chance.chcRate"/><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3"><input  size="52" name="chance.chcTitle"/><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>联系人</th>
		<td><input size="20" name="chance.chcLinkman"/></td>
		<th>联系人电话</th>
		<td><input size="20" name="chance.chcTel"/></td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3"><textarea rows="6" cols="50" name="chance.chcDesc"></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><input  value="刘颖" readonly size="20" name="chance.chcCreateBy"/><span class="red_star">*</span></td>
		<th>创建时间</th>
		<td><input id="t1" name="chance.chcCreateDate" readonly size="20" /><span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table1">
	<tr>
		<th>指派给</th>
		<td>
			<select name="chance.chcDueTo">
				<option value="未选择">请选择...</option>
				<option value="小明">小明</option>
				<option value="旺财">旺财</option>
				<option value="球球">球球</option>
				<option value="孙小美">孙小美</option>
				<option value="周洁轮">周洁轮</option>
			</select> <span class="red_star">*</span></td>
		<th>指派时间</th>
		<td>
			<input id="t2"  readonly size="20" name="chance.chcDueDate"/><span class="red_star">*</span></td>
	</tr>
</table>
</form>
<script>
	setCurTime('t1');
	setCurTime('t2');
</script>
</body>
</html>