package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.BusinessClassFoodDao;
import com.biniam.flight.Dao.BusinessClassFoodDaoImpl;
import com.biniam.flight.Domain.BusinessClassFood;
import org.junit.Assert;
import org.junit.Test;

public class BusinessClassFoodUnitTest {

    @Test
    public void testCreatingBusinessFood() {
        BusinessClassFoodDao businessClassFoodDao = new BusinessClassFoodDaoImpl();
        businessClassFoodDao.createBusinessClassFood(BusinessClassFood.builder()
                .withFoodName("veganpizza").withFoodQty("2").withDrink("vin")
                .withFoodPrice(300f).build());
        Assert.assertNotNull(businessClassFoodDao.readFoodByName("veganpizza"));
    }

    @Test
    public void testAllFoodsAvailable() {
        BusinessClassFoodDao businessClassFoodDao = new BusinessClassFoodDaoImpl();
        businessClassFoodDao.createBusinessClassFood(BusinessClassFood.builder().withFoodName("pasta").withFoodQty("1")
                .withDrink("beer").withFoodPrice(120f).build());
        businessClassFoodDao.createBusinessClassFood(BusinessClassFood.builder().withFoodName("Takos").withFoodQty("3")
                .withDrink("beer").withFoodPrice(2700f).build());
        businessClassFoodDao.createBusinessClassFood(BusinessClassFood.builder().withFoodName("potato").withFoodQty("1")
                .withDrink("beer").withFoodPrice(100f).build());
        Assert.assertEquals(3, businessClassFoodDao.readAllFoods().size());
    }
}
