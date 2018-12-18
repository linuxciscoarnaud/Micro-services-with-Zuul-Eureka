/**
 * 
 */
package com.shop.customerservicezuul.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.shop.customerservicezuul.model.Customer;
import com.shop.customerservicezuul.repository.CustomerServiceRepository;

/**
 * @author Arnaud
 *
 */

@Repository
public class CustomerServiceRepositoryImpl implements CustomerServiceRepository {

	@PersistenceContext
	public EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see com.shop.customerservicezuul.repository.CustomerServiceRepository#getCustomerByCustomerId(java.lang.String)
	 */
	@Override
	public Customer getCustomerByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		Customer customer = entityManager.find(Customer.class, customerId);
		return customer ;
	}
}
