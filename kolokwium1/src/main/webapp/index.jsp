<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Motocykle</title>
</head>
<body>
        <form action="rodoCheck">
            <h2>Z powodu zmian w prawie proszę zaakceptowac! [RODO]</h2><br>
            <input type="checkbox" name="rodo" value="rodoStart" required="required">Akceptuje polityke prywatnosci.<br>
            <input type="checkbox" name="rEmail" value="email">Klikajac zgadzasz sie na otrzymywanie email o nowych motocyklach. Podaj email:
            <input type="text" name="email"><br>
            <input type="submit" value="Przejdz Dalej">
        </form>
   
</body>
</html>