package com.biniam.flight.Domain;

import java.util.*;

public class Seat {

    private Collection<String> businessClassSeat;
    private Collection<String> economyClassSeats;
private Seat(){

}
    private Seat(Builder builder) {
        this.businessClassSeat=builder.businessClassSeat;
        this.economyClassSeats=builder.economyClassSeats;

    }

    public Collection<String> getBusinessClassSeat() {
        return businessClassSeat;
    }

    public Collection<String> getEconomyClassSeats() {
        return economyClassSeats;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "businessClassSeat=" + businessClassSeat +
                ", economyClassSeats=" + economyClassSeats +
                '}';
    }

    public static Builder builde() {
        return new Builder();
    }

    public static class Builder {
        private Collection<String> businessClassSeat;
        private Collection<String> economyClassSeats;
        public Builder withBusinessClassseat(Collection<String> businessClassSeat){
            this.businessClassSeat=businessClassSeat;
            return this;
        }

        public Builder withEconomyClassseat(Collection<String> economyClassSeats){
            this.economyClassSeats=economyClassSeats;
            return this;
        }
        public Seat build(){
            return new Seat(this);
        }
    }


  /*  public String businessClassSeat(int availableBusinessClassSeat) {
        if (this.availableBusinessClassSeat >= availableBusinessClassSeat && availableBusinessClassSeat > 0) {
            this.availableBusinessClassSeat -= availableBusinessClassSeat;
        return "thanks for choosing our airline";
        }
            return "full try in economy class";
    }


    public String economyClassSeat(int availableEconomyClassSeats) {
        if (this.availableEconomyClassSeats >= availableEconomyClassSeats && availableEconomyClassSeats > 0){
            this.availableEconomyClassSeats -= availableEconomyClassSeats;
            return "thanks for choosing our airline";

        }
        return "full try in business class";
    }*/





   /* public static void bookSeat(Passenger passenger, int numberOfSeats) {
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

    /*Map<String, List<String>> seats=new HashMap<>(10);
    List<String> businessSeats= Arrays.asList("B1","B2","B3","B4","B5");
    List<String> economyClassSeats= Arrays.asList("E6","E7","E8","E9","E10");

    public List economySeats(){
       return   economyClassSeats;
    }

    public List businessClassSeats(){
      return businessSeats;

    }
    public void addAllSeats(){
        seats.put("e",economySeats());
        seats.put("b",businessSeats);
    }
    public String ifEconomySeatEmpty(){
        return "seat is full try in business class";
    }
    public String ifBusinessSeatEmpty(){
        return "seat is full try in economy class";
    }
    public static Seat readSeats(){
        return new Seat();
    }
*/


}
