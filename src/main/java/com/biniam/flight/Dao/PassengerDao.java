package com.biniam.flight.Dao;


import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.Passenger;

import java.util.List;

public interface PassengerDao {


    List<Flight> searchFlightByOriginAndDestination();
    void bookFlight(Passenger passenger ,Flight flight);
    void cancelBook(Flight flight);
    //List<Flight> listUnBookedFlight(User user)
}
