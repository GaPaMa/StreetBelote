package webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import webapp.beans.Joueur;
import webapp.services.IJoueurServices;

@Controller
public class JoueurController {

	/******* Actions ******/
	private static final String ACTION_LOGIN_DO = "/login.do";
	private static final String ACTION_ADD_JOUEUR_DO = "/addJoueur.do";
	
	/*******Redirections****/
	private static final String FORWARD_INDEX = "index";
	private static final String FORWARD_ACCUEIL = "accueil";
	
	
	/**** le bean est créé automatiquement avec Autowired (pas besoin de le mettre dans le xml) ***/
	@Autowired
	private IJoueurServices joueurServices;
	

	@RequestMapping(value = ACTION_ADD_JOUEUR_DO, method = RequestMethod.POST)
	public String addJoueur(
			@RequestParam("email-inscription") String email,
			@RequestParam("pseudo-inscription") String pseudo,
			@RequestParam("password-inscription") String password,
			@RequestParam("confirm-password-inscription") String confirmPassword,
			Model model) {

		Joueur joueur = new Joueur();
		joueur.setPseudo(pseudo);
		joueur.setEmail(email);
		joueur.setPassword(password);
		
		//a faire : verifier mdp
		
		boolean isCreate = joueurServices.addJoueur(joueur);
		if(isCreate){
			model.addAttribute("pseudo", pseudo);
			return FORWARD_ACCUEIL;
		}else{
			return FORWARD_INDEX;
		}
	}

	@RequestMapping(value = ACTION_LOGIN_DO, method = RequestMethod.POST)
	public String login(@RequestParam("pseudo") String pseudo,
			@RequestParam("password") String password, Model model) {
	
		//vérifier existence du joueur
		
		model.addAttribute("pseudo", pseudo);
		return FORWARD_ACCUEIL;
	}

}
