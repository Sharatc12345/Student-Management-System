package com.ex.clg;

import java.io.IOException;
import java.io.PrintWriter;

import com.db.CollegeDB;
import com.db.CollegeDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addcollege")
@MultipartConfig
public class AddCollege extends HttpServlet{
	public void addCollege(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		CollegeDB db=new CollegeDao();
		String name=req.getParameter("cname");
		String owner=req.getParameter("cowner");
		//		String incharge=req.getParameter("tincharge");
		//		String subject=req.getParameter("tsubject");
		//		String qualification=req.getParameter("tqualification");
		//		String gender=req.getParameter("tgender");
		//		String dob=req.getParameter("tdob");
		String mobile=req.getParameter("cmobile");
		String email=req.getParameter("cemail");
		String password=req.getParameter("cpassword");
		String confirmpassword=req.getParameter("cconfirmPassword");
		//		Part part=req.getPart("timage");
		//		String image=part.getSubmittedFileName();
		String check=req.getParameter("ccheck");
		//		================================================================================
		//		String dob,String email,String gender,String image,String incharge, long mobileno,String name,String password,String qualification,String subject
		if(password.equals(confirmpassword)) {
			if(check!=null && check.equals("accept")) {
				long mobileno=Long.parseLong(mobile);
				db.addCollege(name, owner, email, mobileno, password);
				//			Part part=req.getPart("timage");
				//			String image=part.getSubmittedFileName();
				//			===========================================================================================
				//			InputStream is=part.getInputStream();
				//			byte[] data=new byte[is.available()];
				//			is.read(data);
				//			
				//			String path="D:/java/Servlet/StudentManagementSystem/src/main/webapp/style/uimages/"+image;
				//			FileOutputStream fos=new FileOutputStream(path);
				//			fos.write(data);
				//			System.out.println(path);
				//			RequestDispatcher rd=req.getRequestDispatcher("/tlogin.jsp");
				//			rd.forward(req, resp);
				resp.sendRedirect("clogin.jsp");

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
		// TODO Auto-generated method stub
		addCollege(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		addCollege(req, resp);
	}


}
