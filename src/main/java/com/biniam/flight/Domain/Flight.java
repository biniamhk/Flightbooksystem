package com.biniam.flight.Domain;

import java.util.Objects;

public class Flight {
    private String flightNo;
    private String flightName;
    private int numberOfSeats;
    private String timeFlight;
    private String date;

    public Flight(Builder builder) {
        this.flightNo = Objects.requireNonNull(builder.flightNo, "flightNumber");
        this.flightName = Objects.requireNonNull(builder.flightName, "flightName");
        this.numberOfSeats = Objects.requireNonNull(builder.numberOfSeats, "numberOfSeats");
        this.timeFlight = Objects.requireNonNull(builder.timeFlight, "timeOfFlight");
        this.date = Objects.requireNonNull(builder.date, "flightDate");
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

    public String getTimeFlight() {
        return timeFlight;
    }

    public String getDate() {
        return date;
    }

    public static Builder builder() {
        return new Builder();

    }

    public static class Builder {

        private String flightNo;
        private String flightName;
        private int numberOfSeats;
        private String timeFlight;
        private String date;

        public Builder withFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;

        }

        public Builder withFlightName(String flightName) {
            this.flightName = flightName;
            return this;

        }

        public Builder withNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder withTimeFlight(String timeFlight) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder withDate(String Date) {
            this.date = date;
            return this;
        }

        public Flight build() {
            return new Flight(this);
        }

    }
}
