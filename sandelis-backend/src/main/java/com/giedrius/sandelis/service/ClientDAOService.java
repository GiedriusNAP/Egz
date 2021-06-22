package com.giedrius.sandelis.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.giedrius.sandelis.entity.Client;

@Repository
@Transactional
public class ClientDAOService {

	@PersistenceContext
	private EntityManager entityManager;

	public long insert(Client client) {
		// Open Transaction
		entityManager.persist(client);
		// Close Transaction
		return client.getId();
	}
}
