package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/logout")
public class Logout extends HttpServlet {
	public void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter outPrintWriter=resp.getWriter();
//		HttpSession session=req.getSession(false);
//		session.removeAttribute("tmobileno");
//		session.invalidate();
//		RequestDispatcher rd=req.getRequestDispatcher("/welcome.jsp");
//		rd.forward(req, resp);
//		resp.sendRedirect("/StudentManagementSystem/welcome.jsp");
		
		 HttpSession session = req.getSession(false); // Retrieve the current session without creating a new one
	        if (session != null) {
	            session.invalidate(); // Invalidate the session (log out)
	        }
	        resp.sendRedirect("welcome.jsp"); // Redirect to the login page or any other appropriate page
	        
	        System.out.println(session);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logout(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logout(req, resp);
	}
	
	

}
