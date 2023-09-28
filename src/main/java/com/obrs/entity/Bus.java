package com.obrs.entity;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonFormat 
public class Bus {
	private long busId;
	private String startLocation;
	private String endLocation;
	private  int capacity;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;
	
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", startLocation=" + startLocation + ", endLocation=" + endLocation
				+ ", capacity=" + capacity + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}
	
		
}
