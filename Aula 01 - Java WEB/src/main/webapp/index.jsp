<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

<link rel"stylesheet" href="style/style.css">

<meta charset="ISO-8859-1">
	<title>FIAP</title>
</head>

<body>

	<form name="form" action="home.jsp" method="post">
		<label for="nome">Nome: </label>
		<input type="text" id="nome" name="nome" value="" size="30">
		<label for="senha">Senha: </label>
		<input type="password" id="senha" name="senha" value="" size="20">
		<input type="submit" value="entrar">
	</form>

</body>
</html>