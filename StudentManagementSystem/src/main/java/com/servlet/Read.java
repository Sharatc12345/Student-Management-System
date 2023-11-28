package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;

import com.components.Teachers;
import com.db.TeachersDB;
import com.db.TeachersDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/read")
@MultipartConfig
public class Read extends HttpServlet{
	public void retrieve(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
        TeachersDB db=new TeachersDao();
		String mobileno=req.getParameter("tname");
		String password=req.getParameter("tpassword");
		
		if(mobileno!=null && password!=null) {
			
			long mob=Long.parseLong(mobileno);
			List<Teachers> tc=db.getTeacherByUsernamePassword(mob, password);
			
			for(Teachers tch:tc) {
			int id=tch.getId();
			String name=tch.getName();
			String incharge=tch.getIncharge();
			String qualification=tch.getQualification();
			String gender=tch.getGender();
			String dob=tch.getDob();
			String subject=tch.getSubject();
			long mobilen=tch.getMobile_no();
			String email=tch.getEmail();
			String pass=tch.getPassword();
			String image=tch.getImage();
			
			String path="style/timages/"+image;
			
			HttpSession session=req.getSession();
			session.setAttribute("tid", id);
			session.setAttribute("tname", name);
			session.setAttribute("tqualification", qualification);
			session.setAttribute("tgender", gender);
			session.setAttribute("tdob", dob);
			session.setAttribute("tmobileno", mobilen);
			session.setAttribute("temail", email);
			session.setAttribute("tsubject", subject);
			session.setAttribute("tincharge", incharge);
			session.setAttribute("timage", path);
//		    RequestDispatcher rd=req.getRequestDispatcher("/teacherprofile.jsp");
//		    rd.forward(req, resp);
			resp.sendRedirect("teacherprofile.jsp");
			}
		}
		else {
			System.out.println("data null...!");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		retrieve(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		retrieve(req, resp);
	}

}
