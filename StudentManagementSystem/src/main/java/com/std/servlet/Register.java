package com.std.servlet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import com.db.StudentDB;
import com.db.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
@WebServlet("/sregister")
@MultipartConfig
public class Register extends HttpServlet{
	public void studentRegister(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		StudentDB sd=new StudentDao();

		String name=req.getParameter("sname");
		String fathername=req.getParameter("sfathername");
		String mothername=req.getParameter("smothername");
		String gender=req.getParameter("sgender");
		String dob=req.getParameter("sdob");
		String address=req.getParameter("saddress");
		String course=req.getParameter("scourse");
		String semester=req.getParameter("ssemester");
		String mobileno=req.getParameter("smobile");
		String email=req.getParameter("semail");
		String password=req.getParameter("spassword");
		String confirm_Password=req.getParameter("sconfirmPassword");
		String check=req.getParameter("scheck");
		if(password.equals(confirm_Password)) {
			if(check!=null && check.equals("accept")) {
				long mobile=Long.parseLong(mobileno);
				Part part=req.getPart("simage");
				String image=part.getSubmittedFileName();
				sd.add(name, fathername, mothername, gender, dob, address,course,semester, mobile, email,password, image);
//				==============================================================================================================================
				InputStream is=part.getInputStream();
				byte[] data=new byte[is.available()];
				is.read(data);
				String path="D:/java/Servlet/StudentManagementSystem/src/main/webapp/style/simages/"+image;
				FileOutputStream fos=new FileOutputStream(path);
				fos.write(data);
				resp.sendRedirect("slogin.jsp");
			}
			else {
				System.out.println("not accept");
			}
		}
		else {
			System.out.println("password mismatch");
		}
		//		out.print("<h1>"+name+"<h1>");
		//		out.print("<h1>"+fathername+"<h1>");
		//		out.print("<h1>"+mothername+"<h1>");
		//		out.print("<h1>"+gender+"<h1>");
		//		out.print("<h1>"+dob+"<h1>");
		//		out.print("<h1>"+address+"<h1>");
		//		out.print("<h1>"+email+"<h1>");
		//		out.print("<h1>"+mobileno+"<h1>");
//				out.print("<h1>"+confirm_Password+"<h1>");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		studentRegister(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		studentRegister(req, resp);
	}

}
