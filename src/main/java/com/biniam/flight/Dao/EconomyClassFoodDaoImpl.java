package com.biniam.flight.Dao;

import com.biniam.flight.Domain.EconomyClassFood;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EconomyClassFoodDaoImpl implements EconomyClassFoodDao {
    Map<String ,EconomyClassFood> economyClassFoods=new HashMap<>();
    @Override
    public void createEconomyClassFood(EconomyClassFood economyClassFood) {
        if(economyClassFoods.containsKey(economyClassFood.getFoodName())){
            throw new  RuntimeException("the food already exist");
        }
        economyClassFoods.put(economyClassFood.getFoodName(),economyClassFood);

    }

    @Override
    public Optional<EconomyClassFood> readFoodByName(String foodName) {
        return Optional.ofNullable(economyClassFoods.get(foodName));
    }

    @Override
    public Collection<EconomyClassFood> readAllFoods() {
        return economyClassFoods.values();
    }
}
