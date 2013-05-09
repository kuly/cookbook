<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<center><h1><img src="/static/img/criarReceita.png" width="346" height="66"></h1></center>
<div>
<form method="post" action="/recipes" >
	Titulo:<input type ="text" name="titulo"/><br/>
	Problema:<input type ="text" name="problema"/><br/>
	Solução:<input type ="text" name="solucao"/><br/>
	Autor:<input type ="text" name="autor"/><br/>
	
	<input type="submit" value="Criar Receita" />
	

<script type="text/javascript">
  document.getElementById('date').value = Date();
</script>
</form>
</div>

<button><a href="/"><b>Home</b></a></button>



</body>
</html>