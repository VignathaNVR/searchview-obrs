package com.obrs.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.obrs.dto.BusServiceDTO;

@FeignClient(url="http://localhost:8082",value="BUS-SERVICE")
public interface BusServiceClient {
	
	
	@GetMapping("/api/buses/all")
	List<BusServiceDTO> viewAllBuses();
	
	
//	 @GetMapping("/api/buses/all")
//	    ResponseEntity<List<BusServiceDTO>> viewAllBuses();
//	@GetMapping("/api/buses/explore-buses/{startLocation}/{endLocation}")
//	List<BusDTO> exploreBuses(@PathVariable String startLocation, @PathVariable String endLocation);
//	
	
	 @GetMapping("/api/buses/explore-buses/{startLocation}/{endLocation}")
	 List<BusServiceDTO> exploreBuses(@PathVariable("startLocation") String startLocation,@PathVariable("endLocation") String endLocation);
	
	

}