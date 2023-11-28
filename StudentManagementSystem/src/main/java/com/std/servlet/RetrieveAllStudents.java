package com.std.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.components.Students;
import com.db.StudentDB;
import com.db.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RetrieveAllStudents extends HttpServlet{
	public void readAllStd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		StudentDB db=new StudentDao();
		
		List<Students> std=db.read();
//		for(Students s:std) {
//			int id=s.getId();
//			String name=s.getName();
//			String fathername=s.getFathername();
//			String mothername=s.getMothername();
//			String gender=s.getGender();
//			String dob=s.getDate();
//			String address=s.getAddress();
//			long mobile=s.getMobileno();
//			String email=s.getEmail();
//			String image=s.getImage();
//			
//			String images="style/simages/"+image;
//			
//			HttpSession session=req.getSession();
//			session.setAttribute("sid", id);
//			session.setAttribute("sname", name);
//			session.setAttribute("sfathername", fathername);
//			session.setAttribute("smothername", mothername);
//			session.setAttribute("sgender", gender);
//			session.setAttribute("sdob", dob);
//			session.setAttribute("saddress", address);
//			session.setAttribute("smobile", mobile);
//			session.setAttribute("semail", email);
//			session.setAttribute("simage", images);
//			
//			
//		}
		HttpSession session=req.getSession();
		session.setAttribute("std", std);
//		resp.sendRedirect("addattendence.jsp");
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		readAllStd(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		readAllStd(req, resp);
	}
	

}
