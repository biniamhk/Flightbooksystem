package com.biniam.flight.domainTest;

import com.biniam.flight.Domain.*;
import org.junit.Assert;
import org.junit.Test;

public class BookDomain {
    @Test
    public void testAirplaneDomain() {
        Book book = Book.builder().withBookId(251).withPassenger(Passenger.builder().withPassengerId("002")
                .withPassengerName("Biniam Haile").withEmail("biniamhk@gmail.com").build()).withFlight(Flight.builder().withFlightNo("1122").withOrigin("Stockholm").withDestination("London")
                .withBusinessClassPrice(10000f).withEconomyClassPrice(5000f).withDepartureTime("19:30").withArrivalTime("22:30")
                .withDate("22-10-2019").build()).withBusinessClassFood(BusinessClassFood.builder().withFoodName("pasta").withFoodQty("1")
                .withDrink("beer").withFoodPrice(120f).build()).withEconomyClassFood(EconomyClassFood.builder().withFoodName("pasta").withFoodQty("1")
                .withDrink("beer").withFoodPrice(115f).build()).build();
        Assert.assertNotNull(book.getBookId());
        System.out.println(book.toString());
    }
}