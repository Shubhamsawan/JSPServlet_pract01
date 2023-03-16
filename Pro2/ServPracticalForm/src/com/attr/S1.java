package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

///**
// * Servlet implementation class S1
// */
//@WebServlet("/S1")
public class S1 extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			
			out.println("<!DOCTYPE html>");
			out.println("html");
			out.println("head");
			out.println("<title>Insert title here</title>");
			out.println("</head");
			out.println("<body>");


			String n1=request.getParameter("n1");
			String n2=request.getParameter("n2");
			
			int nn1=Integer.parseInt(n1);
			int nn2=Integer.parseInt(n2);
			
			//add
			int s=nn1+nn2;
			
			//attribute
			request.setAttribute("sum", s);
			
			RequestDispatcher rd = request.getRequestDispatcher("s2");
			rd.forward(request, response);
			out.println("</body");
			out.println("</html>");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);

	}
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}

}
