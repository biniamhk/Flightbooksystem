package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.Passenger;

import java.util.*;

public class PassengerDaoImpl implements PassengerDao {
    private Map<String, Passenger> passengers = new HashMap<>();


    @Override
    public void createPassenger(Passenger passenger) {
        if(passengers.containsKey(passenger.getPassengerId())){
            throw new RuntimeException("passenger already exist");
        }
        passengers.put(passenger.getPassengerId(),passenger);

    }

    @Override
    public Optional<Passenger> read(String passengerId) {
        return Optional.ofNullable(passengers.get(passengerId));
    }

    @Override
    public Collection<Passenger> readAllPassengers() {
        return passengers.values();
    }
}
