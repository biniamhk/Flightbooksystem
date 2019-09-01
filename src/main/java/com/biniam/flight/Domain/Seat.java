package com.biniam.flight.Domain;

import java.util.*;

public class Seat {

    Map<String, List<String>> seats=new HashMap<>(10);
    List<String> businessSeats= Arrays.asList("B1","B2","B3","B4","B5");
    List<String> economyClassSeats= Arrays.asList("E6","E7","E8","E9","E10");

    public List economySeats(){
       return businessSeats;
    }

    public List businessClassSeats(){
      return economyClassSeats;

    }
    public void addAllSeats(){
        seats.put("e",economySeats());
        seats.put("b",businessSeats);
    }
    public static Seat readSeats(){
        return new Seat();
    }




    /*private static int availableBusinessClassSeat = 5;
    private static int availableEconomyClassSeats = 5;

    public static void bookSeat(Passenger passenger, int numberOfSeats) {
        if (availableBusinessClassSeat >= numberOfSeats && numberOfSeats > 0) {
            System.out.println("Hi " + passenger.getPassengerName() + ":" + numberOfSeats + "seats booked successfully");
            availableBusinessClassSeat -= numberOfSeats;
        } else {
            System.out.println("Sorry there is no available place in business class but you can check in economy class");

        }
        if (availableEconomyClassSeats >= numberOfSeats && numberOfSeats > 0) {
            System.out.println("Hi " + passenger.getPassengerName() + ":" + numberOfSeats + "seats booked successfully");
            availableEconomyClassSeats -= numberOfSeats;
        } else {
            System.out.println("Sorry there is no available place in economy class but you can check in business class");

        }
    }*/
}
