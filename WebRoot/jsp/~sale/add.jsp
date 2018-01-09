<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../common/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${basePath}/script/jquery-1.4.2.min.js"></script>
<script src="${basePath}/script/common.js"></script>
<script type="text/javascript">
	$(function(){
		$("#add_chance").click(function(){
			$.ajax({
				type:"POST",
				url:"${basePath}/sale_add.action",
				data: $("#formAdd").serialize(), 
				success: function(data){
					alert("成功");
				 }
			});
		});
		
		
	});


</script>
</head>
<body>

<div class="page_title">销售机会管理&nbsp; &gt; 新建销售机会</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" id="add_chance">保存</button>  
</div>
<form id="formAdd">
	<table class="query_form_table">
		<tr>
			<th>编号</th>
			<td><input readonly /></td>
			<th>机会来源</th>
			<td>
				<input name="salChance.chcSource" size="20" /></td>
		</tr>
		<tr>
			<th>客户名称</th>
			<td><input /><span name="salChance.chcCustName" class="red_star">*</span></td>
			<th>成功机率</th>
			<td><input /><span name="salChance.chcRate" class="red_star">*</span></td>
		</tr>	
		<tr>
			<th>概要</th>
			<td colspan="3"><input name="salChance.chcTitle" size="52" /><span class="red_star">*</span></td>
		</tr>
		<tr>
			<th>联系人</th>
			<td><input name="salChance.chcLinkman" size="20" /></td>
			<th>联系人电话</th>
			<td><input name="salChance.chcTel" size="20" /></td>
		</tr>
		<tr>
			<th>机会描述</th>
			<td colspan="3"><textarea rows="6" cols="50" name="salChance.chcDesc"></textarea><span class="red_star">*</span></td>
		</tr>
		<tr>
			<th>创建人</th>
			<td><input name="salChance.chcCreateBy" value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
			<th>创建时间</th>
			<td><input id="t1" name="salChance.chcCreateDate" readonly size="20" /><span class="red_star">*</span></td>
		</tr>
	</table>
	<br />
	<table disabled class="query_form_table" id="table1">
		<tr>
			<th>指派给</th>
			<td>
				<select name="salChance.chcDueTo">
					<option>请选择...</option>
					<option>小明</option>
					<option>旺财</option>
					<option>球球</option>
					<option>孙小美</option>
					<option>周洁轮</option>
				</select> <span class="red_star">*</span></td>
			<th>指派时间</th>
			<td>
				<input id="t2" name="salChance.chcDueDate" readonly size="20" /><span class="red_star">*</span></td>
		</tr>
	</table>
</form>
<script>
	setCurTime('t1');
	setCurTime('t2');
</script>
</body>
</html>