package webapp.services;

import webapp.beans.Joueur;
import webapp.persistence.data.JoueurDO;

public abstract class AbstractJoueurConverter {	

	/**
	 * @param joueur
	 * @return
	 */
	protected JoueurDO convertJoueurToJoueurDO(final Joueur joueur) {
		JoueurDO joueurDO = new JoueurDO();
		joueurDO.setEmail(joueur.getEmail());
		joueurDO.setPseudo(joueur.getPseudo());
		joueurDO.setPassword(joueur.getPassword());
		joueurDO.setEstActif(true);
		
		return joueurDO;
	}
		
	/**
	 * @param joueurDO
	 * @return
	 */
	protected Joueur convertJoueurDOToJoueur(final JoueurDO joueurDO) {
		Joueur joueur = new Joueur();		
		joueur.setEmail(joueurDO.getEmail());
		joueur.setPseudo(joueurDO.getPseudo());
		joueur.setPassword(joueurDO.getPassword());
		
		return joueur;
	}
}
