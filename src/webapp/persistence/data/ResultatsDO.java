/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.persistence.data;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "resultats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultats.findAll", query = "SELECT r FROM ResultatsDO r"),
    @NamedQuery(name = "Resultats.findByIdResultat", query = "SELECT r FROM ResultatsDO r WHERE r.idResultat = :idResultat"),
    @NamedQuery(name = "Resultats.findByScore", query = "SELECT r FROM ResultatsDO r WHERE r.score = :score")})
public class ResultatsDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idResultat")
    private Integer idResultat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "score")
    private int score;
    @JoinColumn(name = "idPartie", referencedColumnName = "idPartie")
    @ManyToOne(optional = false)
    private PartieDO idPartie;
    @JoinColumn(name = "idEquipe", referencedColumnName = "idEquipe")
    @ManyToOne(optional = false)
    private EquipeDO idEquipe;

    public ResultatsDO() {
    }

    public ResultatsDO(Integer idResultat) {
        this.idResultat = idResultat;
    }

    public ResultatsDO(Integer idResultat, int score) {
        this.idResultat = idResultat;
        this.score = score;
    }

    public Integer getIdResultat() {
        return idResultat;
    }

    public void setIdResultat(Integer idResultat) {
        this.idResultat = idResultat;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public PartieDO getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(PartieDO idPartie) {
        this.idPartie = idPartie;
    }

    public EquipeDO getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(EquipeDO idEquipe) {
        this.idEquipe = idEquipe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResultat != null ? idResultat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ResultatsDO)) {
            return false;
        }
        ResultatsDO other = (ResultatsDO) object;
        if ((this.idResultat == null && other.idResultat != null) || (this.idResultat != null && !this.idResultat.equals(other.idResultat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Resultats[ idResultat=" + idResultat + " ]";
    }
    
}
