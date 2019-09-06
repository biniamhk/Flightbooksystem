package com.biniam.flight.service;

import com.biniam.flight.Dao.AirplaneDao;
import com.biniam.flight.Domain.Airplane;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AirPlaneServiceImpl implements AirplaneService {
    private AirplaneDao airplaneDao;

    public AirPlaneServiceImpl(AirplaneDao airplaneDao) {
        this.airplaneDao = airplaneDao;
    }

    @Override
    public void CreatePlane(Airplane plane) {
        airplaneDao.createPlane(plane);

    }

    @Override
    public String getAirByNumber(String planeNumber) {
        Optional<Airplane> airplane = airplaneDao.read(planeNumber);
        if(airplane.isPresent()){
            return airplane.get().getPlaneNo();
        }
        return null;
    }

    @Override
    public Collection<Airplane> readAllAirplaneByModel(String planeModel) {
        return airplaneDao.readAllAirplane().stream().filter(airPlanes -> airPlanes.getModel()
                .equalsIgnoreCase(planeModel)).collect(Collectors.toSet());
    }

    public Collection<Airplane> readAllAirplane()
    {
        return airplaneDao.readAllAirplane();
    }
}
