<%@page import="com.pszczupak.ug.domain.Motor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:useBean id="koszyk" class="com.pszczupak.ug.service.KoszykStorage" scope="session" />
<jsp:useBean id="storage" class="com.pszczupak.ug.service.MotorService" scope="application" />
<title>Insert title here</title>
</head>
<body>


	<%
	if(request.getParameter("kup") != null)
	{
	out.println("<h1>Kupiono</h1></br>");

	int licznik=0;
	
	  for(Motor moto: koszyk.getAllMotor()){
		  out.println(moto.MotorInfo()+ "</br>");
		licznik++;
	 }
	  
	 int [] tab = new int[licznik];
	  
	 licznik=0;
	 for(Motor moto: koszyk.getAllMotor()){
		  tab[licznik] = moto.getId();
		  licznik++;
	 }
	 
	 for(int i=0 ; i<licznik; i++){
		 storage.deleteMotor(tab[i]);
		 koszyk.deleteMotor(tab[i]);
	 }
	 
	 
	}
	%>	
	
</br>
</br>	
<a href='index.jsp'>Menu</a>	
</body>
</html>