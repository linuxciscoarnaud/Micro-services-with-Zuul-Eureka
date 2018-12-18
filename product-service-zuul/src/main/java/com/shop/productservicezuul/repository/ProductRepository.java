/**
 * 
 */
package com.shop.productservicezuul.repository;

import com.shop.productservicezuul.model.Product;

/**
 * @author Arnaud
 *
 */

public interface ProductRepository {

	Product getProductByProductId(String productId);
}
