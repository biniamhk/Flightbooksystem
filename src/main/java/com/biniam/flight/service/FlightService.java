package com.biniam.flight.service;

import com.biniam.flight.Domain.Flight;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface FlightService {
    void createFlight(Flight flight);
    String getFlightByNumber(String flightNumber);
    Collection<Flight> getAllFlight();
    Collection<Flight> getFlightByDate(String date);
    Collection<Flight> getFlightByOrigin(String origin);
    Collection<Flight> getFlightByDestination(String destination);
    void cancelFlight(String flightNo);
}
