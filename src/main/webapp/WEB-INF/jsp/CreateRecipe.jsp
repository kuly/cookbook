<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Projeto ES - Criar Receita</title>
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
				<form method="post" action="/recipes" >	
					<table class="table">
						<table width="60%" border="0">
							<tr>
	                            <td width="17%"><p>Titulo:</p></td>
	                            <td width="83%"><input type ="text" name="titulo"/></td>
	                        </tr>
	                        <tr>
	                            <td>Problema:</td>
	                            <td><input type ="text" name="problema"/></td>
                          	</tr>
                          	<tr>
	                            <td>Solução:</td>
	                            <td><input type ="text" name="solucao"/></td>
                          	</tr>
                          	<tr>
	                            <td>Autor:</td>
	                            <td><input type ="text" name="autor"/></td>
                          	</tr>
                          	<tr>
	                            <td>Tags:</td>
	                            <td><input type ="text" name="tags"/></td>
                          	</tr>
						</table>
					</table>
					<br/>		
					<input type="submit" value="Criar Receita" />
					<script type="text/javascript">
					  document.getElementById('date').value = Date();
					</script>
					<br/><br/>	
					<input type="reset" value="Reset" style="color:RED" />

				</form>	
			</div>
					<button><a href="/"><b>Home</b></a></button>
		</div>
	</div>
</div>
</body>

</html>