package com.std.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.components.Students;
import com.db.StudentDB;
import com.db.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/slogin")
@MultipartConfig
public class Login extends HttpServlet{
	
	public void studentLogin(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		StudentDB db=new StudentDao();
		
		String mobile=req.getParameter("susername");
		String password=req.getParameter("spassword");
		
		if(mobile!=null && password!=null) {
			long mobilen=Long.parseLong(mobile);
			List<Students> std=db.getStudentbyusernamePass(mobilen, password);
			for(Students s:std) {
				int id=s.getId();
				String name=s.getName();
				String fathername=s.getFathername();
				String  mothername=s.getMothername();
				String gender=s.getGender();
				String dob=s.getDate();
				String address=s.getAddress();
				String course=s.getCourse();
				String semester=s.getSemester();
				long mobileno=s.getMobileno();
				String email=s.getEmail();
				String passwords=s.getPassword();
				String image=s.getImage();
				String images="style/simages/"+image;
//				=====================================================================================================================
				HttpSession session=req.getSession();
				session.setAttribute("sid", id);
				session.setAttribute("sname", name);
				session.setAttribute("sfathername", fathername);
				session.setAttribute("smothername", mothername);
				session.setAttribute("sgender", gender);
				session.setAttribute("sdob", dob);
				session.setAttribute("saddress", address);
				session.setAttribute("scourse", course);
				session.setAttribute("ssemester", semester);
				session.setAttribute("smobile", mobileno);
				session.setAttribute("semail", email);
				session.setAttribute("spassword", password);
				session.setAttribute("simage", images);
				
				resp.sendRedirect("stdinfo.jsp");
			}
		}
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		studentLogin(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		studentLogin(req, resp);
	}
	
}
