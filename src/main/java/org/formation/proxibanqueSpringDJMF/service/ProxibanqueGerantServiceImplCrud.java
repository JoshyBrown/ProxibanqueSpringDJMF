package org.formation.proxibanqueSpringDJMF.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.formation.proxibanqueSpringDJMF.dao.CrudConseillerDAO;
import org.formation.proxibanqueSpringDJMF.entity.Conseiller;
import org.formation.proxibanqueSpringDJMF.entity.Gerant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
/**@author DJMF
 * The Class ProxibanqueGerantServiceImplCrud.
 * cette classe service propose toutes les fonctionnalites du CRUD au gerant
 */
@Service("servicegerant")
public class ProxibanqueGerantServiceImplCrud implements IProxibanqueService<Conseiller, Integer> {

	/** The Constant LOGGER. */
	private static final Logger LOGGER =  LoggerFactory.getLogger(ProxibanqueConseillerServiceImplCrud.class);

	/** The crud client DAO. */
	@Autowired
	private CrudConseillerDAO conseillerDAO;
	
	
	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanqueService#add(java.lang.Object)
	 */
	@Override
	public void add(Conseiller conseiller) {
		conseillerDAO.save(conseiller);
		
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanqueService#list()
	 */
	@Override
	public List<Conseiller> list() {
		LOGGER.debug("lister conseillers");
		LOGGER.info("information");
		return conseillerDAO.findAll();
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanqueService#delete(int)
	 */
	@Override
	public void delete(int idConseiller) {
		conseillerDAO.delete(idConseiller);
		
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanqueService#edit(int)
	 */
	@Override
	public Conseiller edit(int idConseiller) {
		// TODO Auto-generated method stub
		return conseillerDAO.findOne(idConseiller);
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanqueService#update(java.lang.Object)
	 */
	@Override
	public void update(Conseiller conseiller) {
		conseillerDAO.save(conseiller);
		
	}
	
	@PostConstruct
	public void createSomeConseiller(){
	 Conseiller conseiller = new Conseiller();
	 conseiller.setNom("Fang");
	 conseiller.setPrenom("Ming");
	 conseiller.setLogin("testcons");
	 conseiller.setPassword("testcons");
	 conseillerDAO.save(conseiller);

	}
	
}
