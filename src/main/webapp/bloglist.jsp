<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.form.js"></script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
	<a href="add.jsp?cid=${param.cid}">
		<input type="button" value="添加">
	</a>
	<table>
		<tr>
			<td>分类</td>
			<td>标题</td>
			<td>标签</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="s">
			<tr>
				<td>${s.cname}</td>
				<td>${s.title}</td>
				<td>${s.label}</td>
				<td>操作</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>