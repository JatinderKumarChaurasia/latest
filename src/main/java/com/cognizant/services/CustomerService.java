package com.cognizant.services;

import javax.transaction.Transactional;

import com.cognizant.model.Customer;

public interface CustomerService {

	/* (non-Javadoc)
	 * @see com.cognizant.services.CustomerService#save(com.cognizant.model.Customer)
	 */
	Customer save(Customer customer);

}