package com.add.subject;

import java.io.IOException;
import java.io.PrintWriter;

import com.db.SubjectDB;
import com.db.SubjectDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/selectcs")
public class SelectCourseSem extends HttpServlet {
	public void addsubjects(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String course=req.getParameter("cour");
		String semester=req.getParameter("semi");
		
		if(course!=null && semester!=null) {
			
			
			HttpSession session=req.getSession();
			session.setAttribute("cour", course);
			session.setAttribute("semi", semester);
			resp.sendRedirect("addsubject.jsp");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		addsubjects(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		addsubjects(req, resp);
	}

}
