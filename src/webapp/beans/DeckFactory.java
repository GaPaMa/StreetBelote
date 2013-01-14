package webapp.beans;

import java.util.ArrayList;
import java.util.List;

/*
 DeckFactory.java
 *********************************************************************
 * DeckFactory permet de cr�er le jeu complet de carte.				*
 * On peut aussi ne r�cup�rer que les cartes d'une certaine couleur.	*
 *********************************************************************
 */
public class DeckFactory {

	/**
	 * Cr�ation de toutes les cartes d'une m�me couleur pour les ajouter dans
	 * une liste
	 * 
	 * @param couleur
	 * @return la liste des cartes d'une m�me couleur
	 */
	private static List<Carte> getCarteCouleur(final Couleur couleur) {
		final List<Carte> cartes = new ArrayList<Carte>();
		for (int i = 0; i < 8; i++) {
			try {
				Carte carte = new Carte(couleur, i);
				cartes.add(carte);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cartes;
	}

	/**
	 * R�cup�ration de toutes les cartes
	 * 
	 * @return la liste de toutes les cartes
	 */
	public static List<Carte> getAllCartes() {
		final List<Carte> cartes = new ArrayList<Carte>();

		cartes.addAll(getCarteCouleur(Couleur.pique));
		cartes.addAll(getCarteCouleur(Couleur.trefle));
		cartes.addAll(getCarteCouleur(Couleur.carreau));
		cartes.addAll(getCarteCouleur(Couleur.coeur));

		return cartes;
	}

}
