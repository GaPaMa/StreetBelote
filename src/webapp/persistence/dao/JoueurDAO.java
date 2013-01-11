package webapp.persistence.dao;

import org.springframework.stereotype.Service;

import webapp.persistence.data.JoueurDO;

@Service("daoJoueurs")
public class JoueurDAO implements IJoueurDAO {

	@Override
	public boolean addJoueur(JoueurDO joueurDO) {
		return true;
	}

}