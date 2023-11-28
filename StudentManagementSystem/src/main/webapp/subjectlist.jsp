<%@page import="com.components.Subjects"%>
<%@page import="java.util.List"%>
<%@page import="com.db.SubjectDao"%>
<%@page import="com.db.SubjectDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        .head{
            border: 2px solid red;
            height: 30px;
            background-color: red;
            color: white;
        }
        .table{
            border: 2px solid ;
            height: 663px;
        }
        .head h2{
            margin: 0px;
            text-align: center;
        }
        .table table{
            width: 100%;
        }
    </style>
</head>
<body>
<%int id=(int) session.getAttribute("uid"); 
 String name=(String) session.getAttribute("uname");
 if(id!=0 && name!=null){
   
 %>
    <div class="head"><h2>SUBJECT-LIST</h2></div>
    <div class="table">
        <table border="1">
            <tr style="background-color: blueviolet; color: white;">
                <th>SRNO</th>
                <th>SUBJECT_CODE</th>
                <th>SUBJECT</th>
                <th>SEMESTER</th>
                <th>COURSE</th>
            </tr>
            <%SubjectDB db=new SubjectDao();
            List<Subjects> sub=db.read();
            for(Subjects s:sub){
            	int cid=s.getCourseid();
            	
            %>
            <tr>
                <td><%=s.getId() %></td>
                <td><%=s.getSubjectcode() %></td>
                <td><%=s.getSubjectname() %></td>
                <td><%=s.getSemester() %></td>
                <% %>
                <td><%=s.getCourseid() %></td>
            </tr>
            <%} %>
        </table>
    </div>
    <%} %>
</body>
</html>
