package com.biniam.flight.service;

import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.FlightClass;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService {
    private FlightDao flightDao;

    public FlightServiceImpl(FlightDao flightDao) {
        this.flightDao = Objects.requireNonNull(flightDao, "flightDao must be not null");
    }

    @Override
    public void createFlight(Flight flight) {
        flightDao.createFlight(flight);
    }

    @Override
    public Collection<Flight> getAllFlight() {

        return flightDao.readAllFlights();
    }

    @Override
    public Collection<Flight> getFlightByDate(String date) {
        return flightDao.readAllFlightsByDate("20-12-2019");
    }

    public Collection<Flight> getFlightByOrigin(String origin) {
        return flightDao.readAllFlightsByDate("20-12-2019");
    }

    public Collection<Flight> getFlightByDestination(String destination) {
        return flightDao.readAllFlightsByDate("20-12-2019");
    }
}



