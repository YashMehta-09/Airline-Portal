package com.airline.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author yasha
 *
 */
@Entity
@Table
public class Passenger implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passengerId;
	
	@Column(nullable=false)
	private String salutation;
	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false)
	private String passengerType;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="specialServiceId")
	private SpecialService specialService;


	/**
	 * @return passengerId
	 */
	public int getPassengerId() {
		return passengerId;
	}

	/**
	 * @param passengerId
	 */
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	/**
	 * @return salutation
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * @param salutation
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return passengerType
	 */
	public String getPassengerType() {
		return passengerType;
	}

	/**
	 * @param passengerType
	 */
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	/**
	 * @return specialService
	 */
	public SpecialService getSpecialService() {
		return specialService;
	}

	/**
	 * @param specialService
	 */
	public void setSpecialService(SpecialService specialService) {
		this.specialService = specialService;
	}



	/**
	 * @param passengerId
	 * @param salutation
	 * @param firstName
	 * @param lastName
	 * @param passengerType
	 * @param specialService
	 */
	public Passenger(int passengerId, String salutation, String firstName, String lastName, String passengerType,
			SpecialService specialService) {
		super();
		this.passengerId = passengerId;
		this.salutation = salutation;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passengerType = passengerType;
		this.specialService = specialService;

	}

	/**
	 * 
	 */
	public Passenger() {
		super();
	}
	
	
	
}
