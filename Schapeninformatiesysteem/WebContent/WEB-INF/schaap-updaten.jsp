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
		<a href="/Schapeninformatiesysteem/eigenaar-toevoegen.jsp">
		<div class="menu-item">
			Edit
		</div>
		</a>
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
		
		<div class="menu-item menu-item-selected">
				Updaten
			</div>
	</div>
	
	<div>
		<form action= "/Schapeninformatiesysteem/schaap-toevoegen.jsp" method="post">
			<b><u>Schaap updaten</u> </b><br><br>
			Oornummer: <input type="text" name="oornummer" required /> <br>
			Opmerking aanpassen: <input type="text" name="opmerking"/> <br>
			<input type= "submit" name= "toevoegen"/>	
		</form>
	</div>
</div>

</body>
</html>