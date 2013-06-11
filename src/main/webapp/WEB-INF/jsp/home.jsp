<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projeto ES - Cookbook</title>
<%@ include file="common/libs.jsp" %>
</head>
<body>
<center>
	<h1><img src="/static/img/title.png" alt="CookBook" width="346" height="66"></h1>
	Bem vindo! Hoje é dia ${currentTime}<br>
	
		<div align="center">
			<table width="60%" border="0">
	  			<tr>
	    		<td bgcolor="#99CC66">&nbsp;</td>
	  			</tr>
  			</table>
		</div>	
	<br>
	<a href="/recipes/create" class="btn btn-small btn-success">Criar Receitas</a>
	<br>
	<br>
	<a href="/recipes" class="btn btn-small btn-primary">Listar Receitas</a>
	<br>
	<br>
	<a href="/recipes/search" class="btn btn-small btn-primary">Procurar Receitas</a>
	<br>
</center>
</body>
</html>