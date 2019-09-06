package com.biniam.flight.Domain;

import java.util.Objects;

public class Book {
    private Integer bookId;
    private Flight flight;
    private Passenger passenger;
    private BusinessClassFood businessClassFood;
    private EconomyClassFood economyClassFood;
    private Seat seat;
    private Book(){
    }

    private Book(Builder builder) {
        this.bookId= Objects.requireNonNull(builder.bookId,"bookId");
        this.flight=Objects.requireNonNull(builder.flight,"flight");
        this.passenger=Objects.requireNonNull(builder.passenger,"User");
        this.businessClassFood=builder.businessClassFood;
        this.economyClassFood=builder.economyClassFood;
        this.seat=builder.seat;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public BusinessClassFood getBusinessClassFood() {
        return businessClassFood;
    }

    public EconomyClassFood getEconomyClassFood() {
        return economyClassFood;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", flight=" + flight +
                ", passenger=" + passenger +
                ", businessClassFood=" + businessClassFood +
                ", economyClassFood=" + economyClassFood +
                '}'+'\n';
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private Integer bookId;
        private Flight flight;
        private Passenger passenger;
        private BusinessClassFood businessClassFood;
        private EconomyClassFood economyClassFood;
        private Seat seat;

        public Builder withBookId(Integer bookId){
            this.bookId=bookId;
            return this;
        }
        public Builder withFlight(Flight flight){
            this.flight=flight;
            return this;
        }
        public Builder withPassenger(Passenger passenger){
            this.passenger=passenger;
            return this;
        }

        public Builder withBusinessClassFood(BusinessClassFood businessClassFood){
            this.businessClassFood=businessClassFood;
            return this;
        }

        public Builder withEconomyClassFood(EconomyClassFood economyClassFood){
            this.businessClassFood=businessClassFood;
            return this;
        }
        public Builder withSeat(Seat seat){
            this.seat=seat;
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }
}