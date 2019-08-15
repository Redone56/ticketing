package com.ticketing.ticket.services;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	private String id;
	private String film;
	private Date date;
	@Column(name="start_tm")
	private Timestamp startTime;
	@Column(name="end_tm")
	private Timestamp endTime;
	private int qty;
	
	public Ticket() {
		
	}
	
	public Ticket(String film, Date date, Timestamp startTime, Timestamp endTime, int qty) {
		super();
		this.id = "T".concat(String.valueOf(System.currentTimeMillis()));
		this.film = film;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.qty = qty;
	}
	
	public String getId() {
		return id;
	}
	public String getFilm() {
		return film;
	}
	public void setFilm(String film) {
		this.film = film;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", film=" + film + ", date=" + date + ", startTime=" + startTime + ", endTime="
				+ endTime + ", qty=" + qty + "]";
	}	
}
