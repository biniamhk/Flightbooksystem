package com.biniam.flight.Domain;

import java.io.Serializable;
import java.util.Objects;

public class EconomyClassFood implements Serializable {
    private String foodName;
    private String foodQty;
    private String drink;
    private float foodPrice;

    private EconomyClassFood()  {

    }

    private EconomyClassFood(Builder builder) {
        this.foodName = Objects.requireNonNull(builder.foodName, "foodName");
        this.foodQty = Objects.requireNonNull(builder.foodQty, "foodQty");
        this.drink = Objects.requireNonNull(builder.drink, "someThingToDrink");
        this.foodPrice = Objects.requireNonNull(builder.foodPrice, "price");
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodQty() {
        return foodQty;
    }

    public String getDrink() {
        return drink;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    @Override
    public String toString() {
        return "EconomyClassFood{" +
                "foodName='" + foodName + '\'' +
                ", foodQty='" + foodQty + '\'' +
                ", drink='" + drink + '\'' +
                ", foodPrice=" + foodPrice +
                '}'+'\n';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String foodName;
        private String foodQty;
        private String drink;
        private float foodPrice;

        public Builder withFoodName(String foodName) {
            this.foodName = foodName;
            return this;
        }

        public Builder withFoodQty(String foodQty) {
            this.foodQty = foodQty;
            return this;
        }

        public Builder withDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder withFoodPrice(float foodPrice) {
            this.foodPrice = foodPrice;
            return this;
        }

        public EconomyClassFood build() {
            return new EconomyClassFood(this);
        }

    }

}
