package com.obrs.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//@Builder

public class BookingDTO {
	
	 
	 private int bookingId;
	 
	 private String selectTime;
	 
	 private String selectDate;
	 
	 private String busType;
	 
	 private Long busId;
	 
	
	 
	 @Transient
	 private List<BusDTO> bus = new ArrayList<>()  ;
 
	 @Transient
	 private List<Customer> customer = new ArrayList<>() ;
 

	 
	 
}
