<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        .head{
            border: 2px solid red;
            height: 30PX;
            background-color: blueviolet;
            color: white;
        }
        .head h2{
            margin-top: 0px;
            text-align: center;
        }
        .b1{
            border: 2px solid;
            border: none;
            margin-top: 15px;
            height: 200px;
            width: 50%;
            box-shadow: 10px 10px 15px gray;
            padding: 10px;
            background-color: white;
        }
           .slider {
        border: 2px solid red;
  width: 50%;
  border: none;
  overflow: hidden;
  margin: auto;
}


.slides {
    border: 2px solid black;
    height: 400px;
    width: 100%;
    margin: auto;
    overflow: hidden;
  display: flex;
}


.slides img {
    margin: auto;
  width: 100%;
  height: auto;
  transition: transform 0.5s ease;
}
.mainb1{
border: 2px solid red;
width: 600px;
height: 250px;
display: flex;
justify-content: space-between;
margin: auto;
border: none;
}
        
    </style>
</head>
<body>
    <div class="head"><h2>UNIVERSITY NAME</h2></div>
     <div class="slider">
        <div class="slides">
          <img src="https://buffer.com/library/content/images/2023/10/free-images.jpg" alt="Image 1">
          <img src="https://images.unsplash.com/photo-1575936123452-b67c3203c357?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D" alt="Image 2">
          <img src="https://buffer.com/library/content/images/2023/10/free-images.jpg" alt="Image 3">
        </div>
      </div>
     
<div class="mainb1">
    <div class="b1">
        <h1>PORTAL</h1>
        <ul>
            <li><a href="ulogin.jsp">University Login</a></li>
            <li><a href="clogin.jsp">College Login</a></li>
            <li><a href="tlogin.jsp">Teacher Login</a></li>
            <li><a href="slogin.jsp">Student Login</a></li>
        </ul>
    </div>
    <div class="b1">
        <h1>EXAM NOTIFICATION</h1>
        <ul>
            <li><a href="">Exam Date Announcement</a></li>
            <li><a href="">Exam Application</a></li>
            <li><a href="">Time Table</a></li>
        </ul>
    </div>
 </div>
    <script>
      let slideIndex = 0;
const slides = document.querySelectorAll('.slides img');
const totalSlides = slides.length;

function showSlide(index) {
  if (index < 0) {
    slideIndex = totalSlides - 1;
  } else if (index >= totalSlides) {
    slideIndex = 0;
  }

  slides.forEach(slide => {
    slide.style.transform = `translateX(-${slideIndex * 100}%)`;
  });
}

function nextSlide() {
  slideIndex++;
  showSlide(slideIndex);
}

function prevSlide() {
  slideIndex--;
  showSlide(slideIndex);
}

setInterval(nextSlide, 3000); // Auto slide every 3 seconds


      </script>
</body>
</html>