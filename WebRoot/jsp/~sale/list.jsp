<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../common/comm.jsp" %>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
<script type="text/javascript" src="${basePath}/script/jquery-1.4.2.min.js"></script>
</head>
<s:debug></s:debug>
<body>

<div class="page_title">销售机会管理</div>

<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('${basePath}/jsp/~sale/add.jsp');">新建</button>  
	<button class="common_button" id="cha_query">查询</button> 
	<!-- 用事件怎么带input里面的值 -->
</div>
<form id="formId">
	<table class="query_form_table">
		<tr>
			<th>客户名称</th>
			<td><input name="salChance.chcCustName"/></td>
			<th>概要</th>
			<td><input name="salChance.chcTitle"/></td>
			<th>联系人</th>
			<td>
				<input name="salChance.chcLinkman" size="20" />
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
		$("#cha_query").click(function(){
			$.ajax({
				type:"POST",
				url:"${basePath}/sale_list.action",
				data: $("form").serialize(), 
				success: function(data){
					$("#tbody").html(data);
				 }
			});
		});
		$("#go").click(function(){
			var num=$("#toId").val();
			window.location.href="${basePath}/sale_list?page="+num;
			
		});
		
		
});


</script>