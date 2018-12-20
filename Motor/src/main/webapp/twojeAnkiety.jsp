<%@page import="com.pszczupak.ug.domain.Ankieta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="ankietas" class="com.pszczupak.ug.service.AnkietaStorage" scope="session"/>
<body>
<% 

	for(Ankieta a: ankietas.AllAnkieta()){
		out.print(a.getId()+ "</br>" + a.getDoKiedy() + "</br>" + a.getOdKiedy() + "</br></br>" );	
	}

%>
</body>
</html>