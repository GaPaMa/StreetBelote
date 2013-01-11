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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idJoueur")
	private int idJoueur;
	
	@Column(name="pseudo", nullable=false)
	private String pseudo;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="email", nullable=false)
	private String email;
    
	@Column(name="isActif", nullable=false)
	private Boolean isActif;
	
	public JoueurDO(){}

	/**
	 * @return the idJoueur
	 */
	public int getIdJoueur() {
		return idJoueur;
	}

	/**
	 * @param idJoueur the idJoueur to set
	 */
	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}

	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the isActif
	 */
	public Boolean getIsActif() {
		return isActif;
	}

	/**
	 * @param isActif the isActif to set
	 */
	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}
	
}
