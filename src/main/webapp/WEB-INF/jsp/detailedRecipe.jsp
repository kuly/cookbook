<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recipe ${recipe.id}</title>
<%@ include file="common/libs.jsp" %>
</head>
<body>
	<center><h1>${recipe.titulo}</h1></center>
	<b>Problema</b>
	<p>	${recipe.problema}</p>
	<b>Solução</b>
	<p>	${recipe.solucao}</p>
	<b>Autor</b>
	<p>	${recipe.autor}</p>
	
	<button><a href="/recipes"><b>Voltar</b></a></button>
	<button><a href="/"><b>Home</b></a></button>
</body>
</html>