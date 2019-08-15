package com.ticketing.customer.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ticketing.customer.rest.services.Customer;
import com.ticketing.customer.rest.services.CustomerService;

@RestController
public class CustomerRest {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/doSearchCustomer/{custId}")
	public Customer doSearchCustomer(@PathVariable(value = "custId") String custId) {
		return customerService.getCustomerById(custId);
	}
}
