/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.persistence.data;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wilfrid
 */
@Entity
@Table(name = "statistiques")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statistiques.findAll", query = "SELECT s FROM StatistiquesDO s"),
    @NamedQuery(name = "Statistiques.findByIdStats", query = "SELECT s FROM StatistiquesDO s WHERE s.idStats = :idStats"),
    @NamedQuery(name = "Statistiques.findByNombreAnnonces", query = "SELECT s FROM StatistiquesDO s WHERE s.nombreAnnonces = :nombreAnnonces"),
    @NamedQuery(name = "Statistiques.findByNombreCapots", query = "SELECT s FROM StatistiquesDO s WHERE s.nombreCapots = :nombreCapots"),
    @NamedQuery(name = "Statistiques.findByNombrePrisesAtout", query = "SELECT s FROM StatistiquesDO s WHERE s.nombrePrisesAtout = :nombrePrisesAtout")})
public class StatistiquesDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idStats")
    private Integer idStats;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombreAnnonces")
    private int nombreAnnonces;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombreCapots")
    private int nombreCapots;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombrePrisesAtout")
    private int nombrePrisesAtout;
    @JoinColumn(name = "idJoueur", referencedColumnName = "idJoueur")
    @ManyToOne(optional = false)
    private JoueurDO idJoueur;
    @JoinColumn(name = "idPartie", referencedColumnName = "idPartie")
    @ManyToOne(optional = false)
    private PartieDO idPartie;

    public StatistiquesDO() {
    }

    public StatistiquesDO(Integer idStats) {
        this.idStats = idStats;
    }

    public StatistiquesDO(Integer idStats, int nombreAnnonces, int nombreCapots, int nombrePrisesAtout) {
        this.idStats = idStats;
        this.nombreAnnonces = nombreAnnonces;
        this.nombreCapots = nombreCapots;
        this.nombrePrisesAtout = nombrePrisesAtout;
    }

    public Integer getIdStats() {
        return idStats;
    }

    public void setIdStats(Integer idStats) {
        this.idStats = idStats;
    }

    public int getNombreAnnonces() {
        return nombreAnnonces;
    }

    public void setNombreAnnonces(int nombreAnnonces) {
        this.nombreAnnonces = nombreAnnonces;
    }

    public int getNombreCapots() {
        return nombreCapots;
    }

    public void setNombreCapots(int nombreCapots) {
        this.nombreCapots = nombreCapots;
    }

    public int getNombrePrisesAtout() {
        return nombrePrisesAtout;
    }

    public void setNombrePrisesAtout(int nombrePrisesAtout) {
        this.nombrePrisesAtout = nombrePrisesAtout;
    }

    public JoueurDO getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(JoueurDO idJoueur) {
        this.idJoueur = idJoueur;
    }

    public PartieDO getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(PartieDO idPartie) {
        this.idPartie = idPartie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStats != null ? idStats.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof StatistiquesDO)) {
            return false;
        }
        StatistiquesDO other = (StatistiquesDO) object;
        if ((this.idStats == null && other.idStats != null) || (this.idStats != null && !this.idStats.equals(other.idStats))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Statistiques[ idStats=" + idStats + " ]";
    }
    
}
