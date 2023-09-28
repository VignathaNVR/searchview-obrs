package com.obrs.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.obrs.entity.ApiResponse;



@FeignClient(url = "http://localhost:8084",value= "booking-service")
public interface BookingServiceClient {
	
	
	

	@GetMapping("/booking/viewBookingDetails/{bookingId}")
	public ApiResponse viewBookingDetails(@PathVariable("bookingId") int bookingId);
	@GetMapping("/booking/existingBooking")
	public List<ApiResponse> viewExistingBookingsWithBusDetails();;
}
