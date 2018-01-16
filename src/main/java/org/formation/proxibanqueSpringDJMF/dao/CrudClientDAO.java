package org.formation.proxibanqueSpringDJMF.dao;

import java.util.List;

import org.formation.proxibanqueSpringDJMF.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The implementation of BlogPostDAO interface is not required It is generated
 * by Spring Data JPA Framework This interface is responsible for CRUD + custom
 * queries based on query methods and parameter name and types
 */

public interface CrudClientDAO extends JpaRepository<Client, Integer> {

	// customized methods here

	List<Client> findAllClientByNom(String nom);


}
