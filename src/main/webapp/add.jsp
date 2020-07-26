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
<script type="text/javascript">
	$(function(){
		$.post("queryCate",function(data){
			for(var i in data){
				$("#cid").append("<option value='"+data[i].cid+"'>"+data[i].cname+"</option>");
			}
			
			$("#cid").val("${param.cid}");
		})
	})
</script>
</head>
<body>
	<form action="addBlog" method="post">
		标题:<input type="text" name="title"><br>
		分类:<select id="cid" name="cid">
				<option value="">请选择</option>
			</select><br>
		内容:<input type="text" name="content"><br>
		标签:<input type="text" name="label"><br>
		<input type="submit" value="保存">
	</form>
</body>
</html>