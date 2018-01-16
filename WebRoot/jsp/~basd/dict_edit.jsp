<%@page contentType="text/html; charset=utf-8" %>
<%@include file="/common/comm.jsp" %>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/script/common.js"></script>
<script type="text/javascript" src="../script/jquery-1.4.2.min.js"></script>
<script type="text/javascript">
	function getObj(obj){
		var a = document.getElementById(obj);
		return a;
	}
	$(document).ready(function(){
		$("#bt").click(function(){
		var editable = 0;
		if(getObj("editable").checked){
			editable = 1;
		}
			$.ajax({
   				type: "POST",
   				url: "dictTransAtion_update",
  				 data: "db.dictId=${db.dictId}&db.dictType="+$("#dictType").val()+"&db.dictItem="+$("#dictItem").val()+"&db.dictValue="+$("#dictValue").val()+"&db.dictIsEditable="+editable,
  			 	success: function(msg){
  					 alert("成功");
     				location.href="seldict_SelByPage";
   				}
			});
		});
	});
</script>
</head>
<body>

<div class="page_title">数据字典管理 > 编辑数据字典条目</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" id="bt">保存</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>${db.dictId}</td>
		<th>类别</th>
		<td><input value="${db.dictType}" type="text" id="dictType" /><span class="red_star">*</span><br /></td>
	</tr>
	<tr>
		<th>条目</th>
		<td><input value="${db.dictItem}" type="text" id="dictItem" /><span class="red_star">*</span></td>
		<th>值</th>
		<td><input value="${db.dictValue}" type="text" id="dictValue" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>是否可编辑</th>
		<td><input type="checkbox" checked id="editable" /></td>
		<th>&nbsp;</th>
		<td></td>
	</tr>
</table>
</body>
</html>