<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Show User</title>
</head>
<body>

	<h1>Form Creating User</h1>
	<form action="saveUser" method="post">
		<pre>
Id:<input type="text" name="id" />
Name:<input type="text" name="name" />
Email:<input type="text" name="email" />
Password:<input type="text" name="password" />
<input type="submit" value="Save" />
</pre>
	</form>

	<b>${message}</b>
	<br>
	
	<a href="tableUser">View All User</a>
</body>
</html>