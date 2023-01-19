<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Users</title>
	</head>
	<body>
		<table>
			<tr>
				<td>ID</td>
				<td>FIRSTNAME</td>
				<td>LASTNAME</td>
				<td>EMAIL</td>
				<td>PASSWORD</td>
			</tr>
			<c:forEach items="${all_users}" var="users">
				<tr>
				<td>${users.id}</td>
				<td>${users.firstName}</td>
				<td>${users.lastName}</td>
				<td>${users.email}</td>
				<td>${users.password}</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>