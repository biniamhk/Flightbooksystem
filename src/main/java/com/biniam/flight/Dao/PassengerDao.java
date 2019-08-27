package com.biniam.flight.Dao;


import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.Passenger;

public interface PassengerDao {

    //void insertPassenger(Passenger passenger);
    void bookFlight(Flight flight);
    void cancelBook(Flight flight);
    void pay(Flight flight);
    //List<Flight> listUnBookedFlight(User user)
}
