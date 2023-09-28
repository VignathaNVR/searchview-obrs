
package com.obrs;
import static org.mockito.Mockito.*;

import com.obrs.controller.SearchAndViewController;
import com.obrs.dto.BusServiceDTO;

import com.obrs.service.BookingServiceClient;
import com.obrs.service.BusServiceClient;
import com.obrs.serviceImpl.SearchAndViewServiceImpl;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.time.LocalDateTime;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SearchAndViewServiceImplTest {

    @Mock
    private BusServiceClient busServiceClient;
    
    @Mock
    private SearchAndViewController searchAndViewController;

    @Mock
    private BookingServiceClient bookingServiceClient;

    @InjectMocks
    private SearchAndViewServiceImpl searchAndViewServiceImpl;

    @Test
    void testViewAllBuses() {
        // Arrange
        List<BusServiceDTO> expectedBuses = Arrays.asList(
                new BusServiceDTO(1L, "Start1", "End1", 50, LocalDateTime.of(2023, 9, 4, 10, 0), LocalDateTime.of(2023, 9, 4, 14, 0)),
                new BusServiceDTO(2L, "Start2", "End2", 40, LocalDateTime.of(2023, 9, 5, 9, 0), LocalDateTime.of(2023, 9, 5, 13, 0))
        );
        when(busServiceClient.viewAllBuses()).thenReturn(expectedBuses);

        // Act
        List<BusServiceDTO> actualBuses = searchAndViewServiceImpl.viewAllBuses();

        // Assert
        assertEquals(expectedBuses, actualBuses);
    }
    
    @Test
    void testExploreBuses() {
        // Arrange
        String startLocation = "Start1";
        String endLocation = "End2";
        List<BusServiceDTO> expectedBuses = Arrays.asList(
                new BusServiceDTO(1L, startLocation, endLocation, 60, LocalDateTime.of(2023, 9, 4, 12, 0), LocalDateTime.of(2023, 9, 4, 16, 0))
        );
        when(busServiceClient.exploreBuses(startLocation, endLocation)).thenReturn(expectedBuses);

        // Act
        List<BusServiceDTO> actualBuses = searchAndViewServiceImpl.exploreBuses(startLocation, endLocation);

        // Assert
        assertEquals(expectedBuses, actualBuses);
    }
    


}
