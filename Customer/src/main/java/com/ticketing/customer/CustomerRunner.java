package com.ticketing.customer;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ticketing.customer.repositories.CustomerRepository;
import com.ticketing.customer.rest.services.Customer;

@Component
public class CustomerRunner implements CommandLineRunner{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		customerRepository.save(new Customer("Alicia", "085710020521", "alicia@gmail.com"));
		customerRepository.save(new Customer("Ridwan", "085710020520", "ridwan@gmail.com"));
		customerRepository.save(new Customer("Dwi", "085710020522", "dwi@gmail.com"));
	}

}
