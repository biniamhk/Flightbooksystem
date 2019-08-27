package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.Passenger;

import java.util.HashMap;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao {
    private Map<String,Passenger> passengers = new HashMap<>();

   /* @Override
    public void insertPassenger(Passenger passenger) {
        if(passengers.containsKey(passenger.getPassengerId())) {
            throw new RuntimeException("passenger already exist");
        }
        passengers.put(passenger.getPassengerId(),passenger);
        }*/


    @Override
    public void bookFlight(Flight flight) {

    }

    @Override
    public void cancelBook(Flight flight) {

    }

    @Override
    public void pay(Flight flight) {

    }
}

