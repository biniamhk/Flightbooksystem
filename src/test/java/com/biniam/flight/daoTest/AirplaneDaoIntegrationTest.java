package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.AirplaneDao;
import com.biniam.flight.Dao.AirplaneDaoImpl;
import com.biniam.flight.Domain.Airplane;
import org.junit.Assert;
import org.junit.Test;

public class AirplaneDaoIntegrationTest {

    @Test
    public void testCreateAirplane() {
        AirplaneDao airplaneDao = new AirplaneDaoImpl();
        airplaneDao.createPlane(Airplane.builder().withPlaneNo("111").withModel("Boeng737").withNumberOfSeats(10).build());
        Assert.assertNotNull(airplaneDao.read("111"));
    }

    @Test
    public void testReadAirplanesByModel() {
        AirplaneDao airplaneDao = new AirplaneDaoImpl();
        airplaneDao.createPlane(Airplane.builder().withPlaneNo("222").withModel("Boeing737").withNumberOfSeats(10).build());
        airplaneDao.createPlane(Airplane.builder().withPlaneNo("333").withModel("Airbus280").withNumberOfSeats(10).build());
        airplaneDao.createPlane(Airplane.builder().withPlaneNo("444").withModel("Boeing737").withNumberOfSeats(20).build());
        Assert.assertEquals(2, airplaneDao.readAllAirplaneByModel("Boeing737").size());
    }


}
