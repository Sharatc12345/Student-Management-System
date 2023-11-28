package com.ex.courses;

import java.io.IOException;
import java.io.PrintWriter;

import com.db.CourseDB;
import com.db.CoursesDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addcourses")
public class AddCourse extends HttpServlet{
	public void addCourse(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		CourseDB db=new CoursesDao();
		
		String code=req.getParameter("coursecode");
		String name=req.getParameter("coursename");
		System.out.println(code);
		System.out.println(name);
		
		if(code!=null && name!=null) {
			db.add(code, name);
			RequestDispatcher rd=req.getRequestDispatcher("addcourses.jsp");
			out.print("<h1>Inserted Successfully");
			rd.include(req, resp);
			
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		addCourse(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		addCourse(req, resp);
	}
	

}
