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

<div class="page_title">客户信息管理 > 客户信息</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('${basePath}/cust_linkman?cstCustomer.custNo=${cstCustomer.custNo}');">联系人</button>
	<button class="common_button" onclick="to('${basePath}/cust_active?cstCustomer.custNo=${cstCustomer.custNo}');">交往记录</button>
	<button class="common_button" onclick="to('${basePath}/cust_orders?cstCustomer.custNo=${cstCustomer.custNo}');">历史订单</button>
	
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" id="saveId">保存</button>
</div>
<form id="saveForm">
	<table class="query_form_table">
		<tr>
			<th>客户编号</th>
			<td><input name="cstCustomer.custNo" value="${cstCustomer.custNo}" disabled="disabled"/></td>
			<th>名称</th>
			<td><input name="cstCustomer.custName" value="${cstCustomer.custName}" /><span class="red_star">*</span></td>
		</tr>
		<tr>
			<th>地区</th>
			<td>
			<s:select list="#{'北京':'北京','华北':'华北','中南':'中南','东北':'东北','西部':'西部'}" value="%{cstCustomer.custRegion}" name="cstCustomer.custRegion" headerKey="-1" headerValue="请选择"></s:select>
				<%--<select name="cstCustomer.custRegion">
					<option>请选择...</option>
					<option selected>${cstCustomer.custRegion}</option>
					<option>北京</option>
					<option>华北</option>
					<option>中南</option>
					<option>东北</option>
					<option>西部</option>
				</select>
				--%><span class="red_star">*</span></td>
			<th>客户经理</th>
			<td>
				<s:select list="#{'小明':'小明','旺财':'旺财','球球':'球球','孙小美':'孙小美','周洁轮':'周洁轮'}" value="%{cstCustomer.custManagerName}" name="cstCustomer.custManagerName" headerKey="-1" headerValue="请选择"></s:select>
				<%--<select name="cstCustomer.custManagerName">
					<option>请选择...</option>
					<option selected>${cstCustomer.custManagerName}</option>
					<option>小明</option>
					<option>旺财</option>
					<option>球球</option>
					<option>孙小美</option>
					<option>周洁轮</option>
				</select>--%><span class="red_star">*</span>
			</td>
		</tr>	
		<tr>
			<th>客户等级</th>
			<td>
				<s:select list="#{'1':'普通客户','2':'重点开发客户','3':'大客户','4':'合作伙伴','5':'战略合作伙伴'}" value="%{cstCustomer.custLevel}" name="cstCustomer.custLevel" headerKey="-1" headerValue="请选择"></s:select>
				<%--<select name="cstCustomer.custLevel" value="${cstCustomer.custLevel}">
					<option value="-1">请选择...</option>
					<option value="1">合作伙伴</option>
					<option value="2">大客户</option>
					<option value="3">重点开发客户</option>
					<option value="4">普通客户</option>
				</select><span class="red_star">*</span>--%>
			</td>
			<th>　</th>
			<td>　</td>
		</tr>
		<tr>
			<th>客户满意度</th>
			<td>
				<s:select list="#{'5':'☆☆☆☆☆','4':'☆☆☆☆','3':'☆☆☆','2':'☆☆','1':'☆'}" value="%{cstCustomer.custSatisfy}" name="cstCustomer.custSatisfy" headerKey="3" headerValue="☆☆☆"></s:select>
				<%--<select name="cstCustomer.custSatisfy" value="${cstCustomer.custSatisfy}"><option value="-1">未指定</option>
						<option value="5">☆☆☆☆☆</option>
						<option value="4">☆☆☆☆</option>
						<option value="3" selected="selected">☆☆☆</option>
						<option value="2">☆☆</option>
						<option value="1">☆</option></select>--%><span class="red_star">*</span>
			</td>
			<th>客户信用度</th>
			<td>
				<s:select list="#{'5':'☆☆☆☆☆','4':'☆☆☆☆','3':'☆☆☆','2':'☆☆','1':'☆'}" value="%{cstCustomer.custCredit}" name="cstCustomer.custCredit" headerKey="3" headerValue="☆☆☆"></s:select>
				<%--<select name="cstCustomer.custCredit" value="${cstCustomer.custCredit}"><option value="">未指定</option>
						<option value="5">☆☆☆☆☆</option>
						<option value="4">☆☆☆☆</option>
						<option value="3" selected="selected">☆☆☆</option>
						<option value="2">☆☆</option>
						<option value="1">☆</option></select>--%><span class="red_star">*</span>
			</td>
		</tr>
	</table>
	<br />
	<table class="query_form_table" id="table1">
		<tr>
			<th>地址</th>
			<td><input name="cstCustomer.custAddr" value="${cstCustomer.custAddr}"  /><span class="red_star">*</span>
			</td>
			<th>邮政编码</th>
			<td><input name="cstCustomer.custZip" value="${cstCustomer.custZip}" name="T1" size="20" /><span class="red_star">*</span></td>
		</tr>
		<tr>
			<th>电话</th>
			<td>
				<input name="cstCustomer.custTel" value="${cstCustomer.custTel}" name="T4" size="20"  /><span class="red_star">*</span></td>
			<th>传真</th>
			<td>
				<input name="cstCustomer.custFax" value="${cstCustomer.custFax}" name="T5" size="20"  /><span class="red_star">*</span>
			</td>
		</tr>	
		<tr>
			<th>网址</th>
			<td>
				<input name="cstCustomer.custWebsite" value="${cstCustomer.custWebsite}" name="T6" size="20"  /><span class="red_star">*</span>
			</td>
			<th>　</th>
			<td>　</td>
		</tr>
	</table>
	<br />
	<table class="query_form_table" id="table2">
		<tr>
			<th>营业执照注册号</th>
			<td><input value="${cstCustomer.custLicenceNo}" name="cstCustomer.custLicenceNo" size="20" /></td>
			<th>法人</th>
			<td><input value="${cstCustomer.custChieftain}" name="cstCustomer.custChieftain" size="20" /><span class="red_star">*</span>
			</td>
		</tr>
		<tr>
			<th>注册资金（万元）</th>
			<td>
				<input value="${cstCustomer.custBankroll}" name="cstCustomer.custBankroll" size="20" /> </td>
			<th>年营业额</th>
			<td>
				<input value="${cstCustomer.custTurnover}" name="cstCustomer.custTurnover" size="20" />
			</td>
		</tr>	
		<tr>
			<th>开户银行</th>
			<td>
				<input value="${cstCustomer.custBank}" name="cstCustomer.custBank" size="20" /><span class="red_star">*</span>
			</td>
			<th>银行帐号</th>
			<td><input value="${cstCustomer.custBankAccount}" name="cstCustomer.custBankAccount" size="20" /><span class="red_star">*</span></td>
		</tr>
		<tr>
			<th>地税登记号</th>
			<td>
				<input value="${cstCustomer.custLocalTaxNo}" name="cstCustomer.custLocalTaxNo" size="20" /></td>
			<th>国税登记号</th>
			<td><input value="${cstCustomer.custNationalTaxNo}" name="cstCustomer.custNationalTaxNo" size="20" /></td>
		</tr>
	</table>
</form>
<p>　</p>
</body>
</html>
<script type="text/javascript">
	$(function(){
		$("#saveId").click(function(){
			
			$.ajax({
				type: "POST",
  				url: "${basePath}/cust_update",
   				data: $("form").serialize(),
  				success: function(data){
    			 	window.location.href="${basePath}/cust_list";
				}
			});
			
			
		});
		
		
		
	});




</script>