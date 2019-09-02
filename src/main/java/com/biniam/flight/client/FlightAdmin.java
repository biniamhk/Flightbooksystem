package com.biniam.flight.client;

import com.biniam.flight.Domain.Flight;

import java.util.Collection;

public interface FlightAdmin {
    void createFlight(Flight flight);
    Collection<Flight> readFlights(Flight flight);
    public void cancelAllFlights(String origin);

    }
