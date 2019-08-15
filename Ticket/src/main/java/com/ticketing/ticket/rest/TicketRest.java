package com.ticketing.ticket.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketing.ticket.services.Order;
import com.ticketing.ticket.services.Ticket;
import com.ticketing.ticket.services.TicketService;

@RestController
public class TicketRest {
	@Autowired
	TicketService ticketService;
	
	@GetMapping("/doSearchTicket/{filmName}")
	public Ticket doSearchTicket(@PathVariable(value = "filmName") String filmName) {
		return ticketService.getTicketByFilmName(filmName);
	}
	
	@PostMapping(path = "/buyTicket")
	public void buyTicket(@Valid @RequestBody Order order) {
		ticketService.updateTicketStock(order.getTicketId(), order.getBuy());
	}
}
