<%@page contentType="text/html; charset=utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://kzcrm/cw" prefix="cw" %>
<%@include file="/common/comm.jsp" %>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
<script type="text/javascript">
	function dels(obj){
		if(confirm("确认删除吗？")){
			location.href="dictTransAtion_delete?db.dictId="+obj;
		}
	}
</script>
</head>
<body>

<div class="page_title">数据字典管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('~basd/dict_add.jsp');">新建</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>类别</th>
		<td><input /></td>
		<th>条目</th>
		<td><input /></td>
		<th>值</th>
		<td><input /></td>
	</tr>
</table>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>类别</th>
		<th>条目</th>
		<th>值</th>
		<th>是否可编辑</th>
		<th>操作</th>
	</tr>
		<c:forEach items="${list}" var="list">
			<tr>
				<td class="list_data_number">${list.dictId}</td>
				<td class="list_data_ltext">${list.dictType}</td>
				<td class="list_data_text">${list.dictItem}</td>
				<td class="list_data_text">${list.dictValue}</td>
				<td class="list_data_text"><c:if test="${list.dictIsEditable==1}">可以</c:if><c:if test="${list.dictIsEditable==0}">不可以</c:if></td>
				<td class="list_data_op">
					<c:if test="${list.dictIsEditable==1}"><img onclick="to('seldict_selById?db.dictId=${list.dictId}');" title="编辑" src="${basePath}/images/bt_edit.gif" class="op_button" /></c:if>
					<img onclick="dels(${list.dictId});" title="删除" src="${basePath}/images/bt_del.gif" class="op_button" />
				</td>
			</tr>
		</c:forEach>
	<tr>
		<th colspan="6" class="pager">
<div class="pager">
	<cw:queryByPage count="${listpage.count}" pageIndex="${listpage.pageIndex}" pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}" pageUrl="${listpage.pageUrl}"></cw:queryByPage>
</div>
		</th>
	</tr>
</table>
</body>
</html>