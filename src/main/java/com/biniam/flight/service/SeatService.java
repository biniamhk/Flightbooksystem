package com.biniam.flight.service;

import com.biniam.flight.Domain.Seat;

import java.util.Collection;

public interface SeatService {
    Collection<Seat> readEconomySeats(String seatNo);
    Collection<Seat> readBusinessSeats(String seatNo);
}
