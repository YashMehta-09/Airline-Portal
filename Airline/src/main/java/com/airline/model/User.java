package com.airline.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author yasha
 *
 */
@Entity
@Table
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String emailId;
	@Column(nullable = false)
	private String contact;
	@Column(nullable = false)
	private String password;
	
	/**
	 * @return emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @param emailId
	 * @param contact
	 * @param password
	 */
	public User(String emailId, String contact, String password) {
		super();
		this.emailId = emailId;
		this.contact = contact;
		this.password = password;
	}
	
	/**
	 * 
	 */
	public User() {
		super();
	}
	
}
