<html>
<head>
<title>Login Page - JSP</title>
</head>
<body>
	<!-- <h1>Welcome to the login page ${namek}!! - JSP</h1>  // THIS IS FOR OLD LOGIN with name -->
	<h1>Welcome to the login page</h1>
	<pre>${errorMessage}</pre>
	<form method="post">
		Name: <input type="text" name="name1"> Password: <input
			type="password" name="password"> <input type="submit">
	</form>
</body>
</html>