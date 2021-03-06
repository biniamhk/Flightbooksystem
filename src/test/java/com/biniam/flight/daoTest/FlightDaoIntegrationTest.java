package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Dao.FlightDaoImpl;
import com.biniam.flight.Domain.Airplane;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.FlightClass;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Collection;

public class FlightDaoIntegrationTest {
    GenericXmlApplicationContext applicationContext =
            new GenericXmlApplicationContext("DaoTier.xml");
    private  FlightDao flightDao=applicationContext.getBean(FlightDao.class);

    @Test
    public void testCreateFlight() {

        flightDao.createFlight(Flight.builder().withFlightNo("1122").withOrigin("Stockholm").withDestination("London")
                .withBusinessClassPrice(10000f).withEconomyClassPrice(5000f).withDepartureTime("19:30").withArrivalTime("22:30")
                .withDate("22-10-2019").build());
        Assert.assertNotNull(flightDao.read("1122"));
    }

    @Test
    public void testReadAllFlightsByDate() {
       
        flightDao.createFlight(Flight.builder().withFlightNo("1111").withOrigin("Stockholm").withDestination("Paris")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("16:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build());
        flightDao.createFlight(Flight.builder().withFlightNo("1234").withOrigin("Stockholm").withDestination("Berlin")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("18:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build());
        flightDao.createFlight(Flight.builder().withFlightNo("3333").withOrigin("Helsink").withDestination("Stockholm")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("13:00")
                .withArrivalTime("12:00").withDate("15-09-2019").build());
               Assert.assertEquals(2, flightDao.readAllFlightsByDate("20-11-2019").size());
        Collection<Flight> flights = flightDao.readAllFlightsByDate("20-11-2019");

        System.out.println(flights);
    }

    @Test
    public void testReadAllFlightsByOriginAndCancellingFlights() {

        flightDao.createFlight(Flight.builder().withFlightNo("1111").withOrigin("Stockholm").withDestination("Paris")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("16:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build());
        flightDao.createFlight(Flight.builder().withFlightNo("1234").withOrigin("Stockholm").withDestination("Berlin")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("18:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build());
        flightDao.createFlight(Flight.builder().withFlightNo("3333").withOrigin("Helsink").withDestination("Stockholm")
                .withBusinessClassPrice(20000f).withEconomyClassPrice(5000f).withDepartureTime("13:00")
                .withArrivalTime("12:00").withDate("15-09-2019").build());
        Assert.assertEquals(2, flightDao.readAllFlightsByOrigin("stockholm").size());
        //now I am going to cancel flight  and test if it works
        flightDao.cancelFlight("3333");
        Assert.assertEquals(2,flightDao.readAllFlights().size());
        System.out.println(flightDao.readAllFlights());
        //cancelling all flights
//        flightDao.cancelAllFlights();
//        Assert.assertEquals(0,flightDao.readAllFlights().size());


    }

}
