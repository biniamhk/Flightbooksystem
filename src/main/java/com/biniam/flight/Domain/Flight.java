package com.biniam.flight.Domain;

import java.util.Objects;

public class Flight {
    private String flightNo;
    private String flightName;
    private int numberOfSeats;

    public Flight(Builder builder) {
        this.flightNo= Objects.requireNonNull(builder.flightNo,"flightNumber");
        this.flightName=Objects.requireNonNull(builder.flightName,"flightName");
        this.numberOfSeats=Objects.requireNonNull(builder.numberOfSeats,"numberOfSeats");
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getFlightName() {
        return flightName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public static Builder builder() {
        return new Builder();

    }

    public static class Builder {

        private String flightNo;
        private String flightName;
        private int numberOfSeats;

        public Builder withFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;

            }

        public Builder withFlightName(String flightName) {
            this.flightName = flightName;
            return this;

        }
        public Builder withNumberOfSeats(){
            this.numberOfSeats=numberOfSeats;
            return this;
        }
        public Flight build(){
            return new Flight(this);
        }

    }
}
