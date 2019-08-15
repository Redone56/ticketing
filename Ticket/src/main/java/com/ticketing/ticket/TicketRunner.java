package com.ticketing.ticket;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ticketing.ticket.repositories.TicketRepository;
import com.ticketing.ticket.services.Ticket;

@Component
public class TicketRunner implements CommandLineRunner{
	@Autowired
	private TicketRepository ticketrepository;
	
	@Override
	public void run(String... args) throws Exception {
		ticketrepository.save(new Ticket("Avenger", new Date(), new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), 10));
		ticketrepository.save(new Ticket("Dumbo", new Date(), new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), 10));
		ticketrepository.save(new Ticket("Us", new Date(), new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), 10));
	}

}
