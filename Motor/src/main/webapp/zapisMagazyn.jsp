<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %>
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

<body>
		<form action="addMagazyn.jsp">
		<h1>Witamy w Zapisach do NewsLettera</h1></br>
		Podaj Imie:<input type="text" name="imie" value="${magazyn.imie}"></br>
		
		  Data Od Kiedy: <input type='date' name='odKiedy' value='<%
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				if(magazyn.getOdKiedy()!=null){
					out.print(df.format(magazyn.getOdKiedy()));}
				else
					out.print(df.format(new java.util.Date()));%>'/></br>
		
		  Data Do Kiedy: <input type='date' name='doKiedy' value='<%
			DateFormat dff = new SimpleDateFormat("yyyy-MM-dd");
				if(magazyn.getDoKiedy()!=null){
					out.print(dff.format(magazyn.getDoKiedy()));}
				else
					out.print(df.format(new java.util.Date()));%>'/></br>
		
		
		  	</br> Jak czesto chcesz otrzymywac nasz Newsletter:
			Codziennie: <input type="radio" name="czestosc" value='dzien' 		<%if(magazyn.isDzien()) out.println("checked"); %>/></br>
			Raz na tydzien: <input type="radio" name="czestosc" value='tydzien' <%if(magazyn.isTydzien()) out.println("checked"); %> /></br>
			Raz na miesiac: <input type="radio" name="czestosc" value='miesiac' <%if(magazyn.isMiesiac()) out.println("checked"); %> /></br>
		
		
			</br>O jakich tematykach chcesz otrzymywac informacje:
			</br>Silniki <input type='checkbox' name='info' value="silnik" <%if(magazyn.isSilnik()) out.println("checked"); %>>
			</br>Motory <input type='checkbox' name='info' value="motor"	 <%if(magazyn.isMotor()) out.println("checked"); %>>
			</br>Wypadki <input type='checkbox' name='info' value="wypadki" <%if(magazyn.isWypadki()) out.println("checked"); %>>
			</br>
		
  		<input type='submit' value='Dodaj'/>
  		</form></br>

<a href='index.jsp'>Menu</a></br>
</body>
</html>