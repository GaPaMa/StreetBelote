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

	@PersistenceContext(unitName="pu2")
	private EntityManager entityManager;
	
	@Override
	public boolean addJoueur(final JoueurDO joueurDO) {
		return true;
	}

	@Override
	public JoueurDO getJoueur(final String pseudo, final String password) {		
		Query q = entityManager.createNativeQuery("select count(*) from joueur");
		System.err.println(q.getSingleResult());
		JoueurDO j = new JoueurDO();
		j.setEmail("dsfsdf");
		return j;
	}

}
