package webapp.beans;

/*
 CarteComparator.java
 *********************************************************************
 * La classe CarteComparator permet de comparer 2 cartes, en 		*
 * indiquant la couleur atout et celle demandée.						*
 *********************************************************************
 */
public class CarteComparator {

	/*
	 * Retourne -1 si la carte 1 est inférieure à la carte 2. Retourne 1 si la
	 * carte 1 est supérieure à la carte 2.
	 */
	public static int compare(final Carte carte1, final Carte carte2,
			final Couleur demandee, final Couleur atout) {
		final Couleur couleurC1 = carte1.getCouleur();
		final Couleur couleurC2 = carte2.getCouleur();

		// Si l'une des cartes est un atout, contre une normale.
		if (couleurC1 == atout && couleurC2 != atout)
			return 1;
		else if (couleurC1 != atout && couleurC2 == atout)
			return -1;

		// Si l'une des cartes est de la couleur demandée, contre une autre.
		if (couleurC1 == demandee && couleurC2 != demandee)
			return 1;
		else if (couleurC1 != demandee && couleurC2 == demandee)
			return -1;

		// Sinon, si on joue atout
		if (couleurC1 == atout)
			return carte1.getValeurAtout() > carte2.getValeurAtout() ? 1 : -1;
		// si on joue 2 cartes normales
		else
			return carte1.getValeurNormale() > carte2.getValeurNormale() ? 1
					: -1;
	}

}
