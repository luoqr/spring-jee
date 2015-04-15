package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Scope("prototype")
public class CustomerDaoImpl implements CustomerDao{

	@PersistenceContext
	public EntityManager em ;
	
	@Override
	@Transactional
	public Customer findByKey(String key) {
		return em.find(Customer.class, "1") ;
	}

}
