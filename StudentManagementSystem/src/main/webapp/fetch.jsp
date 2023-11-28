<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style>
        .student-card {
            width: 300px;
            border: 1px solid #ccc;
            border-radius: 10px;
            padding: 10px;
            text-align: center;
        }

        .student-photo {
            width: 150px;
            height: 150px;
            border-radius: 50%;
            overflow: hidden;
            margin: 0 auto 10px;
        }

        .student-photo img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }

        .student-details {
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div class="student-card">
        <div class="student-photo">
            <img src="studentphoto.jpg" alt="Student Photo">
        </div>
        <div class="student-details">
        <div><img id="image-1" alt="" src=""/></div>
            <p>Name: John Doe</p>
            <p>Father's Name: John Doe Sr.</p>
            <p>Mother's Name: Jane Doe</p>
            <p>Gender: Male</p>
            <p>Date of Birth: January 15, 2000</p>
            <p>Address: 123 Main Street, City, Country</p>
            <p>Mobile No: +1 123-456-7890</p>
            <p>Email: john.doe@example.com</p>
        </div>
    </div>
</body>
</html>