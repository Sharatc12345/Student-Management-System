<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/tprofile.css">
</head>
<body>
<%  String image=(String) session.getAttribute("timage");
      int id=(int)session.getAttribute("tid");
      String name=(String) session.getAttribute("tname");
      String qualification=(String)session.getAttribute("tqualification");
      String gender=(String)session.getAttribute("tgender");
      String dob=(String)session.getAttribute("tdob");
      long mobileno=(long)session.getAttribute("tmobileno");
      String email=(String)session.getAttribute("temail");
      String subject=(String) session.getAttribute("tsubject");
      String incharge=(String) session.getAttribute("tincharge");
      name=name.toUpperCase();   
  %>
  <div class="head"><h1>-:TEACHER PROFILE:-</h1></div>
 <div class="container">
  <div class="block1"><img src="<%=image%>" alt=""></div>
  <div class="block2">
    <div>
    <ul>
      <li><b>NAME: </b><span><%=name %></span></li>
      <li><b>GENDER: </b><span><%=gender %></span></li>
      <li><b>DATE OF BIRTH: </b><span><%=dob %></span></li>
      <li><b>QUALIFICATION: </b><span><%=qualification %></span></li>
     </ul>
    </div>
    <div>
      
    </div>
     </div>
  <div class="block3">
    <table border="1" style="width: 100%;">
      <tr style="background-color: red; color:white;">
      <th>SRNO</th>
      <th>SUBJECT NAME</th>
      <th>SUBJECT CODE</th>
      <th>MARKS</th>
    </tr>
      <tr>
        <td>1</td>
        <td>2</td>
        <td>3</td>
        <td>4</td>
      </tr>
    </table>
  </div>
 </div>
</body>
</html>