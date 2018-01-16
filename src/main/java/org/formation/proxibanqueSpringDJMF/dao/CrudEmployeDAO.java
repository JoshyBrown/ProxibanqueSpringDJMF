package org.formation.proxibanqueSpringDJMF.dao;


import org.formation.proxibanqueSpringDJMF.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudEmployeDAO extends JpaRepository<Employe, Integer>{

	public Employe findByLoginAndPassword(String login, String password);

}
