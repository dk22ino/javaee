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


	<%
	if(request.getParameter("kup") != null)
	{
	out.println("<h1>Kupiono</h1></br>");

	int licznik=0;
	
	  for(Twister twist: koszyk.getTwister()){
		  out.println(twist.TwisterInfo()+ "</br>");
		licznik++;
	 }
	  
	 int [] tab = new int[licznik];
	  
	 licznik=0;
	 
	 for(Twister twist: koszyk.getTwister()){
		  tab[licznik] = twist.getId();
		  licznik++;
	 }
	 
	 for(int i=0 ; i<licznik; i++){
		 baza.deleteTwister(tab[i]);
		 koszyk.deleteTwister(tab[i]);
	 }
	 
	 
	}
	%>	



</body>
</br>
</br>
<a href='index.jsp'>Menu</a></br>
</body>
</html>