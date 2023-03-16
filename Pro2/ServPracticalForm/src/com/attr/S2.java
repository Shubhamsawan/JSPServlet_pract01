package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			
			out.println("<!DOCTYPE html>");
			out.println("html");
			out.println("head");
			out.println("<title>Insert title here</title>");
			out.println("</head");
			out.println("<body>");

			
			int nn1=Integer.parseInt(request.getParameter("n1"));
			int nn2=Integer.parseInt(request.getParameter("n2"));
			
			//add
			int p=nn1*nn2;
			
			//attribute
			int sum=(int)request.getAttribute("sum");
			
			out.println("<h1>");

			out.println("Sum is =" +sum);
			out.println("Sum is =" +p);
			out.println("</h1>");

		
			out.println("</body");
			out.println("</html>");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);

	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
