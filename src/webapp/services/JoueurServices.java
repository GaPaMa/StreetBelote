package webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.beans.Joueur;
import webapp.persistence.dao.IJoueurDAO;

@Service("servicesJoueurs")
public class JoueurServices extends AbstractJoueurConverter implements IJoueurServices {

	@Autowired
	private IJoueurDAO joueurDao;
	
	@Override
	public boolean addJoueur(Joueur joueur) {
		return joueurDao.addJoueur(convertJoueurToJoueurDO(joueur));
	}

}