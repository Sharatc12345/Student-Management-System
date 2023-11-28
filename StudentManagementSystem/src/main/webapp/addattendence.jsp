<%@page import="com.db.StudentDao"%>
<%@page import="com.db.StudentDB"%>
<%@page import="com.components.Students"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/addattendence.css">
</head>
<body>
	<%
int tid=(int) session.getAttribute("tid");
 String name=(String) session.getAttribute("tname");
  if(tid!=0 && name!=null){
 %>
<%
String course=(String) session.getAttribute("c");
String sem=(String) session.getAttribute("s");

StudentDB db=new StudentDao();
List<Students> std=db.getStudentsByCourseSem(course, sem);
 %>

	<div class="c1">
	  <a href="teacherprofile.jsp" style="text-align: left;">HOME</a>
		<P>
			<b>STUDENT ATTENDENCE</b>
		</P>
	</div>
	<!-- <h2 style="text-align: center;">STUDENT ATTENDENCE</h2> -->
	<div class="container">
		<table border="1">
			<tr
				style="background-color: red; position: sticky; top: 0; color: white;">
				<th>Sid</th>
				<th>Student Name</th>
				<th>Semester</th>
				<th>Course</th>
				<th colspan="2" style="width: 70px;">Attendence</th>
			</tr>
			<%for(Students s:std) {%>
			<tr style="background-color: rgb(210, 231, 243);">
				<td><%=s.getId()%></td>
				<td><%=s.getName() %></td>
				<td><%=s.getSemester()%></td>
				<td><%=s.getCourse()%></td>
				<td style="width: 70px; border: none;"><form action="addattendence">
				<input type="hidden" value="<%=s.getId()%>" name="sid">
						<input type="hidden" value="P" name="atd">
						<button type="submit"
							style="background-color: green; color: white;">Present</button>
					</form></td>
				<td style="width: 70px; border: none;"><form action="addattendence">
				<input type="hidden" value="<%=s.getId()%>" name="sid">
						<input type="hidden" value="A" name="atd">
						<button type="submit" style="background-color: red; color: white;">Absent</button>
					</form></td>
			</tr>	
			<%} %>
		</table>
	</div>
	<%} 
	else{%>
  <h1>Login First</h1>
  <%}%>
</body>
</html>