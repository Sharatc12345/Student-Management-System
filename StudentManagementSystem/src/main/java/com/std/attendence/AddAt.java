package com.std.attendence;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import com.db.AttendenceDB;
import com.db.AttendenceDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addattendence")
public class AddAt extends HttpServlet{
	public void addAttendence(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		AttendenceDB db=new AttendenceDao();
		PrintWriter out=resp.getWriter();
		String sid=req.getParameter("sid");
		String atd=req.getParameter("atd");
		
		if(sid!=null && atd!=null) {
			int stdid=Integer.parseInt(sid);
			String date=new Date().toString();
			db.add(atd, date, stdid);
			resp.sendRedirect("addattendence.jsp");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		addAttendence(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		addAttendence(req, resp);
	}
	

}
