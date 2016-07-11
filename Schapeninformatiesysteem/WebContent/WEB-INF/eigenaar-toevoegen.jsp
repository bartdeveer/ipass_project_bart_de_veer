<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Welkom</title>
<link rel="stylesheet" type="text/css" href="css/index.css" />
</head>
<body>

<div id="content">
	<div id="menu">
		<a href="/Schapeninformatiesysteem/index.jsp">
			<div class="menu-item">
				Home
			</div>
		</a>
		<div class="menu-item menu-item-selected">
			Edit
		</div>
		<a href="/Schapeninformatiesysteem/toon-schapen.jsp">
		<div class="menu-item">
		Toon Schapen
		</div>
		</a>
		<a href="/Schapeninformatiesysteem/schaap-toevoegen.jsp">
			<div class="menu-item">
				Toevoegen
			</div>
		</a>
		<a href="/Schapeninformatiesysteem/schaap-verwijderen.jsp">
			<div class="menu-item">
				Verwijderen
			</div>
		</a>
		<a href="/Schapeninformatiesysteem/schaap-updaten.jsp">
			<div class="menu-item">
				Updaten
			</div>
		</a>
	</div>
	
	<div>
		<form action= "/Schapeninformatiesysteem/eigenaar-toevoegen.jsp" method="post">
			<b><u>Eigenaar toevoegen</u> </b><br><br>
			Voer uw voornaam in: <input type="text" name="voornaam" required /> <br>
			Voer uw tussenvoegsel in: <input type="text" name="tussenvoegsel"/> <br>
			Voer uw achternaam in: <input type="text" name="achternaam" required/> <br>
			Voer uw wachtwoord in: <input type= "password" name="wachtwoord" required/><br>
			<input type= "submit" name= "registreer"/>	
		</form>
	</div>
</div>

</body>
</html>