package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	private long id;

	private String bookingName;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(String bookingName) {
		super();
		this.bookingName = bookingName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookingName() {
		return bookingName;
	}

	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}

}