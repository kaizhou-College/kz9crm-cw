<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../../common/comm.jsp" %>


 <s:iterator value="customers" var="customer" status="index">
		<tr>
			<td class="list_data_number">${index.index+1}</td>
			
			<td class="list_data_text">${customer.custNo}</td>
			<td class="list_data_ltext">${customer.custName}</td>
			<td class="list_data_text">${customer.custRegion}</td>
			<td class="list_data_text">${customer.custManagerName}</td>
			<td class="list_data_text">${customer.custLevelLabel}</td>
			<td class="list_data_op">
				<img onclick="to('${basePath}/cust_edit?cstCustomer.custNo=${customer.custNo}');" title="编辑" src="${basePath}/images/bt_edit.gif" class="op_button" />
				<img onclick="to('${basePath}/cust_linkman?cstCustomer.custNo=${customer.custNo}');" title="联系人" src="${basePath}/images/bt_linkman.gif" class="op_button" />
				<img onclick="to('${basePath}/cust_active?cstCustomer.custNo=${customer.custNo}');" title="交往记录" src="${basePath}/images/bt_acti.gif" class="op_button" />
				<img onclick="to('${basePath}/cust_orders?cstCustomer.custNo=${customer.custNo}');" title="历史订单" src="${basePath}/images/bt_orders.gif" class="op_button" />
				<img title="删除" src="${basePath}/images/bt_del.gif" class="op_button1" value="${customer.custNo}"/>
			</td>
		</tr>
	</s:iterator>
	<tr>
	<th colspan="100" class="pager">
	<div class="pager">
		共<s:property value="count"/>条记录 每页<input value="<s:property value='pageSize'/>" size="2" />条
		<kz:page max="${max}" url="${basePath}/cust_list" page="${page}"></kz:page>
		转到<input id="toId" size="2" />页
		<button width="20" id="go">GO</button>
	</div>
		</th>
	</tr>
<script type="text/javascript">
	$(function(){
		
		$(".op_button1").each(function(){
			$(this).click(function(){

				var id=$(this).attr("value");

				window.location.href="cust_delcust?cstCustomer.custNo="+id;
			});
			
		});
	});
</script>

