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
		<form action="add" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="name">Name<super>*</super></label> 
				<input type="text" id="name" name="tname" required>
			</div>
			<div class="form-group">
				<label for="fathername">Incharge<super>*</super></label>
				 <input type="text" id="incharge" name="tincharge" required> 
			</div>
			<div class="form-group">
				<label for="mothername">Subject<super>*</super></label>
				 <input type="text" id="subject" name="tsubject" required>
			</div>
			<div class="form-group">
				<label for="mothername">Qualification<super>*</super></label>
				 <input type="text" id="qualification" name="tqualification" required>
			</div>
			<div class="form-group">
				<label for="gender">Gender:<super>*</super></label> 
				<select id="gender" name="tgender" required>
					<option value="male">Male</option>
					<option value="female">Female</option>
				</select>
			</div>
			<div class="form-group">
				<label for="dob">Date of Birth<super>*</super></label>
				 <input type="date" id="dob" name="tdob" required>
			</div>
			<div class="form-group">
				<label for="mobile">Mobile Number<super>*</super></label>
				 <input type="tel" id="mobile" name="tmobile" required>
			</div>
			<div class="form-group">
				<label for="email">Email:</label> 
				<input type="email" id="email" name="temail" required>
			</div>
			<div class="form-group">
				<label for="password">Password<super>*</super></label> 
				<input type="password" id="password" name="tpassword" required>
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password<super>*</super></label> 
				<input type="password" id="confirmPassword" name="tconfirmPassword" required>
			</div>
			<div class="form-group file-input">
				<label for="file">Upload a Image:</label>
				 <input type="file" id="file" name="timage" required>
			</div>
			 <input type="checkbox" id="check" name="tcheck" value="accept" required="required">Accept Terms and Conditions 
			 <br><br>
			<button type="submit" class="submit-button">Submit</button>
			
		</form>
		<h4>Already have an account?<a href="login.jsp">LOGIN</a></h4>
	</div>
</body>
</html>