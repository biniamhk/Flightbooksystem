package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.EconomyClassFoodDao;
import com.biniam.flight.Dao.EconomyClassFoodDaoImpl;
import com.biniam.flight.Domain.EconomyClassFood;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Collection;

public class EconomyClassFoodIntegrationTest {
    private GenericXmlApplicationContext applicationContext=new GenericXmlApplicationContext("DaoTier.xml");
    private EconomyClassFoodDao economyClassFoodDao=applicationContext.getBean(EconomyClassFoodDao.class);
    @Test
    public void testCreatingEconomyFood() {
        economyClassFoodDao.createEconomyClassFood(EconomyClassFood.builder()
                .withFoodName("Napolipizza").withFoodQty("2").withDrink("vin")
                .withFoodPrice(100f).build());
        Assert.assertNotNull(economyClassFoodDao.readFoodByName("veganpizza"));
    }

    @Test
    public void testAllFoodsAvailable() {
        economyClassFoodDao.createEconomyClassFood(EconomyClassFood.builder().withFoodName("pasta").withFoodQty("1")
                .withDrink("beer").withFoodPrice(115f).build());
        economyClassFoodDao.createEconomyClassFood(EconomyClassFood.builder().withFoodName("lazana").withFoodQty("3")
                .withDrink("beer").withFoodPrice(1800f).build());
        economyClassFoodDao.createEconomyClassFood(EconomyClassFood.builder().withFoodName("potato").withFoodQty("1")
                .withDrink("vodka").withFoodPrice(1000f).build());
        Assert.assertEquals(3, economyClassFoodDao.readAllFoods().size());
        Collection<EconomyClassFood> economyClassFoods=economyClassFoodDao.readAllFoods();
        System.out.println(economyClassFoods);
    }
}
