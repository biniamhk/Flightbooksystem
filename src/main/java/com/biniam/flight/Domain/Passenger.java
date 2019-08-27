package com.biniam.flight.Domain;

import java.util.Objects;

public class Passenger {
    private String PassengerName;
    private String passengerId;
    private String email;

    public Passenger(Builder builder) {
        this.PassengerName= Objects.requireNonNull(builder.PassengerName,"passengerName");
        this.passengerId=Objects.requireNonNull(builder.passengerId,"passengerId");
        this.email=builder.email;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getEmail() {
        return email;
    }
    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private String PassengerName;
        private String passengerId;
        private String email;
        public Builder withPassengerName(String passengerName){
            this.PassengerName=passengerName;
            return  this;
        }
        public Builder withPassengerId(String passengerId){
            this.passengerId=passengerId;
            return this;
        }
        public Builder withEmail(String email){
            this.email=email;
            return this;
        }

        public Passenger build(){
            return new Passenger(this);
        }

    }
}
