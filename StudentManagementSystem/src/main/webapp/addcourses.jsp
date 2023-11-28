<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        .coursetitle{
            border: 2px solid red;
            height: 30px;
            background-color: red;
        }
        .coursetitle h2{
            margin-top: 0px;
            text-align: center;
            color: white;
        }
        .form{
            border: 2px solid red;
            height: 100px;
            width: 20%;
            margin: auto;
            margin-top: 50px;
        }
        .form input,button{
             margin-left: 50px;
             margin-top: 10px;
        }
    </style>
</head>
<body>
<%int id=(int) session.getAttribute("uid"); 
 String name=(String) session.getAttribute("uname");
 if(id!=0 && name!=null){
 
 %>
    <div class="coursetitle"><h2>Add Courses</h2></div>
    <div class="form">
        <form action="addcourses">
         <input type="text" name="coursecode" placeholder="ENTER CODE"><br>
         <input type="text" name="coursename" placeholder="ENTER NAME"><br>
         <button type="submit">Submit</button>
        </form>
    </div>
    <%} %>
</body>
</html>