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
<% 
	if(!magazyn.getImie().equals(""))
	out.print(magazyn.getImie() + " "+ magazyn.getOdKiedy() +"  "+ magazyn.getDoKiedy()+"  "+magazyn.isDzien()+"</br>");
%>

</body>
</html>