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
		<div class="menu-item menu-item-selected">
			Toon Schapen
		</div>
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
			<h1>Bekijk hier alle schapen</h1> 
		<c:forEach items="${schapen}" var="schaap">
		
			${schaap.oornummer}
			${schaap.geboortedatum} 
			${schaap.geslacht} 
			${schaap.nlingen} 
			${schaap.opmerkingen} 
			<br/>
		</c:forEach>
	</div>
</div>

</body>
</html>