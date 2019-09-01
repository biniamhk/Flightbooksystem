package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.EconomyClassFoodDao;
import com.biniam.flight.Dao.EconomyClassFoodDaoImpl;
import com.biniam.flight.Domain.EconomyClassFood;
import org.junit.Assert;
import org.junit.Test;

public class EconomyClassFoodUnitTest {
    @Test
    public void testCreatingEconomyFood() {
        EconomyClassFoodDao economyClassFoodDao = new EconomyClassFoodDaoImpl();
        economyClassFoodDao.createEconomyClassFood(EconomyClassFood.builder()
                .withFoodName("Napolipizza").withFoodQty("2").withDrink("vin")
                .withFoodPrice(100f).build());
        Assert.assertNotNull(economyClassFoodDao.readFoodByName("veganpizza"));
    }

    @Test
    public void testAllFoodsAvailable() {
        EconomyClassFoodDao economyClassFoodDao = new EconomyClassFoodDaoImpl();
        economyClassFoodDao.createEconomyClassFood(EconomyClassFood.builder().withFoodName("pasta").withFoodQty("1")
                .withDrink("beer").withFoodPrice(115f).build());
        economyClassFoodDao.createEconomyClassFood(EconomyClassFood.builder().withFoodName("Takos").withFoodQty("3")
                .withDrink("beer").withFoodPrice(1800f).build());
        economyClassFoodDao.createEconomyClassFood(EconomyClassFood.builder().withFoodName("potato").withFoodQty("1")
                .withDrink("beer").withFoodPrice(1000f).build());
        Assert.assertEquals(3, economyClassFoodDao.readAllFoods().size());
    }
}
