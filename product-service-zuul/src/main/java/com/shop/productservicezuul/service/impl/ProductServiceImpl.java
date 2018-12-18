/**
 * 
 */
package com.shop.productservicezuul.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.productservicezuul.model.Product;
import com.shop.productservicezuul.repository.ProductRepository;
import com.shop.productservicezuul.service.ProductService;

/**
 * @author Arnaud
 *
 */

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	/* (non-Javadoc)
	 * @see com.shop.productservicezuul.service.ProductService#getProductByProductId(java.lang.String)
	 */
	@Override
	public Product getProductByProductId(String productId) {
		// TODO Auto-generated method stub
		return productRepository.getProductByProductId(productId);
	}
}
