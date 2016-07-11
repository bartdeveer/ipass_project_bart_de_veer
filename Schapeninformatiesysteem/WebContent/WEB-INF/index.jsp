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
		<div class="menu-item menu-item-selected">
			Home
		</div>
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
		<a href="/Schapeninformatiesysteem/schaap-updaten.jsp">
			<div class="menu-item">
				Updaten
			</div>
		</a>
	</div>
	
	<div>
	<br>
		<h1>Welkom op het SchapenInformatieSysteem.</h1> <br/>
		<c:forEach items="${eigenaars}" var="eigenaar">
			${eigenaar.voornaam} ${eigenaar.tussenvoegsel} ${eigenaar.achternaam} <br/>
		</c:forEach>
	</div>
</div>

</body>
</html>