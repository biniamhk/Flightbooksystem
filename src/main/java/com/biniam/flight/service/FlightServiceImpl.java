package com.biniam.flight.service;

import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.FlightClass;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService {

    private FlightDao flightDao;


    public FlightServiceImpl(){

    }
    @Override
    public Collection<Flight> getFlight() {
      return flightDao.readAllFlights();


    }


}
