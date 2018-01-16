package org.formation.proxibanqueSpringDJMF.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.formation.proxibanqueSpringDJMF.dao.CrudGerantDAO;
import org.formation.proxibanqueSpringDJMF.entity.Gerant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProxibanqueCreationGerantImpl implements IProxibanqueService<Gerant, Integer> {
	
	@Autowired
	CrudGerantDAO gerantDao;;
	
	@Override
	public void add(Gerant gerant) {
		// TODO Auto-generated method stub
		gerantDao.save(gerant);
	}

	@Override
	public List<Gerant> list() {
		// TODO Auto-generated method stub
		return gerantDao.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		gerantDao.delete(id);
	}

	@Override
	public Gerant edit(int id) {
		// TODO Auto-generated method stub
		return gerantDao.findOne(id);
	}

	@Override
	public void update(Gerant gerant) {
		// TODO Auto-generated method stub
		gerantDao.save(gerant);
	}
	/*
	@PostConstruct
	public void createSomeGerant(){
	 Gerant gerant = new Gerant();
	 gerant.setNom("Fang");
	 gerant.setPrenom("Ming");
	 gerant.setLogin("gerant");
	 gerant.setPassword("gerant");
	 gerantDao.save(gerant);

	}
*/
}
