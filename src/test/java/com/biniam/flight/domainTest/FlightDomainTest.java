package com.biniam.flight.domainTest;

import com.biniam.flight.Domain.Flight;
import org.junit.Assert;
import org.junit.Test;

public class FlightDomainTest {
    @Test
    public void testAirplaneDomain() {
        Flight flight = Flight.builder().withFlightNo("1111").withOrigin("Stockholm").withDestination("Paris")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("16:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build();
        Assert.assertSame("Paris", flight.getDestination());
    }
}

