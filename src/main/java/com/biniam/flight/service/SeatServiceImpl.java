package com.biniam.flight.service;

import com.biniam.flight.Dao.SeatDao;
import com.biniam.flight.Domain.Seat;

import java.util.Collection;
import java.util.stream.Collectors;

public class SeatServiceImpl implements SeatService {
    SeatDao seatDao;

    private SeatServiceImpl(SeatDao seatDao) {
        this.seatDao = seatDao;
    }

    @Override
    public Collection<Seat> readEconomySeats(String seatNo) {
        return null;
    }

    @Override
    public Collection<Seat> readBusinessSeats(String seatNo) {
        return null;
    }
}
