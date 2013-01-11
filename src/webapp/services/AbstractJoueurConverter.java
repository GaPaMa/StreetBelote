package webapp.services;

import webapp.beans.Joueur;
import webapp.persistence.data.JoueurDO;

public abstract class AbstractJoueurConverter {
	
	/**
	 * Transforme un objet de type Joueur en type JoueurDO.
	 * @param joueur
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