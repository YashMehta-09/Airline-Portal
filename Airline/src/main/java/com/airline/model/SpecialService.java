package com.airline.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yasha
 *
 */
@Entity
@Table
public class SpecialService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int specialServiceId;
	
	@Column
	private String seatType1;
	
	@Column
	private String seatType2;
	
	@Column
	private String mealType;
	
	@Column
	private String handicapped;

	/**
	 * @return specialServiceId
	 */
	public int getSpecialServiceId() {
		return specialServiceId;
	}

	/**
	 * @param specialServiceId
	 */
	public void setSpecialServiceId(int specialServiceId) {
		this.specialServiceId = specialServiceId;
	}

	/**
	 * @return seatType1
	 */
	public String getSeatType1() {
		return seatType1;
	}

	/**
	 * @param seatType1
	 */
	public void setSeatType1(String seatType1) {
		this.seatType1 = seatType1;
	}

	/**
	 * @return seatType2
	 */
	public String getSeatType2() {
		return seatType2;
	}

	/**
	 * @param seatType2
	 */
	public void setSeatType2(String seatType2) {
		this.seatType2 = seatType2;
	}

	/**
	 * @return mealType
	 */
	public String getMealType() {
		return mealType;
	}

	/**
	 * @param mealType
	 */
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	/**
	 * @return handicapped
	 */
	public String getHandicapped() {
		return handicapped;
	}

	/**
	 * @param handicapped
	 */
	public void setHandicapped(String handicapped) {
		this.handicapped = handicapped;
	}

	/**
	 * @param specialServiceId
	 * @param seatType1
	 * @param seatType2
	 * @param mealType
	 * @param handicapped
	 */
	public SpecialService(int specialServiceId, String seatType1, String seatType2, String mealType,
			String handicapped) {
		super();
		this.specialServiceId = specialServiceId;
		this.seatType1 = seatType1;
		this.seatType2 = seatType2;
		this.mealType = mealType;
		this.handicapped = handicapped;
	}

	/**
	 * 
	 */
	public SpecialService() {
		super();
	}
	
	
}
