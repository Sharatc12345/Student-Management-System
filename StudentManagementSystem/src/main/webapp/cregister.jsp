<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style/register.css">
<link rel="stylesheet" href="style/default.css">
<title>Insert title here</title>
</head>
<body>
  <div class="registration-form">
		<h2>Registration Form</h2>
		<form action="addcollege" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="name">Name<super>*</super></label> 
				<input type="text" id="name" name="cname" required>
			</div>
			<div class="form-group">
				<label for="name">Owner<super>*</super></label> 
				<input type="text" id="name" name="cowner" required>
			</div>
			<div class="form-group">
				<label for="mobile">Mobile Number<super>*</super></label>
				 <input type="tel" id="mobile" name="cmobile" required>
			</div>
			<div class="form-group">
				<label for="email">Email:</label> 
				<input type="email" id="email" name="cemail" required>
			</div>
			<div class="form-group">
				<label for="password">Password<super>*</super></label> 
				<input type="password" id="password" name="cpassword" required>
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password<super>*</super></label> 
				<input type="password" id="confirmPassword" name="cconfirmPassword" required>
			</div>
			 <input type="checkbox" id="check" name="ccheck" value="accept" required="required">Accept Terms and Conditions 
			 <br><br>
			<button type="submit" class="submit-button">Submit</button>
			
		</form>
		<h4>Already have an account?<a href="clogin.jsp">LOGIN</a></h4>
	</div>
</body>
</html>