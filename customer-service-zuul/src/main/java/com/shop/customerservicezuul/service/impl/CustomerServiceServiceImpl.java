/**
 * 
 */
package com.shop.customerservicezuul.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.customerservicezuul.model.Customer;
import com.shop.customerservicezuul.repository.CustomerServiceRepository;
import com.shop.customerservicezuul.service.CustomerServiceService;

/**
 * @author Arnaud
 *
 */

@Service
@Transactional
public class CustomerServiceServiceImpl implements CustomerServiceService {

	@Autowired
	private CustomerServiceRepository customerServiceRepository;
	
	/* (non-Javadoc)
	 * @see com.shop.customerservicezuul.service.CustomerServiceService#getCustomerByCustomerId(java.lang.String)
	 */
	@Override
	public Customer getCustomerByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return customerServiceRepository.getCustomerByCustomerId(customerId);
	}
}
