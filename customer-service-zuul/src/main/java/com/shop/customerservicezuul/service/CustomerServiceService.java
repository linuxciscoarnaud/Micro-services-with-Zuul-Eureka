/**
 * 
 */
package com.shop.customerservicezuul.service;

import com.shop.customerservicezuul.model.Customer;

/**
 * @author Arnaud
 *
 */

public interface CustomerServiceService {

	Customer getCustomerByCustomerId(String customerId);
}
