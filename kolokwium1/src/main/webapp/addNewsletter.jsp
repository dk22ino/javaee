<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Newsletter</title>
</head>
<body>
        <form action="newsletter">
            <h2>Dołacz do naszego Newslettera</h2><br>            
            Imie:<input type="text" name="name" required="required"><br>
			Data od kiedy:<input type="text" name="dataOd" required="required"><br>
			Data do kiedy:<input type="text" name="dataDo" required="required"><br>   
			
			<p>Czestotliwosc:<p>
			<input type="radio" name="czestosc" value="codziennie"> Codziennie<br>
			<label><input type="radio" name="czestosc" value="tygodniowo" > Tygodniowo <br>
			<label><input type="radio" name="czestosc" value="miesiecznie"> Miesiecznie<br>     
			<br></br>
			<h2>Tematyka</h2>
			<input type="checkbox" name="tematyka" value="motory">
			<input type="checkbox" name="tematyka" value="podroze">
			<input type="checkbox" name="tematyka" value="akcesria">	
            
            <input type="submit" value="Przejdz Dalej">
        </form>
   
</body>
</html>