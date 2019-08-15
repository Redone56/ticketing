package com.ticketing.order.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ticketing.order.services.Order;
import com.ticketing.order.services.OrderService;

@RestController
public class OrderRest {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	OrderService orderService;
	
	@PostMapping(path = "/placeOrder")
	public void placeOrder(@Valid @RequestBody Order order) {
		orderService.placeOrder(order);
		String url = "http://localhost:9090/ticket/";
		restTemplate.postForEntity(url, order, void.class);
	}
}
