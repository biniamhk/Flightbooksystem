package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Flight;

import java.util.Collection;
import java.util.Optional;

public interface FlightDao {
    void createFlight(Flight flight);

    Optional<Flight> read(String flightNo);

    Collection<Flight> readAllFlightsByDate(String date);

    Collection<Flight> readAllFlights();

}
