<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>

<html>
	<head>
		<title>Connexion | Super Belote</title>
		
		<link rel="stylesheet" type="text/css" href="/StreetBelote/css/style.css" />
		<link rel="stylesheet" type="text/css" href="/StreetBelote/css/input.css" />
	</head>
	<body>
		<header>
			Bienvenue sur Street Belote !
		</header>
			
		<section id="bloc_page">
			<article id="connexion">
				<form action="login.do" method="post">
					<h1>Connexion</h1>
					<table class="center">
						<tr>
							<td class="align_right"><label for="pseudo">Pseudo</label></td>
							<td class="align_right"><input id="pseudo" name="pseudo" type="text" placeholder="Saisissez votre pseudo" tabindex="1" /></td>
							<td rowspan="2"><input type="submit" value="Jouer" /></td>
						</tr>
						<tr>
							<td class="align_right"><label for="password">Mot de passe</label></td>
							<td class="align_right"><input id="password" name="password" type="password" placeholder="Saisissez votre mot de passe" tabindex="2" /></td>
						</tr>
						<tr>
							<td colspan="2" class="center"><a href="#">Mot de passe oubli&eacute; ?</a></td>
						</tr>
					</table>
				</form>
			</article>
			
			<article id="inscription">
				<form action="addJoueur.do" method="post">
					<h1>Inscription</h1>
					<table class="center">
						<tr>
							<td class="align_right"><label for="email-inscription">Email</label></td>
							<td class="align_right"><input id="email-inscription" name="email-inscription" type="email" placeholder="Saisissez votre email" tabindex="3" /></td>
							<td rowspan="4"><input type="submit" value="Jouer" /></td>
						</tr>
						<tr>
							<td class="align_right"><label for="pseudo-inscription">Pseudo</label></td>
							<td class="align_right"><input id="pseudo-inscription" name="pseudo-inscription" type="text" placeholder="Saisissez votre pseudo" tabindex="4" /></td>
						</tr>
						<tr>
							<td class="align_right"><label for="password-inscription">Mot de passe</label></td>
							<td class="align_right"><input id="password-inscription" name="password-inscription" type="password" placeholder="Saisissez votre mot de passe" tabindex="5"/></td>
						</tr>
						<tr>
							<td class="align_right"><label for="confirm-password-inscription">Confirmation</label></td>
							<td class="align_right"><input id="confirm-password-inscription" name="confirm-password-inscription" type="password" placeholder="Confirmez votre mot de passe" tabindex="6"/></td>
						</tr>
					</table>
				</form>			
			</article>
		</section>		
		
		<footer>
			Jouez comme vous ne l'avez jamais fait auparavant. True story!
		</footer>
	</body>
</html>