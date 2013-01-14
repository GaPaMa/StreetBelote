/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.persistence.data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Wilfrid
 */
@Entity
@Table(name = "partie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partie.findAll", query = "SELECT p FROM PartieDO p"),
    @NamedQuery(name = "Partie.findByIdPartie", query = "SELECT p FROM PartieDO p WHERE p.idPartie = :idPartie"),
    @NamedQuery(name = "Partie.findByIdEquipeVainqueur", query = "SELECT p FROM PartieDO p WHERE p.idEquipeVainqueur = :idEquipeVainqueur"),
    @NamedQuery(name = "Partie.findByDatePartie", query = "SELECT p FROM PartieDO p WHERE p.datePartie = :datePartie")})
public class PartieDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPartie")
    private Integer idPartie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEquipeVainqueur")
    private int idEquipeVainqueur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datePartie")
    @Temporal(TemporalType.DATE)
    private Date datePartie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPartie")
    private Collection<StatistiquesDO> statistiquesCollection;
    @JoinColumn(name = "idEquipe1", referencedColumnName = "idEquipe")
    @ManyToOne(optional = false)
    private EquipeDO idEquipe1;
    @JoinColumn(name = "idEquipe2", referencedColumnName = "idEquipe")
    @ManyToOne(optional = false)
    private EquipeDO idEquipe2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPartie")
    private Collection<ResultatsDO> resultatsCollection;

    public PartieDO() {
    }

    public PartieDO(Integer idPartie) {
        this.idPartie = idPartie;
    }

    public PartieDO(Integer idPartie, int idEquipeVainqueur, Date datePartie) {
        this.idPartie = idPartie;
        this.idEquipeVainqueur = idEquipeVainqueur;
        this.datePartie = datePartie;
    }

    public Integer getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(Integer idPartie) {
        this.idPartie = idPartie;
    }

    public int getIdEquipeVainqueur() {
        return idEquipeVainqueur;
    }

    public void setIdEquipeVainqueur(int idEquipeVainqueur) {
        this.idEquipeVainqueur = idEquipeVainqueur;
    }

    public Date getDatePartie() {
        return datePartie;
    }

    public void setDatePartie(Date datePartie) {
        this.datePartie = datePartie;
    }

    @XmlTransient
    public Collection<StatistiquesDO> getStatistiquesCollection() {
        return statistiquesCollection;
    }

    public void setStatistiquesCollection(Collection<StatistiquesDO> statistiquesCollection) {
        this.statistiquesCollection = statistiquesCollection;
    }

    public EquipeDO getIdEquipe1() {
        return idEquipe1;
    }

    public void setIdEquipe1(EquipeDO idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }

    public EquipeDO getIdEquipe2() {
        return idEquipe2;
    }

    public void setIdEquipe2(EquipeDO idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }

    @XmlTransient
    public Collection<ResultatsDO> getResultatsCollection() {
        return resultatsCollection;
    }

    public void setResultatsCollection(Collection<ResultatsDO> resultatsCollection) {
        this.resultatsCollection = resultatsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPartie != null ? idPartie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PartieDO)) {
            return false;
        }
        PartieDO other = (PartieDO) object;
        if ((this.idPartie == null && other.idPartie != null) || (this.idPartie != null && !this.idPartie.equals(other.idPartie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Partie[ idPartie=" + idPartie + " ]";
    }
    
}
