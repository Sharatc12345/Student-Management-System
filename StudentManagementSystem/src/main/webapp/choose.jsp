<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
 <a href="teacherprofile.jsp">HOME</a>
 <div class="container">
    <form action="readattendence">
    <select id="course" name="scourse1" required>
        <option>SELECT-OPTIONS</option>
        <option value="BCA-BACHELOR OF COMPUTER APPLICATION">BCA-BACHELOR OF COMPUTER APPLICATION</option>
        <option value="BBA-BACHELOR OF BUSINESS ADDMINISTRATOR">BBA-BACHELOR OF BUSINESS ADDMINISTRATOR</option>
        <option value="BA-BACHELOR OF ARTS">BA-BACHELOR OF ARTS</option>
        <option value="B.com-BACHELOR OF COMMERCE">B.com-BACHELOR OF COMMERCE</option>
    </select>
    <select id="semester" name="ssemester1" required>
        <option>SELECT-OPTIONS</option>
        <option value="I Semester">I Semester</option>
        <option value="II Semester">II Semester</option>
        <option value="III Semester">III Semester</option>
        <option value="IV Semester">IV Semester</option>
        <option value="V Semester">V Semester</option>
        <option value="VI Semester">VI Semester</option>
    </select>
    <button type="submit">SUBMIT</button>
</form>
    </div>
</body>
</html>