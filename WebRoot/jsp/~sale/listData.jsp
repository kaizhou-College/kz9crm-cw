<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../common/comm.jsp" %>
    <s:iterator value="chances" var="chance">
			<tr>
				<td class="list_data_number">${chance.chcId}</td>
				<td class="list_data_text">${chance.chcCustName}</td>
				<td class="list_data_ltext">${chance.chcTitle}</td>
				<td class="list_data_text">${chance.chcLinkman}</td>
				<td class="list_data_text">${chance.chcTel}</td>
				<td class="list_data_text">${chance.chcCreateDate}</td>
				<td class="list_data_op">
					<img onclick="dueTo(${chance.chcId});" title="指派" src="${basePath}/images/bt_linkman.gif" class="op_button" />
					<img onclick="edit('${chance.chcId}');" title="编辑" src="${basePath}/images/bt_edit.gif" class="op_button" />
					<img id="del_chance" onclick="del(${chance.chcId})" title="删除" src="${basePath}/images/bt_del.gif" class="op_button" />
					
				</td>
			</tr>
		</s:iterator>

	<script type="text/javascript">
		function del(id){
			
			if(confirm("你确定要删除吗？")){
				window.location.href="${basePath}/sale_del?salChance.chcId="+id;
			}
		}
		function dueTo(id){
			window.location.href="${basePath}/sale_queryDis?salChance.chcId="+id;
			
		}
		function edit(id){
			window.location.href="${basePath}/sale_editQuery?salChance.chcId="+id;
			
		}
	
	</script>