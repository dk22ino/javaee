<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page import="com.pszczupak.ug.domain.Twister"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="baza" class="com.pszczupak.ug.service.TwisterService" scope="application" />

<body>

<% 
	String s;
	Twister twist = new Twister();
	
	twist.setNazwa(request.getParameter("nazwa"));
	twist.setCena(Double.parseDouble(request.getParameter("cena")));
	
	s = request.getParameter("wiek");
	twist.setDzieci(false);
	twist.setMlodziez(false);
	twist.setDorosli(false);
	
	if(s != null){
	if(s.equals("dzieci")){twist.setDzieci(true);}
	if(s.equals("mlodziez")){twist.setMlodziez(true);}
	if(s.equals("dorosli")){twist.setDorosli(true);}
	}
	
	
	twist.setKolo(false);
	twist.setKwadrat(false);
	twist.setTrojkat(false);

if(request.getParameterValues("figura") != null){
	
	for(String x: request.getParameterValues("figura")){
		if(x.equals("kolo")){twist.setKolo(true);}
		if(x.equals("kwadrat")){twist.setKwadrat(true);}
		if(x.equals("trojkat")){twist.setTrojkat(true);}

	}
}

	
	
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	Date data = format.parse(request.getParameter("dataProdukcji"));

	
	twist.setDataProdukcji(data);

	
	baza.addTwister(new Twister(twist.getNazwa(),twist.getCena(),twist.getDataProdukcji(),twist.isDzieci(),twist.isMlodziez(),twist.isDorosli(),twist.isKolo(),twist.isKwadrat(),twist.isTrojkat()));	
	

	
	
%>


<body>
<h3>Dodano Pomyslnie</h3>

<%
	out.append(twist.TwisterInfo());
%>>

</body>
<a href='dodajTwister.jsp'>Dodaj kolejny</a></br>
<a href='index.jsp'>Menu</a></br>
</html>