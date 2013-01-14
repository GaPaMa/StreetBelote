<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Accueil | Super Belote</title>
		
		<link rel="stylesheet" href="/StreetBelote/css/style.css" />
		<link rel="stylesheet" href="/StreetBelote/css/input.css" />
	</head>
	<body>
		<header>
			Bienvenue <c:out value="${joueur.pseudo}"></c:out>
		</header>	
		
		<section id="bloc_page">
			<article id="parties" style="text-align:center">
				<h1>Parties</h1>
				<form action="table.do" method="post">
					<input type="submit" style="width: 500px;" value="Cr&eacute;er une nouvelle partie" />
				</form>
				<form action="table.do" method="post">
					<table class="partiesTab">
					
						<colgroup>
							<col span="2" width="60%" style="background-color:#B8C7D3" />
							<col span="3" width="40%" style="background-color: #CCCCCC" />
						</colgroup>
					
						<thead>
							<tr>
								<th>Nom de la partie</th>
								<th>Joueurs</th>
								<th>Annonces</th>
								<th>Prot&eacute;g&eacute;</th>
								<th></th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<th>Nom de la partie</th>
								<th>Joueurs</th>
								<th>Annonces</th>
								<th>Prot&eacute;g&eacute;</th>
								<th></th>
							</tr>
						</tfoot>
						<tbody>
							<tr>
								<td>xxxxxx</td>
								<td>x / 4</td>
								<td><input type="checkbox" disabled="disabled" checked /></td>
								<td><input type="checkbox" disabled="disabled" /></td>
								<td><input type="submit" value="rejoindre" /></td>
							</tr>
							<tr>
								<td>xxxxxx</td>
								<td>x / 4</td>
								<td><input type="checkbox" disabled="disabled" /></td>
								<td><input type="checkbox" disabled="disabled" checked /></td>
								<td><input type="submit" value="rejoindre" /></td>
							</tr>
							<tr>
								<td>xxxxxx</td>
								<td>x / 4</td>
								<td><input type="checkbox" disabled="disabled" checked /></td>
								<td><input type="checkbox" disabled="disabled" checked /></td>
								<td><input type="submit" value="rejoindre" /></td>
							</tr>
						</tbody>
					</table>
				</form>
			</article>
			
			<aside id="profil">				
				<p id="photo_profil"><img src="images/avatar.png" alt="Photo de Profil" /></p>
				<form action="profil.html" method="GET" style="text-align: center">
					<input type="submit" value="Mon Profil" />
				</form>
				
				<p>Profil et infos tournois.</p>
			
			</aside>
		</section>		
		
		
		<footer>
			Votre score total est de XXXXX points
		</footer>
	</body>
</html>