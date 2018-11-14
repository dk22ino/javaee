<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Motocykle</title>
</head>
<body>
        <form action="rodoCheck">
            <h2>Z powodu zmian w prawie proszę zaakceptowac! [RODO]</h2><br>
            <input type="checkbox" name="rodo" value="rodoKup" required="required">Akceptuje polityke prywatnosci.<br>
            
            Imie:<input type="text" name="name" required="required"><br>
            Nazwisko:<input type="text" name="surname" required="required"><br>
            Email:<input type="text" name="email" required="required"><br>
            
            <input type="checkbox" name="doesEmail" value="motorcycle">Klikajac zgadzasz sie na otrzymywanie email o nowych motocyklach. Podaj email:
            <input type="submit" value="Przejdz Dalej">
        </form>
   
</body>
</html>