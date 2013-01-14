package webapp.persistence.dao;

import webapp.persistence.data.JoueurDO;

public interface IJoueurDAO {
	boolean addJoueur(final JoueurDO joueurDO);
	JoueurDO getJoueur(final String pseudo, final String password);
}
