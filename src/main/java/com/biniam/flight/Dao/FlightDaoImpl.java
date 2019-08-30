package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Airplane;
import com.biniam.flight.Domain.Flight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightDaoImpl implements FlightDao {

    Map<String, Flight> flights = new HashMap<>();

    @Override
    public void createFlight(Flight flight) {
        if (flights.containsKey(flight.getFlightNo())) {
            throw new RuntimeException("Plane already exist");
        }
        flights.put(flight.getFlightNo(), flight);

    }

    @Override
    public Optional<Flight> read(String flightNo) {
        return Optional.ofNullable(flights.get(flightNo));
    }


    @Override
    public Collection<Flight> readAllFlightsByDate(String date) {
        return flights.values()
                .stream()
                .filter(flightDate -> flightDate.getDate().equalsIgnoreCase(date)).collect(Collectors.toSet());
    }

    public Collection<Flight> readAllFlights(){
        return flights.values();
    }

}
