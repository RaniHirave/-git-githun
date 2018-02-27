<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Cart</title>
</head>
<body>
	<c:set var="sr" value="1" scope="page"/>
	<c:set var="total" value="0.0" scope="page"/>
	<table border="1">
		<tr style="background-color: gray; font-weight: bold;">
			<td>SR</td>
			<td>ID</td>
			<td>Name</td>
			<td>Author</td>
			<td>Subject</td>
			<td>Price</td>
		</tr>
		<c:forEach var="b" items="${bookList}">
			<tr>	
				<td>${sr}</td>
				<td>${b.id}</td>
				<td>${b.name}</td>
				<td>${b.author}</td>
				<td>${b.subject}</td>
				<td>${b.price}</td>
			</tr>		
			<c:set var="total" value="${total + b.price}" scope="page"/>
			<c:set var="sr" value="${sr + 1}" scope="page"/>			
		</c:forEach>
	</table>
	<br/><br/>
	Books Count: ${cart.size()} <br/> 
	Total : Rs. ${total} /- <br/><br/>
	
	<spring:url var="logoutUrl" value="logout"/>
	<a href="${logoutUrl}">Sign Out</a>
</body>
</html>

