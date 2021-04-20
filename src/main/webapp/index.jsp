<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="css/form.css" >
</head>

<body>
	<div class="container-fluid text-center">

		<form action="Login" method="post">
			<small style="color: red"> <% if(request.getAttribute("falhalogin") == "Falhou") { %>
			<span>Usuário ou senha incorreta!</span><% } %></small>
			<h2>Login</h2>
			<div class="form-group">
				<label for="usr">Email:</label> <input type="text"
					class="form-control" name="eml" id="eml" maxlength="15">
			</div>
			<div class="form-group">
				<label for="psw">Senha:</label> <input type="password"
					class="form-control" name="psw" id="psw" maxlength="15"
					pattern="[A-Za-z0-9]*" required>
			</div>
			<input type="submit" class="btn btn-primary" value="Entrar">
			<input type="reset" class="btn btn-primary" value="Limpar">
			<hr>

			<div class="txtFace">
				<a href="esqueceuSenha.jsp">Esqueceu a Senha?</a>
			</div>
		</form>

	</div>

</body>
</html>
