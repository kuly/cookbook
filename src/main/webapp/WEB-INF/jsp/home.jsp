<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projeto ES - Cookbook</title>
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
	<button><a href="/recipes"><b>Listar Receitas</b></a><br/></button>
	<br>
	<br>
	<button><a href="/recipes/create"><b>Criar Receitas</b></a></button>
	<br>
</center>
</body>
</html>