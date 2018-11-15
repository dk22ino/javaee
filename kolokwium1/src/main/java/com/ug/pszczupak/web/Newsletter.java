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

import com.ug.pszczupak.domain.NewsletterUser;
import com.ug.pszczupak.service.NewsletterStorage;

@WebServlet("/newsletter")
public class Newsletter extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		
		
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		if(request.getParameter("imie")!=null && request.getParameter("dataOd")!=null && request.getParameter("dataDo")!=null && request.getParameter("tematyka")!=null && request.getParameter("czestosc")!=null)
		{
			String imie = request.getParameter("imie");
			DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			Date dataOd = null;
			try {
				dataOd = formatter.parse(request.getParameter("dataOd"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Date dataDo = null;
			try {
				dataDo = formatter.parse(request.getParameter("dataDo"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			String tematyka = request.getParameter("teamtyka");			
			String czestosc = request.getParameter("czestosc");

			
			NewsletterUser user = new NewsletterUser(imie,dataOd,dataDo,tematyka,czestosc);
			
			NewsletterStorage ss = (NewsletterStorage) getServletContext().getAttribute("storage_service");
			ss.add(user);
	
			List<NewsletterUser> allUser = ss.getAllUser();
	
			out.append("<html><body><h2>Users: </h2>");
	
			for (NewsletterUser news: allUser) {
				out.append("<p>Imie: " + news.getImie() + "</p>");
				out.append("<p>Data od: " + news.getDataOd() + "</p>");
				out.append("<p>Data do: " + news.getDataDo() + "</p>");
				out.append("<p>tematyka: " + news.getTematyka() + "</p>");
				out.append("<p>czestosc: " + news.getCzestosc() + "</p>");
				}
		}else
		{
			//Nie zdazylem
		}
		
			
		
		out.close();
	}
	

	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("storage_service", new  NewsletterStorage());
	}

}