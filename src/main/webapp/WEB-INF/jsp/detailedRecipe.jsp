<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Receita ${recipe.externalId}</title>
<%@ include file="common/libs.jsp" %>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<center><h1>${recipe.title}</h1></center>
		<div>
		<div align="center">
			<table width="60%" border="0">
  				<tr>
    			<td bgcolor="#99CC66">&nbsp;</td>
  				</tr>
			</table>
		</div>
				<br/><br/>	
				<b>Problema</b>
				<p>	${recipe.problem}</p>
				<b>Solução</b>
				<p>	${recipe.solution}</p>
				<b>Autor</b>
				<p>	${recipe.author}</p>
				<b>Data</b>
				<p>	${recipe.creationTimestamp}</p>
				<br/><br/>
				<button><a href="/recipes"><b>Apagar Receita </b></a></button>
				<button><a href="/recipes"><b>Voltar</b></a></button>
				<button><a href="/"><b>Home</b></a></button>
		</div>
		</div>
	</div>
</div>
</body>
</html>