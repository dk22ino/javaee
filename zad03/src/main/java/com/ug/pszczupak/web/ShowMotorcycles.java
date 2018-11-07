package com.ug.pszczupak.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ug.pszczupak.domain.Motorcycle;
import com.ug.pszczupak.service.StorageService;

@WebServlet("/showMotorcycles")
public class ShowMotorcycles extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		if(request.getParameter("name")!=null && request.getParameter("dateOfProduction")!=null && request.getParameter("milage")!=null && request.getParameter("crush")!=null)
		{
			String name = request.getParameter("name");
			DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			Date dateOfProduction = null;
			try {
				dateOfProduction = formatter.parse(request.getParameter("dateOfProduction"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			double milage = Double.parseDouble(request.getParameter("milage"));
			boolean crush = Boolean.parseBoolean(request.getParameter("crush"));

			Motorcycle newMotor = new Motorcycle(name,dateOfProduction,crush,milage);
			StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");
			ss.add(newMotor);
	
			List<Motorcycle> allMotorcycles = ss.getAllMotorcycles();
	
			out.append("<html><body><h2>Motory: </h2>");
	
			for (Motorcycle motor: allMotorcycles) {
				out.append("<p>Marka i model: " + motor.getName() + "</p>");
				out.append("<p>Data produkcji: " + motor.getDateOfProduction() + "</p>");
				out.append("<p>Przebieg: " + motor.getMilage() + "</p>");
				out.append("<p>Wypadkowy: " + motor.isCrush() + "</p>");
				out.append("<form action='showBasket'><input type='hidden' name='name' value='" + motor.getName() +"' ><button type=submit>Dodaj do koszyka</button></form><br>");
				}
		}else
		{
			StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");
	
			List<Motorcycle> allMotorcycles = ss.getAllMotorcycles();
	
			out.append("<html><body><h2>Motory: </h2>");
	
			for (Motorcycle motor: allMotorcycles) {
				out.append("<p>Marka i model: " + motor.getName() + "</p>");
				out.append("<p>Data produkcji: " + motor.getDateOfProduction() + "</p>");
				out.append("<p>Przebieg: " + motor.getMilage() + "</p>");
				out.append("<p>Wypadkowy: " + motor.isCrush() + "</p>");
				out.append("<form action='showBasket'><input type='hidden' name='name' value='" + motor.getName() +"' ><button type=submit>Dodaj do koszyka</button></form><br>");
				}
		}
		
			
		
		out.close();
	}
	

	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("storage_service", new StorageService());
	}

}
