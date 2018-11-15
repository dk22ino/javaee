package com.ug.pszczupak.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rodoCheck")
public class Rodo extends HttpServlet {
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        
	        if(request.getParameter("rodo").equals("rodoStart"))
	        {
	        	if(request.getParameterNames().nextElement().equals("rEmail"))
	        	{
	        		if(request.getParameter("email")!="")
	        			response.sendRedirect("/zad04");
	        		else
	        			response.sendRedirect("/zad04/index.jsp");
	        	}
	        	response.sendRedirect("/zad04/Index");
	        }
	        
	        if(request.getParameter("rodo").equals("rodoKup"))
	        {
	        	if(request.getParameterNames().nextElement().equals("rEmail"))
	        	{
	        		if(request.getParameter("email")!=null)
	        			response.sendRedirect("/zad04/Index");
	        		else
	        			response.sendRedirect("/zad04/Index");
	        	}
	        	response.sendRedirect("/zad04/Index");
	        }
	        
	        
	        
	        
	        	
	 }

}