package com.obrs.entity;
import java.util.*;


public class ApiResponse {
	private Booking booking;
	private Bus bus;
	private List<Payment> payment ;
	
	
	public ApiResponse() {
		super();
	}


	public ApiResponse(Booking booking, Bus bus, List<Payment> payment) {
		super();
		this.booking = booking;
		this.bus = bus;
		this.payment = payment;
	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	public Bus getBus() {
		return bus;
	}


	public void setBus(Bus bus) {
		this.bus = bus;
	}


	public List<Payment> getPayment() {
		return payment;
	}


	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}


	
	
	
	
	

	
	
	
}
