<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/sprofile.css">
</head>
<body>
<%
int id=(int)session.getAttribute("sid");
String name=(String) session.getAttribute("sname");
String fathername=(String) session.getAttribute("sfathername");
String mothername=(String) session.getAttribute("smothername");
String gender=(String) session.getAttribute("sgender");
String dob=(String) session.getAttribute("sdob");
String address=(String) session.getAttribute("saddress");
String course=(String) session.getAttribute("scourse");
String semester=(String) session.getAttribute("ssemester");
long mobileno=(long) session.getAttribute("smobile");
String email=(String) session.getAttribute("semail");
String image=(String) session.getAttribute("simage");

if(name!=null && fathername!=null && mothername!=null){
	name=name.toUpperCase();
	fathername=fathername.toUpperCase();
	mothername=mothername.toUpperCase();
}

%>
 <div class="container">
<div class="photo"><img src="<%=image%>" alt="image"></div>
<div class="info">
   <div class="a1">
    <h3><span>NAME: </span><%=name %></h3>
    <h3><span>FATHER-NAME: </span><%=fathername %></h3>
    <h3><span>MOTHER-NAME: </span><%=mothername %></h3>
   </div>
   <div class="a2">
    <h3><span>GENDER: </span><%=gender %></h3>
    <h3><span>DATE OF BIRTH: </span><%=dob %></h3>
    <h3><span>ADDRESS:</span><%=address %></h3>
   </div>
</div>
<div class="course">
<h2><%=course %></h2>
<p><span>NAME: </span><%=name %></p>
<p><span>GENDER: </span><%=gender %></p>
<p><span>DATE OF  BIRTH: </span><%=dob %></p>
<p><span>DATE OF ADMISSION: </span>28-10-2023</p>
<p><span>REGISTER NUMBER: </span><%=id %></p>
<p><span>COURSE: </span><%=course %></p>
<p><span>SEMESTER: </span><%=semester %></p>
</div>
<br>
<h3 style="text-align: center; margin-top: -30px"><%=course+" "+semester %></h3>
<div class="subjects">
   <table border="1">
   
       <tr>
        <th>SR NO</th>
        <th>SUBJECT CODE</th>
        <th>SUBJECT</th>
       </tr>
      <tr>
        <td>1</td>
        <td>SE01</td>
        <td>SOFTWARE ENGINEERING</td>
      </tr>
   </table>
</div>
    </div>
</body>
</html>