package com.obrs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;


@Entity
@Builder
@Table
public class Booking {
	
	 @Id
	 private int bookingId;
	 
	 private String selectTime;
	 
	 private String selectDate;
	 
	 private String busType;
	 
	 private Long busId;
	 
	 
	 // private String bookingPersonName;
	 
//	 @Transient
//	 private List<Bus> bus = new ArrayList<>();
// 
//	 @Transient
//	 private List<Customer> customer = new ArrayList<>() ;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getSelectTime() {
		return selectTime;
	}

	public void setSelectTime(String selectTime) {
		this.selectTime = selectTime;
	}

	public String getSelectDate() {
		return selectDate;
	}

	public void setSelectDate(String selectDate) {
		this.selectDate = selectDate;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public Long getBusId() {
		return busId;
	}

	public void setBusId(Long busId) {
		this.busId = busId;
	}

	
	
	public Booking() {
		super();
	}


	public Booking(int bookingId, String selectTime, String selectDate, String busType, Long busId) {
		super();
		this.bookingId = bookingId;
		this.selectTime = selectTime;
		this.selectDate = selectDate;
		this.busType = busType;
		this.busId = busId;
		
	}
	 

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", selectTime=" + selectTime + ", selectDate=" + selectDate
				+ ", busType=" + busType + ", busId=" + busId +  "]";
	}

	
	 
	 
	 
 

	 
	 
}
