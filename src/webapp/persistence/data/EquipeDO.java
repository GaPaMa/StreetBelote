/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Wilfrid
 */
@Entity
@Table(name = "equipe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM EquipeDO e"),
    @NamedQuery(name = "Equipe.findByIdEquipe", query = "SELECT e FROM EquipeDO e WHERE e.idEquipe = :idEquipe")})
public class EquipeDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEquipe")
    private Integer idEquipe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipe1")
    private Collection<PartieDO> partieCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipe2")
    private Collection<PartieDO> partieCollection1;
    @JoinColumn(name = "idJoueur1", referencedColumnName = "idJoueur")
    @ManyToOne(optional = false)
    private JoueurDO idJoueur1;
    @JoinColumn(name = "idJoueur2", referencedColumnName = "idJoueur")
    @ManyToOne(optional = false)
    private JoueurDO idJoueur2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipe")
    private Collection<ResultatsDO> resultatsCollection;

    public EquipeDO() {
    }

    public EquipeDO(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    @XmlTransient
    public Collection<PartieDO> getPartieCollection() {
        return partieCollection;
    }

    public void setPartieCollection(Collection<PartieDO> partieCollection) {
        this.partieCollection = partieCollection;
    }

    @XmlTransient
    public Collection<PartieDO> getPartieCollection1() {
        return partieCollection1;
    }

    public void setPartieCollection1(Collection<PartieDO> partieCollection1) {
        this.partieCollection1 = partieCollection1;
    }

    public JoueurDO getIdJoueur1() {
        return idJoueur1;
    }

    public void setIdJoueur1(JoueurDO idJoueur1) {
        this.idJoueur1 = idJoueur1;
    }

    public JoueurDO getIdJoueur2() {
        return idJoueur2;
    }

    public void setIdJoueur2(JoueurDO idJoueur2) {
        this.idJoueur2 = idJoueur2;
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
        hash += (idEquipe != null ? idEquipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipeDO)) {
            return false;
        }
        EquipeDO other = (EquipeDO) object;
        if ((this.idEquipe == null && other.idEquipe != null) || (this.idEquipe != null && !this.idEquipe.equals(other.idEquipe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Equipe[ idEquipe=" + idEquipe + " ]";
    }
    
}
