package com.ticketing.customer.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ticketing.customer.rest.services.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	@Query("from Customer where id =:custId")
	public Customer findByCustId(String custId);

}
