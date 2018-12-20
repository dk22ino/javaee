<%@ page import="java.text.DateFormat" %>
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

<body>

<jsp:useBean id="ankieta" class="com.pszczupak.ug.domain.Ankieta" scope="session" />
	<form action='dodajAnkieta.jsp'>
		

  Data Od Kiedy: <input type='date' name='odKiedy' value='<%
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	if(ankieta.getOdKiedy()!=null){
		out.print(df.format(ankieta.getOdKiedy()));}
	else
		out.print(df.format(new java.util.Date()));%>'/></br>
		
	Data Do Kiedy: <input type='date' name='doKiedy' value='<%
	DateFormat dff = new SimpleDateFormat("yyyy-MM-dd");
	if(ankieta.getDoKiedy()!=null){
		out.print(dff.format(ankieta.getDoKiedy()));}
	else
		out.print(df.format(new java.util.Date()));%>'/></br>
  		
  	</br> Jak czesto uzywasz Motocykli:
Codziennie: <input type="radio" name="czestosc" value='dzien' 		<%if(ankieta.isDzien()) out.println("checked"); %>/></br>
Raz na tydzien: <input type="radio" name="czestosc" value='tydzien' <%if(ankieta.isTydzien()) out.println("checked"); %> /></br>
Raz na miesiac: <input type="radio" name="czestosc" value='miesiac' <%if(ankieta.isMiesiac()) out.println("checked"); %> /></br>

</br>Uwagi:
</br>Silnik <input type='checkbox' name='uwagi' value="silnik" <%if(ankieta.isSilnik()) out.println("checked"); %>>
</br>Papiery <input type='checkbox' name='uwagi' value="papiery" <%if(ankieta.isPapiery()) out.println("checked"); %>>
</br>Karoseria <input type='checkbox' name='uwagi' value="karoseria" <%if(ankieta.isKaroseria()) out.println("checked"); %>>
</br>
<input type='submit' value='Dodaj'>
	</form>

<a href='index.jsp'> MENU </a>	
	
</body>
</html>