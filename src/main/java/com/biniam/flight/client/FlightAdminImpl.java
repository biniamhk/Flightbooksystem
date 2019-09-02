package com.biniam.flight.client;

import com.biniam.flight.Domain.Flight;
import com.biniam.flight.service.FlightService;

import java.util.Collection;

public class FlightAdminImpl implements FlightAdmin {
    FlightService flightService;

    public FlightAdminImpl(FlightService flightService) {
        this.flightService = flightService;
    }

    public void createFlight(Flight flight){
        flightService.createFlight(flight);

    }
    public Collection<Flight> readFlights(Flight flight){
       return flightService.getAllFlight();
    }
    public void cancelAllFlights(String origin){
        flightService.cancelFlight(origin);

    }
}
