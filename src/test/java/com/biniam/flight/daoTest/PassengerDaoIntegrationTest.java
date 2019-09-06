package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.PassengerDao;
import com.biniam.flight.Dao.PassengerDaoImpl;
import com.biniam.flight.Domain.Passenger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PassengerDaoIntegrationTest {
    private GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("DaoTier.xml");
    private PassengerDao passengerDao = applicationContext.getBean(PassengerDao.class);

    @Test
    public void testCreatingPassenger() {

        passengerDao.createPassenger(Passenger.builder().withPassengerId("0010").withPassengerName("biniam").withEmail("biniamhh@Yahoo.com").build());
        Assert.assertNotNull(passengerDao.read("0010"));
    }

    @Test
    public void testReadingAllPassengers() {

        Passenger passenger1 = Passenger.builder().withPassengerId("002").withPassengerName("Biniam Haile").withEmail("biniamhk@gmail.com").build();
        Passenger passenger2 = Passenger.builder().withPassengerId("003").withPassengerName("noah").withEmail("noahhk@gmial.com").build();
        passengerDao.createPassenger(passenger1);
        passengerDao.createPassenger(passenger2);

        Assert.assertEquals(2, passengerDao.readAllPassengers().size());
        System.out.println(passengerDao.readAllPassengers().toString());

    }
}


