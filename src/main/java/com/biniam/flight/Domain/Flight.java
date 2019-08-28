package com.biniam.flight.Domain;

import java.util.Objects;

public class Flight {
    private String flightNo;
    private String origin;
    private String destination;
    private Float price;
    private Airplane airplane;
    private String arrivalTime;
    private String date;

    private Flight(Builder builder) {
        this.flightNo=builder.flightNo;
        this.origin=Objects.requireNonNull(builder.origin,"originPlace");
        this.destination=Objects.requireNonNull(builder.destination,"destinationPlace");
        this.price=Objects.requireNonNull(builder.price,"price");
        this.airplane=Objects.requireNonNull(builder.airplane,"airplane");
        this.arrivalTime=Objects.requireNonNull(builder.arrivalTime,"arrivalTime");
        this.date=Objects.requireNonNull(builder.date,"dateOfFlight");
    }


    public String getFlightNo() {
        return flightNo;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Float getPrice() {
        return price;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDate() {
        return date;
    }

    public static Builder builder() {
        return new Builder();

    }

    public static class Builder {
        private String flightNo;
        private String origin;
        private String destination;
        private Float price;
        private Airplane airplane;
        private String departureTime;
        private String arrivalTime;
        private String date;


        public Builder withFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;

        }

        public Builder withOrigin(String origin) {
            this.origin = origin;
            return this;

        }

        public Builder withDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder withPrice(float price) {
            this.price = price;
            return this;
        }

        public Builder withAirplane(Airplane airplane) {
            this.airplane = airplane;
            return this;
        }


        public Builder withDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        public Builder withArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }

        public Builder withDate(String date) {
            this.date = date;
            return this;
        }

        public Flight build() {
            return new Flight(this);
        }

    }
}
