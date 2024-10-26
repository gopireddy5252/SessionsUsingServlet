package com.cookie;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/studentset1")
public class StudentSet1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("sname");
		String age=req.getParameter("sage");
		String phno=req.getParameter("phno");
		
		if(name!=null)
		{
			Cookie addName=new Cookie("name", name);
			resp.addCookie(addName);
		}
		if(age!=null)
		{
			Cookie addAge=new Cookie("age", age);
			resp.addCookie(addAge);
		}
		if(phno!=null)
		{
			Cookie addPhno=new Cookie("phno", phno);
			resp.addCookie(addPhno);
		}
		
		//req.getRequestDispatcher("Student1.html").forward(req, resp);
		resp.sendRedirect("Student1.html");
	}

}
