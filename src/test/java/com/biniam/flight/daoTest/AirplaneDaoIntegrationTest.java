package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.AirplaneDao;
import com.biniam.flight.Dao.AirplaneDaoImpl;
import com.biniam.flight.Domain.Airplane;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Collection;

public class AirplaneDaoIntegrationTest {
    GenericXmlApplicationContext applicationContext=new GenericXmlApplicationContext("DaoTier.xml");
    private AirplaneDao airplaneDao=applicationContext.getBean(AirplaneDao.class);
    @Test
    public void testCreateAirplane() {

        airplaneDao.createPlane(Airplane.builder().withPlaneNo("111").withModel("Boeng737").withNumberOfSeats(10).build());
        Assert.assertNotNull(airplaneDao.read("111"));
    }

    @Test
    public void testReadAirplanesByModel() {

        airplaneDao.createPlane(Airplane.builder().withPlaneNo("222").withModel("Boeing737").withNumberOfSeats(10).build());
        airplaneDao.createPlane(Airplane.builder().withPlaneNo("333").withModel("Airbus280").withNumberOfSeats(10).build());
        airplaneDao.createPlane(Airplane.builder().withPlaneNo("444").withModel("Boeing737").withNumberOfSeats(20).build());
        Assert.assertEquals(2, airplaneDao.readAllAirplaneByModel("Boeing737").size());
        Collection<Airplane> airplanes=airplaneDao.readAllAirplaneByModel("Boeing737");
        System.out.println(airplanes);
    }


}
