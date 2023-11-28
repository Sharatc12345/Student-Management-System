<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/teachernav.css">
</head>
<body>
<%String images=(String) session.getAttribute("timage"); 
  String names=(String) session.getAttribute("tname");
  names=names.toUpperCase();
  
%>
   <div class="navbar">
     <div class="right">
        <img src="<%=images %>" alt="">
      <a href=""><%=names %></a>
      <a href="logout" target="">LOGOUT</a>
     </div>
    </div>
   
</body>
</html>