package com.ex.university;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.components.Students;
import com.components.University;
import com.db.UniversityDB;
import com.db.UniversityDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/unilogin")
public class LoginUni extends HttpServlet{
	public void uniLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		UniversityDB db=new UniversityDao();

		String mobile=req.getParameter("uusername");
		String password=req.getParameter("upassword");

		if(mobile!=null && password!=null) {
			long mobilen=Long.parseLong(mobile);
			List<University> uni=db.getUniversityByUsernamePassword(mobilen, password);
			for(University s:uni) {
				int id=s.getId();
				String code=s.getCode();
				String name=s.getName();
				String gender=s.getGender();
				String dob=s.getDob();
				long mobileno=s.getMobileno();
				String email=s.getEmail();
				String passwords=s.getPassword();
				String image=s.getImage();
				String images="style/uimages/"+image;
				//				=====================================================================================================================
				HttpSession session=req.getSession();
				session.setAttribute("uid", id);
				session.setAttribute("ucode", code);
				session.setAttribute("uname", name);
				session.setAttribute("ugender", gender);
				session.setAttribute("udob", dob);
				session.setAttribute("umobile", mobileno);
				session.setAttribute("uemail", email);
				session.setAttribute("upassword", passwords);
				session.setAttribute("uimage", images);

				resp.sendRedirect("uniprofile.jsp");
			}
			RequestDispatcher rd=req.getRequestDispatcher("ulogin.jsp");
			out.print("<h1>Username and Password Invalid</h1>");
			rd.include(req, resp);
			
			
		}
		
			
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		uniLogin(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		uniLogin(req, resp);
	}



}
