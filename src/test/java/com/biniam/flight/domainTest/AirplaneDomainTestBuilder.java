package com.biniam.flight.domainTest;

import com.biniam.flight.Dao.AirplaneDao;
import com.biniam.flight.Dao.AirplaneDaoImpl;
import com.biniam.flight.Domain.Airplane;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class AirplaneDomainTestBuilder {

    @Test
    public void testAirplaneDomain() {
        Airplane airplane = Airplane.builder().withPlaneNo("1111").withModel("boeing737").withNumberOfSeats(10).build();
        Assert.assertEquals("1111", airplane.getPlaneNo());
    }
}


