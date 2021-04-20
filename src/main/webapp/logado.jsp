<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logado</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
</head>
<body>

	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<h1 class="display-4">
				Bem vindo nome :
				<%=request.getAttribute("nameUser")%>
			</h1>
		</div>
	</div>

</body>
</html>