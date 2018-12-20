<%@page import="com.pszczupak.ug.domain.Magazyn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
    <jsp:useBean id="baza" class="com.pszczupak.ug.service.MagazynStorage" scope="application" />
<body>
	
	
	<%
	
	for(Magazyn m: baza.AllMagazyn()){
		
		out.print(m.getImie() + " "+ m.getOdKiedy() +"  "+ m.getDoKiedy()+"  "+m.isDzien()+"</br>");
		
	}
	
	
	
	%>
	
</body>
</html>