package org.formation.proxibanqueSpringDJMF.dao;

import org.formation.proxibanqueSpringDJMF.entity.Gerant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudGerantDAO extends JpaRepository<Gerant, Integer> {

}
