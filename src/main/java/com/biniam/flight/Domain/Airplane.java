package com.biniam.flight.Domain;

import java.io.Serializable;
import java.util.Objects;

public class Airplane implements Serializable {
    private String planeNo;
    private String model;
    private int numberOfSeats;

    private Airplane(Builder builder) {
        this.planeNo = Objects.requireNonNull(builder.planeNo, "plane number");
        this.model = Objects.requireNonNull(builder.model, "plane model");
        this.numberOfSeats = Objects.requireNonNull(builder.numberOfSeats, "number of seats");
    }

    public String getNo() {
        return planeNo;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String planeNo;
        private String model;
        private int numberOfSeats;

        public Builder withPlaneNo() {
            this.planeNo = planeNo;
            return this;
        }

        public Builder withModel() {
            this.model = model;
            return this;
        }

        public Builder withNumberOfSeats() {
            this.numberOfSeats = numberOfSeats;
            return this;

        }

        public Airplane build() {
            return new Airplane(this);
        }

    }
}
