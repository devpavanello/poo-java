<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
	<title>HOME</title>

</head>

	<body>
		Nome:
		<%=request.getParameter("nome") %>
		<br>
		<%
		String senha = request.getParameter("senha");
		
		if(senha.equals("12345"))
		{
			%>
			<b>Login efetuado com sucesso</b>
			<% 
		}else 
		{
			%>
			<b>Senha Incorreta</b>
			<%
		}
		%>
		<br>
		<a href="index.jsp"> Voltar</a>
		
	</body>
	
</html>