<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/default.css">
<style>
.login-form {
	max-width: 450px;
	margin: 0 auto;
	padding: 20px;
	background-color: #fff;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
}

.form-group {
	margin-bottom: 15px;
}

.form-group label {
	display: block;
	font-weight: bold;
}

.form-group input {
	width: 90%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

.submit-button {
	background-color: #4CAF50;
	color: #fff;
	padding: 10px 20px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

.submit-button:hover {
	background-color: #45a049;
}
</style>
</head>

<body>
	<h1>
		<c:out value="<%=10 + 20%>"></c:out>
	</h1>
	<div class="login-form">
		<h2>Teachers Login</h2>
		<form action="read" method="post">
			<div class="form-group">
				<label for="username">Mobile Number or Email:</label> <input
					type="text" id="username" name="tname" required>
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
				
					id="password" name="tpassword" required>
			</div>
			<button type="submit" class="submit-button">Login</button>
		</form>
		<h4>
			Dont have an account?<a href="register.jsp">Register here</a>
		</h4>
	</div>
</body>
</html>