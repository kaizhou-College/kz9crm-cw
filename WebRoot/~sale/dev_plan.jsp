<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/jquery-1.4.2.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			var now=new Date();
			var timeString = now.toLocaleDateString();
			$("#date").val(timeString);
			$("#save").click(function(){
				location.href="transaction_AddPlan?sdate="+$("#date").val()+"&salplan.plaTodo="+$("#plaTodo").val();
			});
		});	
	</script>
</head>
<body>

<div class="page_title">客户开发计划 &gt; 制定计划</div>
<div class="button_bar">
	<button class="common_button" >帮助</button>
	<button class="common_button" onclick="to('dev_execute.html');">执行计划</button>
	<button class="common_button" onclick="back();">返回</button>
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>1</td>
		<th>机会来源</th>
		<td>
			　</td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td>睿智电脑</td>
		<th>成功机率（%）</th>
		<td>&nbsp;70</td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3">采购笔记本电脑意向</td>
	</tr>
	<tr>
		<th>联系人</th>
		<td>刘先生</td>
		<th>联系人电话</th>
		<td>13729239239</td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3">...</td>
	</tr>
	<tr>
		<th>创建人</th>
		<td>刘颖</td>
		<th>创建时间</th>
		<td>2007年12月06日 16时09分08秒</td>
	</tr>
	<tr>
		<th>指派给</th>
		<td>
			郭小美</td>
		<th>指派时间</th>
		<td>
			2007年12月07日 09时00分38秒</td>
	</tr>
</table>
<br />
<table class="data_list_table" id="table1">
	<tr>
		<th width="150px">日期</th>
		<th height="31">计划项</th>
	</tr>
	<tr>
		<td class="list_data_text">2008年02月22日</td>
		<td class="list_data_ltext"><input size="50" value="推介产品。" name="T1" />
	<button class="common_button">保存</button>
	<button class="common_button" onclick="del('');">删除</button>
		</td>
	</tr>
</table>
<div class="button_bar">
	<button class="common_button" id="save">保存</button>
	</div>
<table class="query_form_table" id="table2">
	<tr>
		<th>日期</th>
		<td><input type="text" id="date"/><span class="red_star">*</span></td>
		<th>计划项</th>
		<td>
			<input type="text" id="plaTodo" size="50"/><span class="red_star">*</span>
		</td>
	</tr>
</table>
</body>
</html>