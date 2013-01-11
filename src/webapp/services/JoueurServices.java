package webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import webapp.beans.Joueur;
import webapp.persistence.dao.IJoueurDAO;
import webapp.persistence.data.JoueurDO;

@Service("servicesJoueurs")
@Transactional(propagation = Propagation.REQUIRED)
public class JoueurServices extends AbstractJoueurConverter implements IJoueurServices {

	@Autowired
	private IJoueurDAO joueurDao;
	
	@Override
	public boolean addJoueur(final Joueur joueur) {
		return joueurDao.addJoueur(convertJoueurToJoueurDO(joueur));
	}

	@Override
	public Joueur getJoueur(final String pseudo, final String password) {
		final JoueurDO joueurDO = joueurDao.getJoueur(pseudo, password);
		final Joueur joueur = convertJoueurDOToJoueur(joueurDO);
		return joueur;
	}


}
