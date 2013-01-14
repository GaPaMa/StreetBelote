package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {

	/* ****** Redirections *** */
	private static final String FORWARD_JEU = "jeu";

	@RequestMapping(value = "/ajax.do", method = RequestMethod.POST)
	public @ResponseBody String ajax(@RequestParam("joueur") String joueur,
			@RequestParam("carte") String carte, Model model) {
		// return FORWARD_JEU;
		return "Bonjour " + joueur + " - Carte : " + carte;
	}

	
	
	
	
	@RequestMapping(value = "/table.do", method = RequestMethod.POST)
	public String gotoTable(Model model) {
		return FORWARD_JEU;
	}
	
	

}