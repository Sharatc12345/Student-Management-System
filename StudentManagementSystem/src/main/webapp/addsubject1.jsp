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
</head>
<body>
<%int id=(int) session.getAttribute("uid"); 
 String name=(String) session.getAttribute("uname");
 if(id!=0 && name!=null){
 
 %>
 <form action="selectcs">
 <%AccessFree af=new AccessFree2(); %>
        Select Course:
        <select name="cour" id="">
        <option>-----Select-----</option>
        <%List<Courses> cou=af.getAllCourses();
        for(Courses c:cou){%>
            <option value="<%=c.getName()%>"><%=c.getName() %></option>
            <%} %>
        </select>
        Select Semester:
        <select name="semi" id="">
        	<option>-----Select-----</option>
            <option value="I Semester">I Semester</option>
            <option value="II Semester">II Semester</option>
            <option value="III Semester">III Semester</option>
            <option value="IV Semester">IV Semester</option>
            <option value="V Semester">V Semester</option>
            <option value="VI Semester">VI Semester</option>
        </select>
         <button type="submit">Submit</button>
    </form>
    <%} %>
</body>
</html>