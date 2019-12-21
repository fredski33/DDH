<%@page pageEncoding="UTF-8" contentType="text/html"%>

<!DOCTYPE html>
<html>
<head>
<title>ProjetDDH</title>
</head>
<body>
<!--Formulaire pour créer une série  -->
	<x:parse var="modifier" items="#{paramValues}"/>
	<p>JSP pour projetDDH</p>
	<form method="post" action=" ">
		<p>Modifier</p>
	</form>
	<form method="post" action=" ">
		<p>Série</p>
		<input type="text" name="serie" />
	</form>
	<form method="post" action=" ">
		<p>Saison</p>
		<input type="text" name="saison" />
	</form>
	<form method="post" action=" ">
		<p>Episode</p>
		<input type="text" name="episode" />
	</form>
	<!-- Curseur de notation -->
	<form method="post" action="episode.java" oninput="resultat.value = note.valueAsNumber;">
		<p>Votre avis ?</p>
		 <div style="border:solid 3px silver; padding:10px;">
		 <input id="echelle" name="echelle" type="range" min="0" max="10" value="1" style="width:500px;" />
		 <output id="resultat" for="note" style="margin:0px; padding:0px;">5</output>/100
	</form>
	<button id="Supprimer" onclick="supprimer()">Supprimer ?</button> <br/>
		
</body>
</html>