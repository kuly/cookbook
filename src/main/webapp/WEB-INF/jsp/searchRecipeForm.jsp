<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projeto ES - Procurar Receita</title>
<%@ include file="common/libs.jsp" %>
</head>
<body>
	<form method="post" action="/recipes/search">
		<input type="text" placeholder= "Insira parametros de pesquisa" name= "searchParams" />
		<input type="submit" value="Procura" />	
	</form>

</body>
</html>