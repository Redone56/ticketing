package com.ticketing.ticket.services;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketing.ticket.repositories.TicketRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;

	public Ticket getTicketByFilmName(String filmName) {
		Ticket ticket = ticketRepository.findByFilm(filmName);
		if (ticket.getEndTime().after(new Timestamp((new Date()).getTime()))) {
			return new Ticket();
		}
		return ticket;
	}
	
	public Ticket updateTicketStock(String ticketId, int buy) {
		Ticket ticket = ticketRepository.findByTicketId(ticketId);
		ticket.setQty(ticket.getQty()-buy);
		return ticketRepository.save(ticket);
	}

}
