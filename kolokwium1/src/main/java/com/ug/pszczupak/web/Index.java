package com.ug.pszczupak.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {
	

	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        out.println("<html><body><h1>Komis Motocyklowy</h1> <br>" +
	                "Menu: <br>" +
	                "<ul>" +
	                "<li><a href='/kolokwium1/addMotorcycle'>Dodaj Motocykl</a></li>" +
	                "<li><a href='/kolokwium1/showMotorcycles'>Wyswietl Motory</a></li>" +
	                "<li><a href='/kolokwium1/showBasket'>Twoj Koszyk</a></li>" +
	                "</ul>" +
	                "</body></html>");
	        out.close();
	    }


}
