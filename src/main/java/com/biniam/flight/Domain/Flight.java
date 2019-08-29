package com.biniam.flight.Domain;

import java.util.Objects;

public class Flight {
    private String flightNo;
    private String origin;
    private String destination;
    private Float businessClassPrice;
    private Float economyClassPrice;
   // private Airplane airplane;
   private String departureTime;
    private String arrivalTime;
    private String date;

    private Flight() {
    }

    private Flight(Builder builder) {
        this.flightNo=builder.flightNo;
        this.origin=Objects.requireNonNull(builder.origin,"originPlace");
        this.destination=Objects.requireNonNull(builder.destination,"destinationPlace");
        this.businessClassPrice=Objects.requireNonNull(builder.businessClassPrice,"businessClassPrice");
        this.economyClassPrice=Objects.requireNonNull(builder.economyClassPrice,"businessClassPrice");
       // this.airplane=Objects.requireNonNull(builder.airplane,"airplane");
        this.departureTime=Objects.requireNonNull(builder.departureTime,"plane departure time");
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

    public Float getBusinessClassPrice() {
        return businessClassPrice;
    }
    public Float getEconomyClassPrice() {
        return economyClassPrice;
    }

    //public Airplane getAirplane() {
   //     return airplane;
    //}

    public String getDepartureTime(){
        return departureTime;
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

    @Override
    public  String toString() {
        return "Flight{" +
                "flightNo='" + flightNo + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", businessClassPrice=" + businessClassPrice +
                ", economyClassPrice=" + economyClassPrice +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public static class Builder {
        private String flightNo;
        private String origin;
        private String destination;
        private Float businessClassPrice;
        private Float economyClassPrice;
        //private Airplane airplane;
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

        public Builder withBusinessClassPrice(float businessClassPrice) {
            this.businessClassPrice = businessClassPrice;
            return this;
        }
        public Builder withEconomyClassPrice(float economyClassPrice){
            this.economyClassPrice=economyClassPrice;
            return  this;
        }

//        public Builder withAirplane(FlightClass airplane) {
//            this.airplane = airplane;
//            return this;
//        }


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
