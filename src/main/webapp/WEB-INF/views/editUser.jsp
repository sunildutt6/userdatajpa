<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit and Update User</title>
</head>
<body>

	<h2>Edit User</h2>

	<pre>
	<form action="saveUser" method="post">
Id:<input type="text" name="id" value="${user.id}" readonly="readonly" />
Name:<input type="text" name="name" value="${user.name}" />
Email:<input type="text" name="email" value="${user.email}" />
Password:<input type="text" name="password" value="${user.password}" />
<input type="submit" value="Save" />
	</form>
</pre>

</body>
</html>