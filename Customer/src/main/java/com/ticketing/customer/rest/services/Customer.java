package com.ticketing.customer.rest.services;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String id;
	private String name;
	@Column(name = "phone_no")
	private String phoneNumber;
	private String email;
	
	public Customer() {
		
	}
	
	public Customer(String name, String phoneNumber, String email) {
		super();
		this.id = "C".concat(String.valueOf(System.currentTimeMillis()));
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
}
