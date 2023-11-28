<%@page import="com.components.Students"%>
<%@page import="java.util.List"%>
<%@page import="com.db.StudentDao"%>
<%@page import="com.db.StudentDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/allstudents.css">
</head>
<body>
<%
int tid=(int) session.getAttribute("tid");
String name=(String) session.getAttribute("tname");
StudentDB db=new StudentDao();
 if(tid!=0 && name!=null){
	 List<Students> std=db.getStudentAsc();
%>
 <div class="home"><a href=""><b>Home</b></a> <h2>STUDENTS LIST</h2></div>
    <div class="block">
        <table border="1">
            <tr bgcolor="red" style="color: white;">
                <th style="width: 10px;">SRNO</th>
                <th style="width: 15px;">Reg No</th>
                <th style="width: 70px;">Name</th>
                <th style="width: 30px;">Course</th>
                <th style="width: 30px;">Semester</th>
            </tr>
            <%for(Students s:std){ %>
            <tr>
                <td><%=s.getId() %></td>
                <td><%=s.getRegistrationno() %></td>
                <td><%=s.getName() %></td>
                <td><%=s.getCourse() %></td>
                <td><%=s.getSemester() %></td>
            </tr>
            <%} %>
        </table>
    </div>
    <%}else {%>
    <h1>Not Login</h1>
    <%} %>
</body>
</html>