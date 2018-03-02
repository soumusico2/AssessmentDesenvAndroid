<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulário</title>
</head>
<body>
	<h4>Formulário</h4>
	<form action="adicionarConta" method="post">
		Descrição:<br/>
		<textarea name="descricao" rows="5" cols="100"></textarea>
		<br/>
		<br/><br/>
		<input type="submit" value="Adicionar">
	</form>
</body>
</html>