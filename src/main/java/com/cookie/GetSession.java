package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/get")
public class GetSession extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String degree=req.getParameter("degree");
		String year=req.getParameter("year");
		String university=req.getParameter("university");
		
		HttpSession hs=req.getSession();
		String name=(String)hs.getAttribute("name");
		String age=(String)hs.getAttribute("age");
		String phno=(String)hs.getAttribute("phno");
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body sytle=background-color:cyan; color:red>");
		out.println("<h1> Student Details are </h1><br>");
		out.println("name :"+name+"<br>");
		out.println("age :"+age+"<br>");
		out.println("phno :"+phno+"<br>");
		out.println("degree :"+degree+"<br>");
		out.println("year :"+year+"<br>");
		out.println("university :"+university+"<br>");
		out.println("</body></html>");


		
	}

}
