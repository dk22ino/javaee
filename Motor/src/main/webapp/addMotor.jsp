<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="storage" class="com.pszczupak.ug.service.MotorService" scope="application" />
<jsp:useBean id="motor" class="com.pszczupak.ug.domain.Motor" scope="session" />

<jsp:setProperty property="id" param="id" name="motor"/>
<jsp:setProperty property="nazwa" param="nazwa" name="motor"/>
<jsp:setProperty property="przebieg" param="przebieg" name="motor"/>
<jsp:setProperty property="cena" param="cena" name="motor"/>
<%



DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

try {
	motor.setDataProdukcji(df.parse(request.getParameter("dataProdukcji")));
} catch (ParseException e) {
	
}

if(request.getParameter("wypadkowy").equals("true"))
	motor.setWypadek(true);
else motor.setWypadek(false);



  
storage.addMotor(motor);
%>
<body>
<h3>Dodano Pomyslnie</h3>

<%
	out.append(motor.MotorInfo());
%>>

</body>
<a href='dodajMotor.jsp'>Dodaj kolejny</a></br>
<a href='index.jsp'>Menu</a></br>
</html>