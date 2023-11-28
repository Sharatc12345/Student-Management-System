package com.std.attendence;

import java.io.IOException;
import java.util.List;

import com.components.Students;
import com.db.StudentDB;
import com.db.StudentDao;
import com.mysql.cj.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/readattendence")
@MultipartConfig
public class getAttListBysemcourse extends HttpServlet{
	public void readatt(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		StudentDB db=new StudentDao();
		
		String course=req.getParameter("scourse1");
		String semester=req.getParameter("ssemester1");
		System.out.println(course);
		System.out.println(semester);
		
		if(course!=null && semester!=null) {
			HttpSession sess=req.getSession();
			sess.setAttribute("c",course);
			sess.setAttribute("s",semester);
			resp.sendRedirect("addattendence.jsp");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		readatt(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		readatt(req, resp);
	}
	
	

}
