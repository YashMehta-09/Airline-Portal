package com.airline.model;

import java.io.Serializable;

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
public class Cities implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String cityName;
	@Column(nullable=false)
	private String abbreviations;
	
	
	
	/**
	 * @return cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return abbreviations
	 */
	public String getAbbreviations() {
		return abbreviations;
	}
	/**
	 * @param abbreviations
	 */
	public void setAbbreviations(String abbreviations) {
		this.abbreviations = abbreviations;
	}
	/**
	 * @return abbreviations
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @param cityName
	 * @param abbreviations
	 */
	public Cities(String cityName, String abbreviations) {
		super();
		this.cityName = cityName;
		this.abbreviations = abbreviations;
	}
	/**
	 * 
	 */
	public Cities() {
		super();
	}
	
	
	

}
