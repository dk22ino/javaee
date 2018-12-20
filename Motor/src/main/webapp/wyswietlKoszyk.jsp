<%@page import="com.pszczupak.ug.domain.Motor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="koszyk" class="com.pszczupak.ug.service.KoszykStorage" scope="session" />
<jsp:useBean id="storage" class="com.pszczupak.ug.service.MotorService" scope="application" />
<body>

 <h1>Koszyk</h1>

<%
int licznik=0;

     for(Motor moto: koszyk.getAllMotor()){
    	 if(storage.szukaj(moto.getId())!=null){
		 	 out.print(moto.MotorInfo()+ "</br>");
		  	 licznik++;
    	 	}
   		}
	
     if(licznik>0)
	out.print("</br></br><form action='podsumowanie.jsp'><button type='submit' name ='kup' value='kupione'>KUP</button></form>");
	
   
   
%>

	
	</br>
	<a href='index.jsp'>Menu</a>
</body>
</html>