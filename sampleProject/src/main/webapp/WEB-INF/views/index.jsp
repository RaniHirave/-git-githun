<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<link rel="stylesheet" href="css/site.css"/>
</head>
<body>
	<h2 class="red">Online Book Shop</h2>
	<form:form modelAttribute="cred" action="login">
		<table>
			<tr>
				<td><form:label path="email">Email : </form:label></td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td><form:label path="password">Password : </form:label></td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Sign In"/></td>
			</tr>
		</table>
	</form:form>
</body>

</html>
