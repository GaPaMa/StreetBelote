package webapp.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import webapp.persistence.data.JoueurDO;

@Repository("daoJoueurs")
@Transactional(propagation = Propagation.MANDATORY)
public class JoueurDAO implements IJoueurDAO {

	@PersistenceContext(unitName = "pu2")
	private EntityManager entityManager;

	@Override
	public boolean addJoueur(final JoueurDO joueurDO) {
		return true;
	}

	@Override
	public JoueurDO getJoueur(final String pseudo, final String password) {
		final Query query = entityManager
				.createNamedQuery("Joueur.findByPseudoAndPassword");
		query.setParameter("pseudo", pseudo);
		query.setParameter("password", password);
		if (query.getResultList().isEmpty()) {
			return null;
		}

		final JoueurDO joueurDO = (JoueurDO) query.getSingleResult();
		return joueurDO;

	}

}
