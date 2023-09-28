package com.obrs.service;

import java.util.List;


import com.obrs.dto.BusServiceDTO;

import com.obrs.entity.ApiResponse;


public interface SearchAndViewService {
	//List<UserDTO> viewCustomers();
    List<BusServiceDTO> viewAllBuses();
    List<BusServiceDTO> exploreBuses(String startLocation,String endLocation);
    public List<ApiResponse> viewExistingBookingsWithBusDetails();
	public ApiResponse viewBookingDetails(int bookingId);
}
