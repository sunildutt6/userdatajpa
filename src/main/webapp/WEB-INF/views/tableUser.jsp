<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All User</title>
<style>
table, th, td {
	border: 1px solid black;
	padding: 10px;
	margin: 5px;
}
</style>
</head>
<body>
	<h1>Displaying all Users</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>

		<c:forEach items="${allUsers }" var="all">
			<tr>
				<td>${all.id}</td>
				<td>${all.name}</td>
				<td>${all.email}</td>
				<td>${all.password}</td>
			</tr>
		</c:forEach>
	</table>

	<form action="editUser" method="post">

		<h2>Find User</h2>
		<pre>
		Id:<input type="text" name="id" /> 
		<input type="submit" value="Find" />
		</pre>


	</form>

















</body>
</html>