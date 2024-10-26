package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/studentsession")
public class SetSession extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("sname");
		String age=req.getParameter("sage");
		String phno=req.getParameter("phno");
		
		HttpSession hs=req.getSession();
		// SeesionName and va
		hs.setAttribute("name", name);
		hs.setAttribute("age", age);
		hs.setAttribute("phno", phno);
		
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body>");
		pw.println("<a href=Session2.html >next</a>");
		pw.println("</body></html>");
		
		//resp.sendRedirect("Session2.html");
	}
}
