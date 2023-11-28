<%@page import="com.components.Courses"%>
<%@page import="java.util.List"%>
<%@page import="com.db.CoursesDao"%>
<%@page import="com.db.CourseDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String course=(String) session.getAttribute("cour");
	
String sem=(String) session.getAttribute("semi");
%>
	<h1><%=course %></h1>
	<h1><%=sem %></h1>
	<%
if(course!=null && sem!=null){
CourseDB db=new CoursesDao();
Courses c=db.byName(course);
%>
	<div class="head"></div>
	<div class="form">
		<form action="addsubjects">
			Subject Code:<input type="text" name="subjectcode"> <br>
			Subject Name: <input type="text" name="subjectname"><br>
			CourseId: <input type="text" value="<%=c.getId()%>" name="courseid">
			<br> Semester: <input type="text" value="<%=sem %>"
				name="semester"> <br>
			<button type="submit">Submit</button>
		</form>
	</div>
	<%}%>
</body>
</html>