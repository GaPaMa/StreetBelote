package webapp.persistence.data;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Wilfrid
 */
@Entity
@Table(name = "joueur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joueur.findAll", query = "SELECT j FROM JoueurDO j"),
    @NamedQuery(name = "Joueur.findByIdJoueur", query = "SELECT j FROM JoueurDO j WHERE j.idJoueur = :idJoueur"),
    @NamedQuery(name = "Joueur.findByPseudo", query = "SELECT j FROM JoueurDO j WHERE j.pseudo = :pseudo"),
    @NamedQuery(name = "Joueur.findByPseudoAndPassword", query = "SELECT j FROM JoueurDO j WHERE j.pseudo = :pseudo AND j.password = :password"),
    @NamedQuery(name = "Joueur.findByPassword", query = "SELECT j FROM JoueurDO j WHERE j.password = :password"),
    @NamedQuery(name = "Joueur.findByEmail", query = "SELECT j FROM JoueurDO j WHERE j.email = :email"),
    @NamedQuery(name = "Joueur.findByEstActif", query = "SELECT j FROM JoueurDO j WHERE j.estActif = :estActif")})
public class JoueurDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idJoueur")
    private Integer idJoueur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "pseudo")
    private String pseudo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "password")
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estActif")
    private boolean estActif;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJoueur")
    private Collection<StatistiquesDO> statistiquesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJoueur1")
    private Collection<EquipeDO> equipeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJoueur2")
    private Collection<EquipeDO> equipeCollection1;
    @JoinColumn(name = "idAvatar", referencedColumnName = "idAvatar")
    @ManyToOne
    private AvatarDO idAvatar;

    public JoueurDO() {
    }

    public JoueurDO(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public JoueurDO(Integer idJoueur, String pseudo, String password, String email, boolean estActif) {
        this.idJoueur = idJoueur;
        this.pseudo = pseudo;
        this.password = password;
        this.email = email;
        this.estActif = estActif;
    }

    public Integer getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
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

    public boolean getEstActif() {
        return estActif;
    }

    public void setEstActif(boolean estActif) {
        this.estActif = estActif;
    }

    @XmlTransient
    public Collection<StatistiquesDO> getStatistiquesCollection() {
        return statistiquesCollection;
    }

    public void setStatistiquesCollection(Collection<StatistiquesDO> statistiquesCollection) {
        this.statistiquesCollection = statistiquesCollection;
    }

    @XmlTransient
    public Collection<EquipeDO> getEquipeCollection() {
        return equipeCollection;
    }

    public void setEquipeCollection(Collection<EquipeDO> equipeCollection) {
        this.equipeCollection = equipeCollection;
    }

    @XmlTransient
    public Collection<EquipeDO> getEquipeCollection1() {
        return equipeCollection1;
    }

    public void setEquipeCollection1(Collection<EquipeDO> equipeCollection1) {
        this.equipeCollection1 = equipeCollection1;
    }

    public AvatarDO getIdAvatar() {
        return idAvatar;
    }

    public void setIdAvatar(AvatarDO idAvatar) {
        this.idAvatar = idAvatar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJoueur != null ? idJoueur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof JoueurDO)) {
            return false;
        }
        JoueurDO other = (JoueurDO) object;
        if ((this.idJoueur == null && other.idJoueur != null) || (this.idJoueur != null && !this.idJoueur.equals(other.idJoueur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Joueur[ idJoueur=" + idJoueur + " ]";
    }
    
}
