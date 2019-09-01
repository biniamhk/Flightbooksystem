package com.biniam.flight.Dao;

import com.biniam.flight.Domain.EconomyClassFood;

import java.util.Collection;
import java.util.Optional;

public interface EconomyClassFoodDao {
    void createEconomyClassFood(EconomyClassFood economyClassFood);

    Optional<EconomyClassFood> readFoodByName(String foodName);

    public Collection<EconomyClassFood> readAllFoods();

}
