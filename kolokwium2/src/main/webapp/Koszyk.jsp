<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.pszczupak.ug.domain.Twister"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="koszyk" class="com.pszczupak.ug.service.TwisterService" scope="session"/>
<jsp:useBean id="baza" class="com.pszczupak.ug.service.TwisterService" scope="application"/>
<body>

	<%

	if(request.getParameter("dodaj")!=null){
		Twister twist1 = baza.szukaj(Integer.parseInt(request.getParameter("dodaj")));
		Twister twist2 = koszyk.szukaj(Integer.parseInt(request.getParameter("dodaj")));
		
		if( twist2 != null )
		{
			out.println("Ten Twister jest juz w koszyku");
		}
		else{
			
		if(twist1 != null){
			koszyk.addTwister(twist1);
			out.println("<h3>Dodano</h3>" + twist1.TwisterInfo());
		}
		else
		{
			out.println("Nie ma takiego Twistera");
		}
		}
	}
	
	%>

</body>

</br>
</br>
<a href='index.jsp'>Menu</a></br>
</body>
</html>