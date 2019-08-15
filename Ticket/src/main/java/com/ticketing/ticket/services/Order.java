package com.ticketing.ticket.services;

import java.util.Date;

public class Order {
	private String id;
	private String ticketId;
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
