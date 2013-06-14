<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Projeto ES - Editar Receita</title>
<%@ include file="common/libs.jsp" %>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<center><h1><img src="/static/img/criarReceita.png" width="346" height="66"></h1></center>
			<div>
			<div align="center">
				<table width="60%" border="0">
  					<tr>
    				<td bgcolor="#99CC66">&nbsp;</td>
  					</tr>
				</table>
			</div>
			</div>			
			<div>
				<form method="post" action="/editRecipe/${recipe.getExternalId()}" >	
					<table class="table">
						<table width="60%" border="0">
							<tr>
	                            <td width="17%"><p>Titulo:</p></td>
	                            <td width="83%"><input type ="text" name="title" value="${recipe.ultima().title}" /></td>
	                        </tr>
	                        <tr>
	                            <td>Problema:</td>
	                            <td><input type ="text" name="problem" value="${recipe.ultima().problem}"/></td>
                          	</tr>
                          	<tr>
	                            <td>Solução:</td>
	                            <td><input type ="text" name="solution" value="${recipe.ultima().solution}"/></td>
                          	</tr>
                          	<tr>
	                            <td>Autor:</td>
	                            <td><input type ="text" name="author" value="${recipe.ultima().author}"/></td>
                          	</tr>
                          	<tr>
	                            <td>Tags:</td>
	                            <td><input type ="text" name="tags" value="${recipe.ultima().tags}"/></td>
                          	</tr>
						</table>
					</table>
					<br/>			
					<br/><br/>
					<button class="btn btn-small btn-success" type="submit">Gravar</button>
					<br/><br/>	
					<button class="btn btn-small btn-danger" type="reset">Limpar campos</button>
				</form>	
			</div>
					<a href="/" class="btn btn-small btn-primary">Home</a>
		</div>
	</div>
</div>
</body>

</html>