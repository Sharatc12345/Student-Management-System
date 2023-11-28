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
        text-align: center;
        background-color: red;
    }
    .head h2{
        margin-top: 0px;
        color: white;
        font-weight: bolder;
    }
    .list{
        border: 2px solid;
        height: 650px;
        overflow: auto;
    }
    .list table{
        width: 100%;
    }
    </style>
</head>
<body>
<%int id=(int) session.getAttribute("uid"); 
 String name=(String) session.getAttribute("uname");
 if(id!=0 && name!=null){
 
 %>
    <div class="head"><h2>Student List</h2></div>
    <div class="list">
        <table border="1">
            <tr style="background-color: blueviolet; color: white;">
                <th>Id</th>
                <th>RegNo</th>
                <th>Name</th>
                <th>Course</th>
                <th>Semester</th>
                <th>College</th>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </table>
    </div>
    <%}else{} %>
</body>
</html>