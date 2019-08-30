package com.biniam.flight.Dao;

import com.biniam.flight.Domain.BusinessClassFood;

import java.util.*;

public class BusinessClassFoodDaoImpl implements BusinessClassFoodDao {
    Map<String, BusinessClassFood> businessClassFoods = new HashMap<>();

    @Override
    public void createBusinessClassFood(BusinessClassFood businessClassFood) {
        if (businessClassFoods.containsKey(businessClassFood.getFoodName())) {
            throw new RuntimeException("Already exist");
        }
        businessClassFoods.put(businessClassFood.getFoodName(), businessClassFood);


    }

    @Override
    public Optional<BusinessClassFood> readFoodByName(String foodName) {
        return Optional.ofNullable(businessClassFoods.get(foodName));
    }

    public Collection<BusinessClassFood> readAllFoods() {
        return businessClassFoods.values();
    }
}
