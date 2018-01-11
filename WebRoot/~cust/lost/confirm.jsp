<%@page contentType="text/html; charset=utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>

<script type="text/javascript">
	function save(obj){
		var a = document.getElementById("lstReason");
		location.href="cstLostTransAction_Update?cstl.lstReason="+a.value+"&cstl.lstId="+obj;
	}
</script>
<body>
<c:forEach items="${list}" var="cl">
<div class="page_title">客户流失管理 &gt; 确认流失</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="to('relay.html');">暂缓流失</button>
	<button class="common_button" onclick="save(${cl.lstId});">保存</button>
</div>
<table class="query_form_table">
	
	<tr>
		<th>编号</th>
		<td>${cl.lstId}</td>
		<th>客户</th>
		<td>${cl.lstCustName}</td>
	</tr>
	<tr>
		<th>客户经理</th>
		<td>
			${cl.lstCustManagerName}</td>
		<th>上次下单时间</th>
		<td>
			${cl.lstLastOrderDate}</td>
	</tr>
	<tr>
		<th>暂缓措施</th>
		<td colspan="3">
			${cl.lstDelay}
		</td>
	</tr>	
	<tr>
		<th>流失原因</th>
		<td colspan="3">
			<textarea rows="6" cols="50" id="lstReason">${cl.lstReason}</textarea><span class="red_star">*</span></td>
	</tr>

</table>
<br />
</c:forEach>
</body>
</html>