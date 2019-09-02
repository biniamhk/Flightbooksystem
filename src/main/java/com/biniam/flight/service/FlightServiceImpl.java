package com.biniam.flight.service;

import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.FlightClass;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService {
    private final FlightDao flightDao;

    public FlightServiceImpl(FlightDao flightDao) {
        this.flightDao = Objects.requireNonNull(flightDao, "flightDao must be not null");
    }

    @Override
    public void createFlight(Flight flight) {
        flightDao.createFlight(flight);
    }

    @Override
    public String getFlightByNumber(String flightNumber) {
        Optional<Flight> flight = flightDao.read(flightNumber);
        if(flight.isPresent()){
            return flight.get().getFlightNo();
        }
        return null;
    }

    @Override
    public Collection<Flight> getAllFlight() {

        return flightDao.readAllFlights();
    }

    @Override
    public Collection<Flight> getFlightByDate(String date) {
        return flightDao.readAllFlightsByDate(date);
    }

    public Collection<Flight> getFlightByOrigin(String origin)
    {
        return flightDao.readAllFlightsByOrigin(origin);
    }

    public Collection<Flight> getFlightByDestination(String destination) {
        return flightDao.readAllFlightsByDestination(destination);
    }

    public void cancelFlight(String flightNo){
        flightDao.cancelFlight(flightNo);

    }
}



