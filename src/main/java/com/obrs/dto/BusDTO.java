package com.obrs.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusDTO {
	private String busId;
	private String startLocation;
	private String endLocation;
    private int capacity;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;
	
}