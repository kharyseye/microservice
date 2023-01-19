<%@page import="com.groupeisi.microservices.entities.Roles"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Roles</title>
	</head>
	<body>
		<table>
			<tr>
				<td>ID</td>
				<td>NAME</td>
			</tr>
			<c:forEach items="${all_roles}" var="roles">
				<tr>
				<td>${roles.id}</td>
				<td>${roles.name}</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>