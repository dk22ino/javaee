<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="motor" class="com.pszczupak.ug.domain.Motor" scope="session" />

<form action="addMotor.jsp">

  Dodaj nazwe Motoru (Marak/Model): <input type="text" name="nazwa" value="${motor.nazwa}"/><br />
  Dodaj przebieg Motoru (Liczba calkowita): <input type="text" name="przebieg" value="${motor.przebieg}"/><br />
  Dodaj cene Motoru : <input type="text" name="cena" value="${motor.cena}"/><br />
  Data produkcji: <input type='date' name='dataProdukcji' value='<%
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	if(motor.getDataProdukcji()!=null){
		out.print(df.format(motor.getDataProdukcji()).toString());}
	else
		out.print(df.format(new java.util.Date()));%>'/></br>
  		
  Bity:</br></br>Nie Wypadkowy:     <input type="radio" name="wypadkowy" value='false' checked />
			</br>Wypadkowy: <input type="radio" name="wypadkowy" value='true'  <%if(motor.isWypadek()) out.println("checked"); %>/>
  	
  	<input type='submit' value='Dodaj'/></form></br>

<a href='index.jsp'>Menu</a></br>


</body>
</html>