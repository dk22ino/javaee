<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page import="com.pszczupak.ug.domain.Magazyn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="magazyn" class="com.pszczupak.ug.domain.Magazyn" scope="session" />
<jsp:useBean id="baza" class="com.pszczupak.ug.service.MagazynStorage" scope="application" />
<jsp:setProperty property="imie" param="imie" name="magazyn"/>

<body>
	
	<%
		String s = request.getParameter("czestosc");
		
		magazyn.setDzien(false);
		magazyn.setTydzien(false);
		magazyn.setMiesiac(false);
		
		if(s.equals("dzien")){magazyn.setDzien(true);
		if(s.equals("tydzien")){magazyn.setTydzien(true);}
		if(s.equals("miesiac")){magazyn.setMiesiac(true);}}
	
		
		for(String x: request.getParameterValues("info")){
			if(x.equals("silnik")){magazyn.setSilnik(true);}
			if(x.equals("motor")){magazyn.setMotor(true);}
			if(x.equals("wypadki")){magazyn.setWypadki(true);}
		}
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date dok = format.parse(request.getParameter("doKiedy"));
		Date odk = format.parse(request.getParameter("odKiedy"));
		
		magazyn.setDoKiedy(dok);
		magazyn.setOdKiedy(odk);
		
		if(baza.Sprawdz(magazyn.getImie()) == null){
			baza.addMagazyn(magazyn);
		}
		else
		{
			Magazyn p = baza.Sprawdz(magazyn.getImie());
			p.setDoKiedy(magazyn.getDoKiedy());
			p.setOdKiedy(magazyn.getOdKiedy());
			p.setMiesiac(magazyn.isMiesiac());
			p.setDzien(magazyn.isDzien());
			p.setTydzien(magazyn.isTydzien());
			p.setSilnik(magazyn.isSilnik());
			p.setMotor(magazyn.isMotor());
			p.setWypadki(magazyn.isWypadki());
		}

	%>
	</br>
	Zapisano Cie Do Newsleter
	</br>
	
	<% out.print(magazyn.getImie() + "  " + magazyn.getOdKiedy()+ "  " + magazyn.getDoKiedy() + " " + magazyn.isDzien() );%>
	
</body>
</html>