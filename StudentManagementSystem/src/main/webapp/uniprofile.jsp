<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        .block1{
            border: 2px solid;
            border: none;
            height: 150px;
            margin-top: 50px;
            display: flex;
            justify-content: space-between;
        }
        .b1{
            border: 2px solid;
            border: none;
            width: 15%;
            box-shadow: 10px 10px 10px grey;
        }
        .b1 h1{
            margin-top: 0px;
        }
        .b1 ul{
            margin-top: -10px;
        }
        .profile{
        border: 2px solid red;
        height: 100px;
        
        }
    </style>
</head>
<body>
<%int id=(int) session.getAttribute("uid"); 
 String name=(String) session.getAttribute("uname");
 if(id!=0 && name!=null){
 
 %>
<div class="profile"></div>
    <div class="block1">
        <div class="b1">
            <h1>PROFILE</h1>
            <ul>
                <li><a href="universityprofile.jsp">open</a></li>
                <li><a href="">update Details</a></li>
                <li><a href="">update mobileno</a></li>
                <li><a href="">update email</a></li>
                <li><a href="">update password</a></li>
            </ul>
        </div>
        <div class="b1">
            <h1>COLLEGES</h1>
            <ul>
                <li><a href="">List</a></li>
                <li><a href="">Generate code</a></li>
                <li><a href="">Get college Details</a></li>
            </ul>
        </div>
        <div class="b1">
            <h1>TEACHERS</h1>
            <ul>
                <li><a href="">List</a></li>
                <li><a href="">Generate TeacherId</a></li>
                <li><a href="">Get Teacher</a></li>
            </ul>
        </div>
        <div class="b1">
            <h1>STUDENTS</h1>
            <ul>
                <li><a href="">List</a></li>
                <li><a href="">Generate Register no</a></li>
                <li><a href="">update</a></li>
                <li><a href="">delete</a></li>
            </ul>
        </div>
    </div>
    <div class="block1">
        <div class="b1">
            <h1>SUBJECTS</h1>
            <ul>
                <li><a href="subjectlist.jsp">List</a></li>
                <li><a href="addsubject1.jsp">Add Subject Details</a></li>
                <li><a href="">update</a></li>
                <li><a href="">delete</a></li>
            </ul>
        </div>
        <div class="b1">
            <h1>COURSES</h1>
            <ul>
                <li><a href="">List</a></li>
                <li><a href="addcourses.jsp">Add Course</a></li>
                <li><a href="">Update</a></li>
                <li><a href="">Delete</a></li>
            </ul>
        </div>
        <div class="b1">
            <h1>MARKS</h1>
            <ul>
                <li><a href="">List</a></li>
                <li><a href="">Entry Marks</a></li>
                <li><a href="">update Marks</a></li>
                <li><a href="">Delete Marks</a></li>
                
            </ul>
        </div>
        <div class="b1">
            <h1>NOTICE</h1>
            <ul>
                <li><a href="">Admission</a></li>
                <li><a href="">Exam</a></li>
                <li><a href="">Time Table</a></li>
                <li><a href="">Result</a></li>
            </ul>
        </div>
    </div>
    <%} %>
</body>
</html>