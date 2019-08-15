package com.ticketing.order.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticketing.order.services.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{

}
