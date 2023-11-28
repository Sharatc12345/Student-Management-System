package com.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import com.db.TeachersDB;
import com.db.TeachersDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
@WebServlet("/add")
@MultipartConfig
public class Add extends HttpServlet{
	public void addTeacher(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		TeachersDB td=new TeachersDao();

		String name=req.getParameter("tname");
		String incharge=req.getParameter("tincharge");
		String subject=req.getParameter("tsubject");
		String qualification=req.getParameter("tqualification");
		String gender=req.getParameter("tgender");
		String dob=req.getParameter("tdob");
		String mobile=req.getParameter("tmobile");
		String email=req.getParameter("temail");
		String password=req.getParameter("tpassword");
		String confirmpassword=req.getParameter("tconfirmPassword");
//		Part part=req.getPart("timage");
//		String image=part.getSubmittedFileName();
		String check=req.getParameter("tcheck");
		//		================================================================================
//		String dob,String email,String gender,String image,String incharge, long mobileno,String name,String password,String qualification,String subject
		if(password.equals(confirmpassword)) {
		if(check!=null && check.equals("accept")) {
			long mobileno=Long.parseLong(mobile);
			Part part=req.getPart("timage");
			String image=part.getSubmittedFileName();
			td.add(dob,email,gender,image,incharge,mobileno,name,password,qualification,subject);
//			===========================================================================================
			InputStream is=part.getInputStream();
			byte[] data=new byte[is.available()];
			is.read(data);
			
			String path="D:/java/Servlet/StudentManagementSystem/src/main/webapp/style/timages/"+image;
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			System.out.println(path);
//			RequestDispatcher rd=req.getRequestDispatcher("/tlogin.jsp");
//			rd.forward(req, resp);
			resp.sendRedirect("tlogin.jsp");
			
//			=============================================================================================	
		}
		else {
             out.print("<h4>Please Accept Terms and Conditions</h4>");
		}
		}
		else {
			 out.print("<h4>password mismatch</h4>");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		addTeacher(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		addTeacher(req, resp);
	}


}
