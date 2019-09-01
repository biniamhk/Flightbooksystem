package com.biniam.flight.Dao;


import com.biniam.flight.Domain.Passenger;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface PassengerDao {

    void createPassenger(Passenger passenger);

    Optional<Passenger> read(String passengerId);

    Collection<Passenger> readAllPassengers();
}





