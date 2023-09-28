package com.obrs.controller;

import org.springframework.web.bind.annotation.RestController;

import com.obrs.dto.BusServiceDTO;
import com.obrs.entity.ApiResponse;
//import com.obrs.dto.UserDTO;
import com.obrs.serviceImpl.SearchAndViewServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/search-view")
public class SearchAndViewController {

    @Autowired
    private SearchAndViewServiceImpl searchAndViewServiceImpl;


    @GetMapping("/all")
    public ResponseEntity<List<BusServiceDTO>> viewAllBuses() {
        try {
            List<BusServiceDTO> buses = searchAndViewServiceImpl.viewAllBuses();
            return new ResponseEntity<>(buses, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/explore-buses/{startLocation}/{endLocation}")
    public ResponseEntity<List<BusServiceDTO>> exploreBuses(@PathVariable String startLocation,@PathVariable String endLocation) {
        try {
            List<BusServiceDTO> buses = searchAndViewServiceImpl.exploreBuses(startLocation,endLocation);
            return new ResponseEntity<>(buses, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/existingBooking")
    public ResponseEntity<List<ApiResponse>> viewExistingBookingsWithBusDetails() {
        try {
            List<ApiResponse> bookings = searchAndViewServiceImpl.viewExistingBookingsWithBusDetails();
            return new ResponseEntity<>(bookings, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/viewBookingDetails/{bookingId}")
    public ResponseEntity<ApiResponse> viewBookingDetails(@PathVariable int bookingId) {
        try {
            ApiResponse bookingDetails = searchAndViewServiceImpl.viewBookingDetails(bookingId);
            return new ResponseEntity<>(bookingDetails, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
