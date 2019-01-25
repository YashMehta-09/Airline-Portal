package com.airline.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * @author yasha
 *
 */
@Entity
@Table
public class Ticket implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ticketId")
	private List<Passenger> passengerList;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="visaId")
	private Visa visa;

	/**
	 * @return visa
	 */
	public Visa getVisa() {
		return visa;
	}

	/**
	 * @param visa
	 */
	public void setVisa(Visa visa) {
		this.visa = visa;
	}

	/**
	 * @return ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}

	/**
	 * @param ticketId
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return flight
	 */
	public Flight getFlight() {
		return flight;
	}

	/**
	 * @param flight
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	/**
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return passengerCount
	 */
	public int getPassengerCount() {
		return passengerCount;
	}

	/**
	 * @param passengerCount
	 */
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	/**
	 * @return payment
	 */
	public float getPayment() {
		return payment;
	}

	/**
	 * @param payment
	 */
	public void setPayment(float payment) {
		this.payment = payment;
	}

	/**
	 * @return List<Passenger>
	 */
	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	/**
	 * @param passengerList
	 */
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}



	/**
	 * @param ticketId
	 * @param user
	 * @param flight
	 * @param status
	 * @param passengerCount
	 * @param payment
	 * @param passengerList
	 * @param visa
	 */
	public Ticket(int ticketId, User user, Flight flight, String status, int passengerCount, float payment,
			List<Passenger> passengerList, Visa visa) {
		super();
		this.ticketId = ticketId;
		this.user = user;
		this.flight = flight;
		this.status = status;
		this.passengerCount = passengerCount;
		this.payment = payment;
		this.passengerList = passengerList;
		this.visa = visa;
	}

	/**
	 * 
	 */
	public Ticket() {
		super();
	}
	
	
	
		
}
