package com.ticketing.customer.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketing.customer.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerReository;

	public Customer getCustomerById(String custId) {
		return customerReository.findByCustId(custId);
	}
}
