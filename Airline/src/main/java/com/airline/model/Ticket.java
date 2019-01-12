package com.airline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Ticket{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable=false,nullable=false)
	private int ticketId;
	
	@OneToOne
	@JoinColumn (name="emailId",nullable=false)
	private User user;
	
	@OneToOne
	@JoinColumn (name="flightId",nullable=false)
	private Flight flight;
		
	@Column(nullable=false)
	private String status;
	
	@Column(nullable=false)
	private int passengerCount;

	@Column
	private float payment;
	
	


	public int getTicketId() {
		return ticketId;
	}


	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getPassengerCount() {
		return passengerCount;
	}


	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}


	public float getPayment() {
		return payment;
	}


	public void setPayment(float payment) {
		this.payment = payment;
	}


	public Ticket() {
		super();
	}


	public Ticket(int ticketId, User user, Flight flight, String status, int passengerCount, float payment) {
		super();
		this.ticketId = ticketId;
		this.user = user;
		this.flight = flight;
		this.status = status;
		this.passengerCount = passengerCount;
		this.payment = payment;
	}
	
		
}
