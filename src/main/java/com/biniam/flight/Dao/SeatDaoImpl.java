package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Seat;

import java.util.*;
import java.util.stream.Collectors;

public class SeatDaoImpl implements SeatDao {
    Collection<String> economyseats=new ArrayList();
    Collection<String> businessseats=new ArrayList();
    @Override
    public void createseats(Seat seat) {
        economyseats.addAll(seat.getEconomyClassSeats());
        businessseats.addAll(seat.getBusinessClassSeat());



    }

    @Override
    public Collection<String> readBusinessClassSeat(String seatNo) {
        return businessseats.stream().filter(seats->seats.contains(seatNo)).collect(Collectors.toSet());
    }

    @Override
    public Collection<String> readEconomyClassSeat(String seatNo) {
        return economyseats.stream().filter(seats->seats.contains(seatNo)).collect(Collectors.toSet());
    }
}
