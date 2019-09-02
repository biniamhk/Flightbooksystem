package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Seat;

import java.util.Collection;
import java.util.List;

public interface SeatDao {
    void createseats(Seat seat);
    Collection<String> readBusinessClassSeat(String seatNo);
    Collection<String> readEconomyClassSeat(String seatNo);


}
