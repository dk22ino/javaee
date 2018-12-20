<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page import="com.pszczupak.ug.domain.Ankieta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="ankieta" class="com.pszczupak.ug.domain.Ankieta" scope="session" />
<jsp:useBean id="ankietab" class="com.pszczupak.ug.service.AnkietaStorage" scope="application" />
<jsp:useBean id="ankietas" class="com.pszczupak.ug.service.AnkietaStorage" scope="session" />
<body>

<% 
	String s;

	s = request.getParameter("czestosc");
	ankieta.setDzien(false);
	ankieta.setTydzien(false);
	ankieta.setMiesiac(false);

	if(s.equals("dzien")){ankieta.setDzien(true);}
	if(s.equals("tydzien")){ankieta.setTydzien(true);}
	if(s.equals("miesiac")){ankieta.setMiesiac(true);}

	ankieta.setKaroseria(false);
	ankieta.setPapiery(false);
	ankieta.setSilnik(false);
	
	for(String x: request.getParameterValues("uwagi")){
		if(x.equals("silnik")){ankieta.setSilnik(true);}
		if(x.equals("karoseria")){ankieta.setKaroseria(true);}
		if(x.equals("papiery")){ankieta.setPapiery(true);}
	}
	
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	Date dok = format.parse(request.getParameter("doKiedy"));
	Date odk = format.parse(request.getParameter("odKiedy"));
	
	ankieta.setDoKiedy(dok);
	ankieta.setOdKiedy(odk);
	
	ankieta.setId(Ankieta.licznik++);
	
	ankietas.addAnkieta(ankieta);
	ankietab.addAnkieta(ankieta);
	
	
%>




<a href='index.jsp'> MENU </a>	
</body>
</html>