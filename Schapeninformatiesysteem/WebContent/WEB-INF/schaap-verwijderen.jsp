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
		
		<div class="menu-item menu-item-selected">
				Verwijderen
			</div>
			
		<a href="/Schapeninformatiesysteem/schaap-updaten.jsp">
			<div class="menu-item">
				Updaten
			</div>
		</a>
	</div>
	
	<div>
		<form action= "/Schapeninformatiesysteem/schaap-toevoegen.jsp" method="post">
			<b><u>Schaap verwijderen</u> </b><br><br>
			Oornummer: <input type="text" name="oornummer" required /> <br>
			<input type= "submit" name= "toevoegen"/>	
		</form>
	</div>
</div>

</body>
</html>