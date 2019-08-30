package com.biniam.flight.Domain;

public class Seat {
    private static int availableBusinessClassSeat = 5;
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
    }
}
