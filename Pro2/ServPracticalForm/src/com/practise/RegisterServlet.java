package com.practise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;



//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		out.println("<h2> Welcome to register servlet </h2>");

		String name=request.getParameter("user_name");
		String password=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		String gender=request.getParameter("user_gender");
		String course=request.getParameter("user_course");
		String cond=request.getParameter("condition");
		
		out.println(cond);
		
		if(cond!= null) {
		if(cond.equals("checked")) {
			out.println("<h2> Name :" + name + "<h2>");
			out.println("<h2> password :" + password + "<h2>");
			out.println("<h2> email :" + email + "<h2>");
			out.println("<h2> gender :" + gender + "<h2>");
			out.println("<h2> course :" + course + "<h2>");


			RequestDispatcher rd =request.getRequestDispatcher("success");
			rd.forward(request, response);

		} else {
			out.println("<h2> You have not accepted terms and condition </h2>");
		}
		} else {
			out.println("<h2> You have not accepted terms and condition </h2>");
			
//			want to include output ogf index.jsp
			RequestDispatcher rd =request.getRequestDispatcher("index.html");
			
//			include method
			rd.include(request, response);
			

		}



		
	
	}

}
