/**
 * 
 */
package com.shop.productservicezuul.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shop.productservicezuul.model.Product;
import com.shop.productservicezuul.repository.ProductRepository;

/**
 * @author Arnaud
 *
 */

@Transactional
@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext	
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see com.shop.productservicezuul.repository.ProductRepository#getProductByProductId(java.lang.String)
	 */
	@Override
	public Product getProductByProductId(String productId) {
		// TODO Auto-generated method stub
		Product product = entityManager.find(Product.class, productId);
		return product;
	}
}
