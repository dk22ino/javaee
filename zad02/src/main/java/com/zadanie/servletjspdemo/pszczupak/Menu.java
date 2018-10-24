package com.zadanie.servletjspdemo.pszczupak;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/menu")
public class Menu extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body><div>"
        		+ "<div><a href='/zad02/date'>Date</a></div>"
        		+ "<div><a href='/zad02/about'>About</a></div>"
        		+ "</div></body></html>");
    }
}
