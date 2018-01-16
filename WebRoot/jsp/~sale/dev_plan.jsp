<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
<script type="text/javascript" src="${basePath}/script/js.js"></script>
<script type="text/javascript" src="${basePath}/script/jquery-1.4.2.min.js"></script>
</head>
<body>

<div class="page_title">客户开发计划 &gt; 制定计划</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('dev_execute.html');">执行计划</button>
	<button class="common_button" onclick="back();">返回</button>
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><s:property value="planList.chcId"/>  </td>
		<th>机会来源</th>
		<td>
		<%--<s:property value="planList."/> --%>	 
		</td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td><s:property value="planList.chcCustName"/> </td>
		<th>成功机率（%）</th>
		<td>&nbsp;<%--<s:property value="planList."/>--%> </td>
	</tr>	
	<tr>
		<th>概要</th>
		<td><s:property value="planList.chcTitle"/> </td>
		<th>状态</th>
		<td style="color:red;"><s:property value="planList.chcStatus"/> </td>	
	</tr>
	<tr>
		<th>联系人</th>
		<td><s:property value="planList.chcRate"/> </td>
		<th>联系人电话</th>
		<td><s:property value="planList.chcLinkman"/> </td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3"><s:property value="planList.chcDesc"/> </td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><s:property value="planList.chcCreateBy"/> </td>
		<th>创建时间</th>
		<td><s:property value="planList.chcCreateDate"/> </td>
	</tr>
	<tr>
		<th>指派给</th>
		<td>
			<s:property value="planList.chcDueTo"/> </td>
		<th>指派时间</th>
		<td>
			<s:property value="planList.chcDueDate"/> </td>
	</tr>
</table>
<br />
<table class="data_list_table" id="table1">
	<tr>
		<th width="150px">日期</th>
		<th height="31">计划项</th>
	</tr>
	<s:iterator value="planList.salPlan" var="list">
		<tr>
			<td class="list_data_text">22<s:property value="#list.plaDate"/> </td>
			<td class="list_data_ltext">
				<input size="50" id="plan_doto" value="<s:property value='#list.plaTodo'/> " name="T1" />
				<button class="common_button" onmousedown="ajaxPlanUpdate(<s:property value='#list.plaId'/>)">保存</button>
				<button class="common_button" onmousedown="planDelete('${list.plaId}','${planList.chcId}')" >删除</button>
			</td>
		</tr>
	</s:iterator>
</table>
<table class="query_form_table" id="table2">
	<tr>
		<th>日期</th>
		<td><input name="plaDate" id="planDate"/><span class="red_star">*</span></td>
		<th>计划项</th>
		<td>
			<input size="50" name="T2" id="T2" /><span class="red_star">*</span>
			<button class="common_button" onmousedown="planAdd('${planList.chcId}')">保存</button>
		</td>
	</tr>
</table>
<script type="text/javascript">
	setCurTime('planDate');
	function planAdd(id){
		location.href="plan_planAdd?sc.chcId="+id+"&salplan.plaDate="+$('#planDate').val()+"&salplan.plaTodo="+$('#T2').val();
	}
	function planDelete(id,id1){
		location.href="plan_planDelete?salplan.plaId="+id+"&sc.chcId="+id1;
	}
</script>


</body>
</html>