<%@page pageEncoding="UTF-8" contentType="text/html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>ProjetDDH</title>
</head>
<body>
<!--Formulaire pour créer une série  -->
	
	<p>JSP pour projetDDH</p>
	<form method="post" action=" "> <!-- Rajouter les actions correspondantes au fichier modifié -->  
	
		<p>Créer</p>
	</form>
	<form method="post" action=" "> <!-- Rajouter les actions correspondantes au fichier modifié -->  
		<p>Série</p>
		<input type="text" name="serie" />
	</form>
	<form method="post" action=" "> <!-- Rajouter les actions correspondantes au fichier modifié -->  
		<p>Saison</p>
		<input type="text" name="saison" />
	</form>
	<form method="post" action=" "> <!-- Rajouter les actions correspondantes au fichier modifié -->  
		<p>Episode</p>
		<input type="text" name="episode" />
	</form>
	<!-- Curseur de notation -->
	<form method="post" action="episode.java" oninput="resultat.value = note.valueAsNumber;"> <!--  paramètre la note pour l'épisode -->
		<p>Votre avis ?</p>
		 <div style="border:solid 3px silver; padding:10px;">
		 <input id="echelle" name="echelle" type="range" min="0" max="10" value="1" style="width:300px;" />
		 <output id="resultat" for="echelle" style="margin:0px; padding:0px;">5</output>/10
	</form>
	<button id="Supprimer" onclick="supprimer()">Supprimer ?</button> <br/>
		
</body>
</html>