<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="style/stdinfo.css">
</head>
<body>
<%String name=(String) session.getAttribute("sname");
String image=(String) session.getAttribute("simage");
if(name!=null){
	name=name.toUpperCase();
}

%>
    <div class="container">
       <a href="" ><p><%=name%></p></a>
       <img src="<%=image %>" alt="image">
       <a href="logout"><p>LOGOUT</p></a>
    </div>
    <div class="heading">
    <span><h2>NOTICE</h2></span>
    </div>
   
    <div id="menu" class="hidden">
        <ul>
            <li><a href="sprofile.jsp">Profile</a></li>
            <li><a href="#">Exam Application</a></li>
            <li><a href="#">Application Status</a></li>
            <li><a href="#">Result</a></li>
            <li><a href="#">Time Table</a></li>
            <li><a href="#">IA Marks</a></li>
            <li><a href="#">Update Profile</a></li>
            <li><a href="#">Update MobileNo</a></li>
            <li><a href="#">Update Email</a></li>
            <li><a href="#">Update Password</a></li>
            <li><a href="#">Support</a></li>
        </ul>
    </div>
    <div class="container2">
        <h3 class="date"></h3>
      <h1></h1>
      <p></p>
        <hr>
    </div>
</body>
</html>