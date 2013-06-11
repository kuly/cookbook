<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projeto ES - Resultados de Procura</title>
<%@ include file="common/libs.jsp" %>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<center><h1><img src="/static/img/listaReceitas.png" width="599" height="66"></h1></center>
			
			<div>
			<div align="center">
				<table width="60%" border="0">
  					<tr>
    				<td bgcolor="#99CC66">&nbsp;</td>
  					</tr>
				</table>
			</div>
			<br/><br/>
			<ul>
				<c:forEach var="recipe" items='${recipes}'>
				<li>
				<a href="/recipes/${recipe.externalId}">${recipe.title}</a> Opções:<a href="/recipes/${recipe.externalId}/delete" class="btn btn-small btn-primary">Apagar</a> <br/>
			</c:forEach>
			</ul>
			<script type="text/javascript">
  				document.getElementById('date').value = Date();
			</script>
			<br/>
			<a href="/" class="btn btn-small btn-primary">Home</a>
		</div>
	</div>
</div>
</body>
</html>