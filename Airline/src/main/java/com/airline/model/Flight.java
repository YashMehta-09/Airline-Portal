package com.airline.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yasha
 *
 */
@Entity
@Table
public class Flight implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String flightId;
	
	@Column(nullable=false)
	private String airlineName;
	
	@Column(nullable=false)
	private String destination;
	
	@Column(nullable=false)
	private String source;
	
	@Column(nullable=false)
	private Date date;
	
	@Column(nullable=false)
	private Time departureTime;
	
	@Column(nullable=false)
	private Time arrivalTime;
	
	@Column(nullable=false)
	private float duration;
	
	@Column(nullable=false)
	private int businessSeat;
	
	@Column(nullable=false)
	private int economySeat;
	
	@Column(nullable=false)
	private float businessPrice;
	
	@Column(nullable=false)
	private float economyPrice;

	/**
	 * 
	 */
	public Flight() {
		super();
	}

	/**
	 * @param flightId
	 * @param airlineName
	 * @param destination
	 * @param source
	 * @param date
	 * @param departureTime
	 * @param arrivalTime
	 * @param duration
	 * @param businessSeat
	 * @param economySeat
	 * @param businessPrice
	 * @param economyPrice
	 */
	public Flight(String flightId, String airlineName, String destination, String source, Date date, Time departureTime,
			Time arrivalTime, float duration, int businessSeat, int economySeat, float businessPrice,
			float economyPrice) {
		super();
		this.flightId = flightId;
		this.airlineName = airlineName;
		this.destination = destination;
		this.source = source;
		this.date = date;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.businessSeat = businessSeat;
		this.economySeat = economySeat;
		this.businessPrice = businessPrice;
		this.economyPrice = economyPrice;
	}

	/**
	 * @return flightId
	 */
	public String getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId
	 */
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	/**
	 * @return airlineName
	 */
	public String getAirlineName() {
		return airlineName;
	}

	/**
	 * @param airlineName
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	/**
	 * @return destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return departureTime
	 */
	public Date getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime
	 */
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return arrivalTime
	 */
	public Date getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime
	 */
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return duration
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 */
	public void setDuration(float duration) {
		this.duration = duration;
	}

	/**
	 * @return businessSeat
	 */
	public int getBusinessSeat() {
		return businessSeat;
	}

	/**
	 * @param businessSeat
	 */
	public void setBusinessSeat(int businessSeat) {
		this.businessSeat = businessSeat;
	}

	/**
	 * @return economySeat
	 */
	public int getEconomySeat() {
		return economySeat;
	}

	/**
	 * @param economySeat
	 */
	public void setEconomySeat(int economySeat) {
		this.economySeat = economySeat;
	}

	/**
	 * @return businessPrice
	 */
	public float getBusinessPrice() {
		return businessPrice;
	}

	/**
	 * @param businessPrice
	 */
	public void setBusinessPrice(float businessPrice) {
		this.businessPrice = businessPrice;
	}

	/**
	 * @return economyPrice
	 */
	public float getEconomyPrice() {
		return economyPrice;
	}

	/**
	 * @param economyPrice
	 */
	public void setEconomyPrice(float economyPrice) {
		this.economyPrice = economyPrice;
	}

}
