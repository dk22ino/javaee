package com.ug.pszczupak.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addMotorcycle")

public class AddMotorcycle extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h2>Dodaj Motocykl:</h2>" +
				"<form action='showMotorcycles'>" +
				"Marka i model: <input type='text' name='name' /> <br />" +
				"Data produkcji: <input type='text' name='dateOfProduction' /> <br />" +
				"Przebieg: <input type='text' name='milage' /> <br />" +
				"Wypadkowy?: <select name='crush'>" +
				"<option value='true'>Tak</option>" +
				"<option value='false'>Nie</option>" +
				"</select><br />" +
				"<input type='submit' value=' Dodaj ' /><br/>" +
				"</form>");
		out.close();
	}
}
