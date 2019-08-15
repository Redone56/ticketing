package com.ticketing.order.services;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "torder")
public class Order {
	@Id
	private String id;
	@Column(name="ticket_id")
	private String ticketId;
	@Column(name="customer_id")
	private String customerId;
	private int buy;
	
	public Order() {
		
	}
	
	public Order(String ticketId, String customerId, int buy) {
		super();
		this.id = "O".concat(String.valueOf(System.currentTimeMillis()));
		this.ticketId = ticketId;
		this.customerId = customerId;
		this.buy = buy;
	}

	public String getId() {
		return id;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getBuy() {
		return buy;
	}

	public void setBuy(int buy) {
		this.buy = buy;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", ticketId=" + ticketId + ", customerId=" + customerId + ", buy=" + buy + "]";
	}
	

}
