<%@page import="com.components.Colleges"%>
<%@page import="com.pub.resources.AccessFree2"%>
<%@page import="com.pub.resources.AccessFree"%>
<%@page import="com.components.Courses"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/register.css">
<link rel="stylesheet" href="style/default.css">
</head>
<body>
 <div class="registration-form">
		<h2>Registration Form</h2>
		<form action="sregister" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="name">Name<super>*</super></label> 
				<input type="text" id="name" name="sname" required>
			</div>
			<div class="form-group">
				<label for="fathername">Father's Name<super>*</super></label>
				 <input type="text" id="fathername" name="sfathername" required> 
			</div>
			<div class="form-group">
				<label for="mothername">Mother's Name<super>*</super></label>
				 <input type="text" id="mothername" name="smothername" required>
			</div>
			<div class="form-group">
				<label for="gender">Gender:<super>*</super></label> 
				<select id="gender" name="sgender" required>
					<option value="male">Male</option>
					<option value="female">Female</option>
				</select>
			</div>
			<%AccessFree af=new AccessFree2();
			  List<Colleges> col=af.getAllColleges();
			 
			%>
			<div class="form-group">
				<label for="course">Select College:<super>*</super></label> 
				<select id="course" name="scourse" required>
					<option>SELECT-OPTIONS</option>
					<%for(Colleges clg:col) {%>
					<option value="<%=clg.getName()%>"><%= clg.getName()%></option>
					<%} %>
				</select>
			</div>
			<%
			  List<Courses> cou=af.getAllCourses();
			 
			%>
			<div class="form-group">
				<label for="course">Select Course:<super>*</super></label> 
				<select id="course" name="scourse" required>
					<option>SELECT-OPTIONS</option>
					<%for(Courses c:cou){ %>
					<option value="<%=c.getName()%>"><%=c.getName() %></option>
					<%} %>
				</select>
			</div>
			<div class="form-group">
				<label for="semester">Select semester:<super>*</super></label> 
				<select id="semester" name="ssemester" required>
					<option>SELECT-OPTIONS</option>
					<option value="I Semester">I Semester</option>
					<option value="II Semester">II Semester</option>
					<option value="III Semester">III Semester</option>
					<option value="IV Semester">IV Semester</option>
					<option value="V Semester">V Semester</option>
					<option value="VI Semester">VI Semester</option>
				</select>
			</div>
			<div class="form-group">
				<label for="dob">Date of Birth<super>*</super></label>
				 <input type="date" id="dob" name="sdob" required>
			</div>
			<div class="form-group">
				<label for="address">Address<super>*</super></label> 
				<input type="text" id="address" name="saddress" required>
			</div>
			<div class="form-group">
				<label for="mobile">Mobile Number<super>*</super></label>
				 <input type="tel" id="mobile" name="smobile" required>
			</div>
			<div class="form-group">
				<label for="email">Email:</label> 
				<input type="email" id="email" name="semail" required>
			</div>
			<div class="form-group">
				<label for="password">Password<super>*</super></label> 
				<input type="password" id="password" name="spassword" required>
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password<super>*</super></label> 
				<input type="password" id="confirmPassword" name="sconfirmPassword" required>
			</div>
			<div class="form-group file-input">
				<label for="file">Upload a Image:</label>
				 <input type="file" id="file" name="simage" required>
			</div>
			<div>
			<input type="checkbox" value="accept" name="scheck" required="required"><b>Accept Tearms and Condition</b>
			</div>
			<button type="submit" class="submit-button">Submit</button>
		</form>
		<h4>Already have an account?<a href="login.jsp">LOGIN</a></h4>
	</div>
 
</body>
</html>