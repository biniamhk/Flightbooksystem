package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.PassengerDao;
import com.biniam.flight.Dao.PassengerDaoImpl;
import com.biniam.flight.Domain.Passenger;
import org.junit.Assert;
import org.junit.Test;

public class PassengerDaoIntegrationTest {
    @Test
    public void testCreatingPassenger() {
        PassengerDao passengerDao = new PassengerDaoImpl();
        passengerDao.createPassenger(Passenger.builder().withPassengerId("0010").withPassengerName("biniam").withEmail("biniamhh@Yahoo.com").build());
        Assert.assertNotNull(passengerDao.read("0010"));
    }

    @Test
    public void testReadingAllPassengers() {
        PassengerDao  passengerDao = new PassengerDaoImpl();
        Passenger passenger1=Passenger.builder().withPassengerId("002").withPassengerName("Biniam Haile").withEmail("biniamhk@gmail.com").build();
        Passenger passenger2=Passenger.builder().withPassengerId("003").withPassengerName("noah").withEmail("noahhk@gmial.com").build();
       passengerDao.createPassenger(passenger1);
       passengerDao.createPassenger(passenger2);

        Assert.assertEquals(2,passengerDao.readAllPassengers().size());

    }
}


