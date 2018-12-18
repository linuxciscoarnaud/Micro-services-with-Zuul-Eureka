/**
 * 
 */
package com.shop.customerservicezuul.repository;

import com.shop.customerservicezuul.model.Customer;

/**
 * @author Arnaud
 *
 */

public interface CustomerServiceRepository {

	Customer getCustomerByCustomerId(String customerId);
}
