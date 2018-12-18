/**
 * 
 */
package com.shop.productservicezuul.service;

import com.shop.productservicezuul.model.Product;

/**
 * @author Arnaud
 *
 */

public interface ProductService {

	Product getProductByProductId(String productId);
}
