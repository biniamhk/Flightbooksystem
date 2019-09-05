package com.biniam.flight.clientTest;

import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Dao.FlightDaoImpl;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.client.FlightAdmin;
import com.biniam.flight.client.FlightAdminImpl;
import com.biniam.flight.service.FlightService;
import com.biniam.flight.service.FlightServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class FlightClientTest {

    @Test
    public void testingCreateFlight(){

    Flight flight=Flight.builder().withFlightNo("3333").withOrigin("Helsink").withDestination("Stockholm")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("13:00")
                .withArrivalTime("12:00").withDate("15-09-2019").build();
        FlightDao flightDao=new FlightDaoImpl();
        FlightService flightService=new FlightServiceImpl(flightDao);
    FlightAdmin flightAdmin=new FlightAdminImpl(flightService);
    flightAdmin.createFlight(flight);
        Assert.assertEquals(1,flightAdmin.readFlights(flight).size());
        System.out.println(flightAdmin.readFlights(flight).toString());

    }
}
