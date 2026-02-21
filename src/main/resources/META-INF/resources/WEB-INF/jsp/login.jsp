<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Login Page - JSP</title>
</head>
<body>
	<!-- <h1>Welcome to the login page ${namek}!! - JSP</h1>  // THIS IS FOR OLD LOGIN with name -->
	<div class="container">
	<h1>Welcome to the login page</h1>
	<pre>${errorMessage}</pre>
	<form method="post">
		Name: <input type="text" name="name1"> Password: <input
			type="password" name="password"> <input type="submit">
	</form>
	</div>
</body>
</html>