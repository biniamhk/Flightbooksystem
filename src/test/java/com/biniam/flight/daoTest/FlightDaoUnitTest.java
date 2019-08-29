package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Dao.FlightDaoImpl;
import com.biniam.flight.Domain.Airplane;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.FlightClass;
import org.junit.Assert;
import org.junit.Test;

public class FlightDaoUnitTest {

    @Test
    public void testCreateFlight(){
        FlightDao flightDao=new FlightDaoImpl();
        flightDao.createFlight(Flight.builder().withFlightNo("1122").withOrigin("Stockholm").withDestination("London")
                .withBusinessClassPrice(10000f).withEconomyClassPrice(5000f).withDepartureTime("19:30").withArrivalTime("22:30")
                .withDate("22-10-2019").build());
        Assert.assertNotNull(flightDao.read("1122"));
    }
    @Test
    public void testReadAllFlightsByDate(){
        FlightDao flightDao=new FlightDaoImpl();
        flightDao.createFlight(Flight.builder().withFlightNo("1111").withOrigin("Stockholm").withDestination("Paris")
                .withBusinessClassPrice(10000f).withEconomyClassPrice(5000f).withDepartureTime("16:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build());
        flightDao.createFlight(Flight.builder().withFlightNo("1234").withOrigin("Stockholm").withDestination("Berlin")
                .withBusinessClassPrice(8000f).withEconomyClassPrice(4000f).withDepartureTime("18:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build());
        flightDao.createFlight(Flight.builder().withFlightNo("3333").withOrigin("Helsink").withDestination("Stockholm")
                .withBusinessClassPrice(6000f).withEconomyClassPrice(2000f).withDepartureTime("13:00")
                .withArrivalTime("12:00").withDate("15-09-2019").build());
        Assert.assertEquals(2,flightDao.readAllFlightsByDate("20-11-2019").size());
    }
}