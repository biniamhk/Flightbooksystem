package com.biniam.flight.Domain;

import java.io.Serializable;
import java.util.Objects;

public class BusinessClassFood implements Serializable {
    private String foodName;
    private String foodQty;
    private float foodPrice;
    private String drink;

    private BusinessClassFood() {

    }

    private BusinessClassFood(Builder builder) {
        this.foodName = Objects.requireNonNull(builder.foodName, "foodName");
        this.foodQty = Objects.requireNonNull(builder.foodQty, "foodQty");
        this.foodPrice = Objects.requireNonNull(builder.foodPrice, "price");
        this.drink = Objects.requireNonNull(builder.drink, "someThingToDrink");
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodQty() {
        return foodQty;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "BusinessClassFood{" +
                "foodName='" + foodName + '\'' +
                ", foodQty='" + foodQty + '\'' +
                ", foodPrice=" + foodPrice +
                ", drink='" + drink + '\'' +
                '}'+'\n';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String foodName;
        private String foodQty;
        private float foodPrice;
        private String drink;

        public Builder withFoodName(String foodName) {
            this.foodName = foodName;
            return this;
        }

        public Builder withFoodQty(String foodQty) {
            this.foodQty = foodQty;
            return this;
        }

        public Builder withFoodPrice(float foodPrice) {
            this.foodPrice = foodPrice;
            return this;
        }

        public Builder withDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public BusinessClassFood build() {
            return new BusinessClassFood(this);
        }

    }
}
