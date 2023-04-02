<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div style="text-align: center;">
		<form action="login" method="post">
			<label for="username">Username</label> <input type="text"
				id="username" name="username"> <br> <br> <label
				for="password">Password</label> <input type="password" id="password"
				name="password"> <br><br>
			<button type="submit"
				style="background-color: green; font-size: 25px; border: none; border-radius: 3px;">Login</button>
		</form>
	</div>
</body>
</html>