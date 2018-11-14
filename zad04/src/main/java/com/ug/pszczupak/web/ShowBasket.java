package com.ug.pszczupak.web;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ug.pszczupak.domain.Motorcycle;
import com.ug.pszczupak.service.BasketStorage;
import com.ug.pszczupak.service.StorageService;

@WebServlet("/showBasket")
public class ShowBasket extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");	
		PrintWriter out = response.getWriter();
		
		out.append("<html><body><h2>Koszyk: </h2><br/>");
		
		if(request.getParameter("name")!=null) 
		{
			BasketStorage ss = (BasketStorage) getServletContext().getAttribute("basket_storage");
			StorageService aa = (StorageService) getServletContext().getAttribute("storage_service");
			String name = request.getParameter("name");
			Motorcycle motor = ss.getMotor(name,aa);
			ss.addToBasket(motor);
			
			
			List<Motorcycle> allMotors = ss.getBasket();
		
	
			for (Motorcycle motorInBasket: allMotors) {
				out.append("<p>Marka i model: " + motorInBasket.getName() + "</p>");
				out.append("<p>Data produkcji: " + motorInBasket.getDateOfProduction() + "</p>");
				out.append("<p>Przebieg: " + motorInBasket.getMilage() + "</p>");
				out.append("<p>Wypadkowy: " + motorInBasket.isCrush() + "</p><br>");
			}
		}else
		{
			BasketStorage ss = (BasketStorage) getServletContext().getAttribute("basket_storage");
			
			List<Motorcycle> allMotors = ss.getBasket();
		
	
			for (Motorcycle motorInBasket: allMotors) {
				out.append("<p>Marka i model: " + motorInBasket.getName() + "</p>");
				out.append("<p>Data produkcji: " + motorInBasket.getDateOfProduction() + "</p>");
				out.append("<p>Przebieg: " + motorInBasket.getMilage() + "</p>");
				out.append("<p>Wypadkowy: " + motorInBasket.isCrush() + "</p><br>");
			}
			
			
		}
	
		
		out.append("<form method='get' action='/zad04/FormaRodo.jsp'>" + 
				"    <button type='submit'>Kup Motocykle</button>" + 
				"</form>");
		
		out.append("<a href='/zad04/Index'>Przejdz do Start</a></body></html>");
		
		out.close();

	
		
		}
	
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("basket_storage", new BasketStorage());
	}

}
