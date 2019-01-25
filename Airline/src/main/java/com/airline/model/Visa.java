package com.airline.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * @author yasha
 *
 */
@Entity
@Table
public class Visa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String visaId;

	@Column
	private String country;	

	@Column
	private Date issueDate;

	@Column
	private Date expiryDate;

	

	/**
	 * @return visaId
	 */
	public String getVisaId() {
		return visaId;
	}



	/**
	 * @param visaId
	 */
	public void setVisaId(String visaId) {
		this.visaId = visaId;
	}



	/**
	 * @return country
	 */
	public String getCountry() {
		return country;
	}



	/**
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * @return issueDate
	 */
	public Date getIssueDate() {
		return issueDate;
	}



	/**
	 * @param issueDate
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}



	/**
	 * @return expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}



	/**
	 * @param expiryDate
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}



	/**
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

	/**
	 * @param visaId
	 * @param country
	 * @param issueDate
	 * @param expiryDate
	 */
	public Visa(String visaId, String country, Date issueDate, Date expiryDate) {
		super();
		this.visaId = visaId;
		this.country = country;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}



	/**
	 * 
	 */
	public Visa() {
		super();
	}

	

}