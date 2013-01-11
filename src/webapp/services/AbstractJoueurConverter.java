package webapp.services;

import webapp.beans.Joueur;
import webapp.persistence.data.JoueurDO;

public abstract class AbstractJoueurConverter {
	
	/**
	 * @param produit
	 * @return
	 */
	protected JoueurDO convertJoueurToJoueurDO(final Joueur joueur) {
		JoueurDO joueurDO = new JoueurDO();
		joueurDO.setEmail(joueur.getEmail());
		joueurDO.setPseudo(joueur.getPseudo());
		joueurDO.setPassword(joueur.getPassword());
		joueurDO.setIsActif(true);
		
		return joueurDO;
	}
}
