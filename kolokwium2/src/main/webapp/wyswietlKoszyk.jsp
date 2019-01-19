<%@page import="com.pszczupak.ug.domain.Twister"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="koszyk" class="com.pszczupak.ug.service.TwisterService" scope="session"/>
<jsp:useBean id="baza" class="com.pszczupak.ug.service.TwisterService" scope="application"/>
<body>

 <h1>Koszyk</h1>

<%
int licznik=0;

     for(Twister twist: koszyk.getTwister()){
    	 if(baza.szukaj(twist.getId())!=null){
		 	 out.print(twist.TwisterInfo()+ "</br>");
		  	 licznik++;
    	 	}
   		}
	
     
     if(licznik>0)
		out.print("</br></br><form action='podsumowanie.jsp'><button type='submit' name ='kup' value='kupione'>KUP</button></form>");
     else
     {
    	 out.print("<h3> Pustoooooo </h3>");
     }
   
%>

	
	</br>
	<a href='index.jsp'>Menu</a>
</body>
</html>