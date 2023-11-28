<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/default.css">
<link rel="stylesheet" href="style/slogin.css">
</head>
<body>
   <h1><c:out value="<%=10+20 %>"></c:out></h1>
	<div class="login-form">
		<h2>Student Login</h2>
		<form action="slogin" method="post">
			<div class="form-group">
				<label for="username">Mobile Number or Email:</label> <input
					type="text" id="username" name="susername" required>
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					id="password" name="spassword" required>
			</div>
			<button type="submit" class="submit-button">Login</button>
		</form>
		<h4>Dont have an account?<a href="register.jsp">Register here</a></h4>
	</div>
</body>
</html>