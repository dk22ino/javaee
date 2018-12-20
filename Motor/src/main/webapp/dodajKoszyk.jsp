
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

<%
	if(request.getParameter("dodaj")!=null){
		Motor moto1 = storage.szukaj(Integer.parseInt(request.getParameter("dodaj")));
		Motor moto2 = koszyk.szukaj(Integer.parseInt(request.getParameter("dodaj")));
		
		if( moto2 != null )
		{
			out.println("Ten Motor jest juz w koszyku");
		}
		else{
			
		if(moto1 != null){
			koszyk.addKoszyk(moto1);
			out.println("<h3>Dodano</h3>" + moto1.MotorInfo());
		}
		else
		{
			out.println("Nie ma takiego Motoru");
		}
		}
	}

%>


</head>


<body>




</br>
</br>
<a href='index.jsp'>Menu</a></br>
</body>
</html>