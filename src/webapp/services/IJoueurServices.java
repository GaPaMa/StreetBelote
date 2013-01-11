package webapp.services;

import webapp.beans.Joueur;

public interface IJoueurServices {
	boolean addJoueur(final Joueur joueur);
	Joueur getJoueur(final String pseudo, final String password);
}
