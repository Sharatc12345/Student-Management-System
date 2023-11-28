<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f4f4f4;
    }
    header {
      background-color: #333;
      color: #fff;
      text-align: center;
      padding: 20px 0;
    }
    .container {
      width: 80%;
      margin: 20px auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .profile-img {
      width: 150px;
      height: 150px;
      border-radius: 50%;
      object-fit: cover;
      margin: 0 auto 20px;
      display: block;
    }
    .profile-details {
      text-align: center;
    }
    .profile-details h1 {
      margin: 10px 0;
    }
    .profile-details p {
      margin-bottom: 5px;
    }
  </style>
</head>
<body>
<%
int id=(int) session.getAttribute("uid");
String name=(String) session.getAttribute("uname");
String code=(String) session.getAttribute("ucode");
long mobile=(long) session.getAttribute("umobile");
String gender=(String) session.getAttribute("ugender");
String udob=(String) session.getAttribute("udob");
String email=(String) session.getAttribute("uemail");
String image=(String) session.getAttribute("uimage");


%>

  <header>
    <h1>User Profile</h1>
  </header>

  <div class="container">
    <img src="<%=image %>" alt="Profile Picture" class="profile-img">
    <div class="profile-details">
      <h1><%=name %></h1>
      <p><%=mobile %></p>
      <p>Location: City, Country</p>
      <p><%=email %></p>
      <!-- Add more details as needed -->
    </div>
  </div>

</body>
</html>
