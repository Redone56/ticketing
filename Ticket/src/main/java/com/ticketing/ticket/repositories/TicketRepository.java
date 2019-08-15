package com.ticketing.ticket.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticketing.ticket.services.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {

	@Query("from Ticket where film =:film")
    public Ticket findByFilm(String film);

	@Query("from Ticket where id =:ticketId")
    public Ticket findByTicketId(String ticketId);
}
