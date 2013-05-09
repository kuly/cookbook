<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Receitas</title>
<%@ include file="common/libs.jsp" %>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<center><h1><img src="/static/img/listaReceitas.png" width="599" height="66"></h1></center>
			<ul>
				<c:forEach var="recipe" items='${recipes}'>
				<li>
				<a href="/recipes/${recipe.id}">${recipe.titulo}</a> <br />
			</c:forEach>
			</ul>
			<script type="text/javascript">
  				document.getElementById('date').value = Date();
			</script>
			
			<button><a href="/"><b>Home</b></a></button>
		</div>
	</div>
</div>
</body>
</html>