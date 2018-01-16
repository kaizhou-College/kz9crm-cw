<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://kzxy/px/2018/01/06/11/46/classroom"  prefix="kzfy"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://yjy.191.137:59421/byPage"  prefix="pxfy"%>
<%@taglib uri="http://crms/currentpage" prefix="fy"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://kzxy/px/PageDim"  prefix="pageDim"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath",basePath);
%>
