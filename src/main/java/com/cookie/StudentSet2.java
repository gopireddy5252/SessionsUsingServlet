package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/studentset2")
public class StudentSet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String degree=req.getParameter("degree");
		String year=req.getParameter("year");
		String university=req.getParameter("university");
		
		Cookie[] cookies=req.getCookies();
		String sname="",sage="", phno="";
		for(Cookie cookie:cookies)	
		{
			switch(cookie.getName())
			{
			case "name":sname=cookie.getValue();
						break;
			case "age":sage=cookie.getValue();
						break;
			case "phno":phno=cookie.getValue();
						break;
			}
		}
		
		
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body bagcolor=yellow text=red>");
		out.println(sname);
		out.println(sage);
		out.println(phno);
		out.println(degree);
		out.println(year);
		out.println(university);
		out.println("</body></html>");
	}

}
