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
@WebServlet("/addsubjects")
public class Addsubject extends HttpServlet{
	
	public void addsubjects(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String subjectcode=req.getParameter("subjectcode");
		String subjectname=req.getParameter("subjectname");
		String semester=req.getParameter("semester");
		String courseid=req.getParameter("courseid");
		SubjectDB db=new SubjectDao();
		if(subjectcode!=null && subjectname!=null && semester!=null && courseid!=null) {
			int cid=Integer.parseInt(courseid);
			db.add(subjectcode, subjectname, semester, cid);
			RequestDispatcher rd=req.getRequestDispatcher("addsubject.jsp");
			out.print(subjectcode+""+ subjectname+""+ semester+""+ cid);
			out.print("<h1>Subject successfully added into list");
			rd.include(req, resp);
			
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
