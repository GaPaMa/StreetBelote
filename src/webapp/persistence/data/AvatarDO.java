/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.persistence.data;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "avatar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Avatar.findAll", query = "SELECT a FROM AvatarDO a"),
    @NamedQuery(name = "Avatar.findByIdAvatar", query = "SELECT a FROM AvatarDO a WHERE a.idAvatar = :idAvatar"),
    @NamedQuery(name = "Avatar.findByUrl", query = "SELECT a FROM AvatarDO a WHERE a.url = :url")})
public class AvatarDO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idAvatar")
	private Integer idAvatar;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "url")
	private String url;
	@OneToMany(mappedBy = "idAvatar")
	private Collection<JoueurDO> joueurCollection;

	public AvatarDO() {
	}

	public AvatarDO(Integer idAvatar) {
		this.idAvatar = idAvatar;
	}

	public AvatarDO(Integer idAvatar, String url) {
		this.idAvatar = idAvatar;
		this.url = url;
	}

	public Integer getIdAvatar() {
		return idAvatar;
	}

	public void setIdAvatar(Integer idAvatar) {
		this.idAvatar = idAvatar;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@XmlTransient
	public Collection<JoueurDO> getJoueurCollection() {
		return joueurCollection;
	}

	public void setJoueurCollection(Collection<JoueurDO> joueurCollection) {
		this.joueurCollection = joueurCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idAvatar != null ? idAvatar.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof AvatarDO)) {
			return false;
		}
		AvatarDO other = (AvatarDO) object;
		if ((this.idAvatar == null && other.idAvatar != null)
				|| (this.idAvatar != null && !this.idAvatar
						.equals(other.idAvatar))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "test.Avatar[ idAvatar=" + idAvatar + " ]";
	}

}
