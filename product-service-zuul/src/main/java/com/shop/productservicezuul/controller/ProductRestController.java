/**
 * 
 */
package com.shop.productservicezuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shop.productservicezuul.model.Product;
import com.shop.productservicezuul.service.ProductService;

/**
 * @author Arnaud
 *
 */

@RestController
//@RequestMapping("producer")
public class ProductRestController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{productId}")
	public Product getProductByProductId(@PathVariable("productId") String productId) {
		return productService.getProductByProductId(productId);
	}
}
