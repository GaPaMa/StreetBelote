package webapp.beans;

public class Statistiques {

	private int id;

	private Partie partie;
	private Joueur joueur;

	// Quand le joueur d�cide de prendre la carte au jeu.
	private int nombrePrisesAtout;
	// Quand l'�quipe met l'�quipe adverse capot.
	private int nombreCapots;
	// Les annonces du joueur lors de la partie.
	private int nombreAnnonces;

}