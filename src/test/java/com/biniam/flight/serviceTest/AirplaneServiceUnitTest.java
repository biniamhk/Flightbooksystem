package com.biniam.flight.serviceTest;

import com.biniam.flight.Dao.AirplaneDao;
import com.biniam.flight.Dao.AirplaneDaoImpl;
import com.biniam.flight.Domain.Airplane;
import com.biniam.flight.service.AirPlaneServiceImpl;
import com.biniam.flight.service.AirplaneService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AirplaneServiceUnitTest {
   private  GenericXmlApplicationContext applicationContext=
           new GenericXmlApplicationContext("DaoTier.xml","ServiceTier.xml");
   private  AirplaneDao airplaneDao=applicationContext.getBean(AirplaneDao.class);
  private   AirplaneService airplaneService=applicationContext.getBean(AirplaneService.class);

    @Test
    public void testCreatingAndReadingAirplane(){
        Airplane airplane= Airplane.builder().withPlaneNo("222").withModel("Boeing737").withNumberOfSeats(10).build();
        Airplane airplane1=Airplane.builder().withPlaneNo("333").withModel("Airbus280").withNumberOfSeats(10).build();
        airplaneDao.createPlane(airplane);
        airplaneDao.createPlane(airplane1);

        AirplaneService airplaneService=new AirPlaneServiceImpl(airplaneDao);
        Assert.assertNotNull(airplaneService.getAirByNumber("222"));






    }
}
