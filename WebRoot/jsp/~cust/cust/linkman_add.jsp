<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../../common/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${basePath}/script/jquery-1.4.2.min.js"></script>
<script src="${basePath}/script/common.js"></script>

</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 联系人 > 新建联系人</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" id="linkId">保存</button>  
</div>
<form id="formLink">
	<input type="hidden" name="cstLinkman.cstCustomer.custNo" value="${cstCustomer.custNo}">
	<table class="query_form_table">
		
		<tr>
			<th>姓名</th>
			<td><input name="cstLinkman.lkmName"/><span class="red_star">*</span></td>
			<th>性别</th>
			<td>
				<s:radio list="#{'1':'男','0':'女'}" name="cstLinkman.lkmSex" value="1"></s:radio>
				<%--<input type="radio" name="gander" checked />男
				<input type="radio" name="gander" />女
			--%></td>
		</tr>
		<tr>
			<th>职位</th>
			<td><input name="cstLinkman.lkmPostion"/><span class="red_star">*</span></td>
			<th>办公电话</th>
			<td><input name="cstLinkman.lkmTel"/><span class="red_star">*</span></td>
		</tr>	
		<tr>
			<th>手机</th>
			<td><input name="cstLinkman.lkmMobile" size="20" /></td>
			<th>备注</th>
			<td><input name="cstLinkman.lkmMemo" size="20" /></td>
		</tr>
	</table>
</form>
</body>
</html>
<script type="text/javascript">
	$(function(){
		$("#linkId").click(function(){
			
			$.ajax({
				type: "POST",
  				url: "${basePath}/link_save",
   				data: $("form").serialize(),
  				success: function(data){
    			 	window.location.href="${basePath}/cust_linkman?cstCustomer.custNo=${cstCustomer.custNo}";
				}
			});
			
			
		});
		
		
	});




</script>