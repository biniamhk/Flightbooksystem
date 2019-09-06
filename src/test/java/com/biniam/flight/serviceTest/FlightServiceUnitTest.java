package com.biniam.flight.serviceTest;

import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Dao.FlightDaoImpl;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.service.FlightService;
import com.biniam.flight.service.FlightServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Collection;

public class FlightServiceUnitTest {
    GenericXmlApplicationContext applicationContext =
            new GenericXmlApplicationContext("DaoTier.xml");
    private  FlightDao flightDao=applicationContext.getBean(FlightDao.class);

    @Test
    public void testCreatingAndReadingFlight(){
        flightDao.createFlight((Flight.builder().withFlightNo("0013").withOrigin("Stockholm").withDestination("paris")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("19:30").withArrivalTime("22:30")
                .withDate("22-12-2019").build()));
        FlightService flightService=new FlightServiceImpl(flightDao);
        Assert.assertEquals(flightDao.readAllFlightsByOrigin("STOCKHOLM"),flightService.getFlightByOrigin("Stockholm"));
        Collection<Flight> flight=flightService.getAllFlight();
        System.out.println(flight);
        Assert.assertEquals(1,flightService.getFlightByOrigin("Stockholm").size());
        Assert.assertNotNull(flightService.getFlightByNumber("0013"));
    }
    @Test
    public void testCanclingFlight(){
        flightDao.createFlight((Flight.builder().withFlightNo("0013").withOrigin("Stockholm").withDestination("paris")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("19:30").withArrivalTime("22:30")
                .withDate("22-12-2019").build()));
        FlightService flightService=new FlightServiceImpl(flightDao);
        System.out.println(flightService.getAllFlight());
        //After canceling a flight
        flightService.cancelFlight("0013");
        Assert.assertEquals(0,flightService.getAllFlight().size());

    }
}
