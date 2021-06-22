package com.giedrius.sandelis.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.giedrius.sandelis.entity.Inventory;

@Repository
@Transactional
public class InventoryDAOService {

	@PersistenceContext
	private EntityManager entityManager;

	public long insert(Inventory box) {
		// Open Transaction
		entityManager.persist(box);
		// Close Transaction
		return box.getId();
	}
}
