package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.Passenger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao {
    private Map<String,Passenger> passengers = new HashMap<>();


    @Override
    public List<Flight> searchFlightByOriginAndDestination() {
        return null;
    }

    @Override
    public void bookFlight(Passenger passenger, Flight flight) {

    }

    @Override
    public void cancelBook(Flight flight) {

    }
}

