package webapp.beans;

public class Joueur {

	private String pseudo;
	private String password;
	private String email;

	public Joueur() {
	}

	/* Ci-dessous, les Getters / Setters */

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}