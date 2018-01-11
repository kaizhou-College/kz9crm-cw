<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../../common/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
<script type="text/javascript" src="${basePath}/script/jquery-1.4.2.min.js"></script>

</head>
<s:debug></s:debug>
<body>

<div class="page_title">客户信息管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" id="query_cust">查询</button>  
</div>
<form id="form_customer">
	<table class="query_form_table">
		<tr>
			<th>客户编号</th>
			<td><input name="cstCustomer.custNo"/></td>
			<th>名称</th>
			<td><input name="cstCustomer.custName"/></td>
			<th>地区</th>
			<td>
				<select name="cstCustomer.custRegion">
					<option value="-1">全部</option>
					<option value="北京">北京</option>
					<option value="华北">华北</option>
					<option value="中南">中南</option>
					<option value="东北">东北</option>
					<option value="西部">西部</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>客户经理</th>
			<td><input name="cstCustomer.custManagerName"/></td>
			<th>客户等级</th>
			<td>
				<select name="cstCustomer.custLevelLabel">
					<option value="-1">全部</option>
					<option value="战略合作伙伴">战略合作伙伴</option>
					<option value="合作伙伴">合作伙伴</option>
					<option value="大客户">大客户</option>
					<option value="普通客户">普通客户</option>
				</select>
			</td>
			<th>　</th>
			<td>　</td>
		</tr>
	</table>
</form>
<br />
<table class="data_list_table">
	<thead>
		<tr>
			<th>序号</th>
			<th>客户编号</th>
			<th>名称</th>
			<th>地区</th>
			<th>客户经理</th>
			<th>客户等级</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody id="tbody">
		<jsp:include page="listData.jsp"></jsp:include>
	</tbody>
	
</table>
</body>
</html>
<script type="text/javascript">
	$(function(){
		$("#go").click(function(){
			var num=$("#toId").val();
			window.location.href="${basePath}/cust_list?page="+num;
			
		});
		$("#query_cust").click(function(){
			$.ajax({
				type:"POST",
				url:"${basePath}/cust_list.action",
				data: $("form").serialize(), 
				success: function(data){
					$("#tbody").html(data);
				 }
			});
		});
		
		
	});
	


</script>