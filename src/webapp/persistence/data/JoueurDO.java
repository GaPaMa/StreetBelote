package webapp.persistence.data;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "joueur")
public class JoueurDO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idJoueur")
	private int idJoueur;

	@Column(name = "pseudo", nullable = false)
	private String pseudo;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "isActif", nullable = false)
	private Boolean isActif;

	public JoueurDO() {
	}

	/* Ci-dessous, les Getters / Setters */

	public int getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}

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

	public Boolean isActif() {
		return isActif;
	}

	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}

}