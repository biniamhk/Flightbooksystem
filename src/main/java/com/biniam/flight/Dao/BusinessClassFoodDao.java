package com.biniam.flight.Dao;

import com.biniam.flight.Domain.BusinessClassFood;

import java.util.Collection;
import java.util.Optional;

public interface BusinessClassFoodDao {
    void createBusinessClassFood(BusinessClassFood businessClassFood);

    Optional<BusinessClassFood> readFoodByName(String foodName);

    public Collection<BusinessClassFood> readAllFoods();
}
