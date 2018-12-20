<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page import="com.pszczupak.ug.domain.Twister"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dodaj Twister</title>


</head>

<body>


	<form action='addTwister.jsp'>
	
  Nazwa: <input type="text" name='nazwa' value=""> </br>	
  Cena:  <input type="text" name='cena' value="0">  </br>	

  Data produkcji: <input type='date' name='dataProdukcji' value='<%
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		out.print(df.format(new java.util.Date()));%>'/></br>
		

  		
  	</br> Jaki Przedzial wiekowy do gry:
	Dzieci: <input type="radio" name="wiek" value='dzieci' 	/></br>
	Mlodziez: <input type="radio" name="wiek" value='mlodziez' /></br>
	Dorosli: <input type="radio" name="wiek" value='dorosli'  /></br>

	</br>Rodzaj figur mozna wybrac ile sie chce:
	</br>Kolo <input type='checkbox' name='figura' value="kolo">
	</br>Kwadrat <input type='checkbox' name='figura' value="kwadrat">
	</br>Trojkat <input type='checkbox' name='figura' value="kwadrat">
	</br>
	<input type='submit' value='Dodaj'>
	</form>

<a href='index.jsp'> MENU </a>	
	
</body>
</html>