<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Erro ao criar</title>
<%@ include file="common/libs.jsp" %>
</head>
<body>
	<img src="/static/img/notpass.jpg" width="175" height="180">
	</br>
	Atenção! Todos os campos excepto o "Tags" são obrigatórios e têm de estar preenchidos
	para poder criar a receita...
	<br/><br/>
	<a href="/recipes/create" class="btn btn-small btn-danger">Voltar a criar</a>
</body>
</html>