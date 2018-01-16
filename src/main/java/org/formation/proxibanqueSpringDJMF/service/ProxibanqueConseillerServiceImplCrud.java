package org.formation.proxibanqueSpringDJMF.service;

import java.util.List;

import org.formation.proxibanqueSpringDJMF.dao.CrudClientDAO;
import org.formation.proxibanqueSpringDJMF.entity.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
/**@author DJMF
 * The Class ProxibanqueConseillerServiceImplCrud.
 * cette classe service propose toutes les fonctionnalites du CRUD au conseiller
 */
@Service("serviceconseiller")
public class ProxibanqueConseillerServiceImplCrud implements IProxibanqueService<Client, Integer> {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER =  LoggerFactory.getLogger(ProxibanqueConseillerServiceImplCrud.class);

	/** The crud client DAO. */
	@Autowired
	private CrudClientDAO crudClientDAO;
	
	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanaueConseillerService#addClient(org.formation.proxibanqueSpringDJMF.entity.Client)
	 */
	/*
	@PostConstruct
	public void createSomeGerant(){
		addClient(new Client("BritneyJPA","Spears","log2JPA","mdp2",new Adresse(36, "avenue du JPAmaine", "Paris")));
		

	}
*/
	@Override
	public void add(Client c) {
		crudClientDAO.save(c);

	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanaueConseillerService#listClients()
	 */
	@Override
	public List<Client> list() {
		LOGGER.debug("lister clients");
		LOGGER.info("information");

		return crudClientDAO.findAll();
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanaueConseillerService#deleteClient(int)
	 */
	@Override
	public void delete(int idClient) {
		crudClientDAO.delete(idClient);

	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanaueConseillerService#editClient(int)
	 */
	@Override
	public Client edit(int idClient) {
		return crudClientDAO.findOne(idClient);
	}

	/* (non-Javadoc)
	 * @see org.formation.proxibanqueSpringDJMF.service.IProxibanaueConseillerService#updateClient(org.formation.proxibanqueSpringDJMF.entity.Client)
	 */
	@Override
	public void update(Client c) {
		crudClientDAO.save(c);

	}

	

}
