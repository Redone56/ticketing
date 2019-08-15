package com.ticketing.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketing.order.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public void placeOrder(Order order) {
		orderRepository.save(order);
	}
}
