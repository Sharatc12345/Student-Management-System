<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/teacherprofile.css">
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
  <%@include file="teachernav.jsp" %>
  <div class="properties">
    <div id="container">
         <div id="top">
             <div id="profilephoto">
                <img src="<%=image %>" alt="">
             </div>
        </div>
        <div class="pr">
        <h2><%=name%></h2>
        <h4><%=gender %></h4>
        <h4><%=dob %></h4>
        <h4><%=qualification %></h4>
        <h4><%=subject %></h4>
        <h4><%=incharge %></h4>
        <h4><%=mobileno %></h4>
        <h4><%=email %></h4>
        </div>
    </div>
    <div class="tools">
          <div class="row">
            <a href="tprofile.jsp"><div class="tool"> <iframe src="style/icons/user-regular.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>PROFILE</h4></div></a>
            <a href=""><div class="tool"><iframe src="style/icons/marker-solid.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>MARKS_ENTRY</h4></div></a>
            <a href="choose.jsp"><div class="tool"><iframe src="style/icons/clipboard-user-solid.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>ATTENDENCE</h4></div></a>
           
          </div>
          <div class="row">
            <a href="allstudents.jsp"><div class="tool"><iframe src="style/icons/users-line-solid.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>STUDENTLIST</h4></div></a>
            <a href=""><div class="tool"><iframe src="style/icons/clipboard-solid.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>NOTES</h4></div></a>
            <a href=""><div class="tool"><iframe src="style/icons/rectangle-list-regular.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>MARKSLIST</h4></div></a>
          </div>
          <div class="row">
            <a href=""><div class="tool"><iframe src="style/icons/marker-solid.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>UPDATE_STUDENT</h4></div></a>
            <a href=""><div class="tool"><iframe src="style/icons/marker-solid.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>UPDATE_PROFILE</h4></div></a>
            <a href=""><div class="tool"><iframe src="style/icons/envelope-open-text-solid.svg" frameborder="0" style="width: 100%; height: 80%;"></iframe><h4>NOTICE</h4></div></a>
          </div>
    </div>
    </div>
</body>
</html>