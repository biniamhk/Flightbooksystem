package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Airplane;
import com.biniam.flight.exceptionHandler.ExceptionHandler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AirplaneDaoImpl implements AirplaneDao {
    Map<String, Airplane> airplanes = new HashMap<>();

    @Override
    public void createPlane(Airplane airplane)  throws ExceptionHandler {
        if (airplanes.containsKey(airplane.getPlaneNo())) {
            throw new RuntimeException("Plane already exist");
        }
        airplanes.put(airplane.getPlaneNo(), airplane);

    }

    @Override
    public Optional<Airplane> read(String planeNo) {
        return Optional.ofNullable(airplanes.get(planeNo));
    }


    @Override
    public Collection<Airplane> readAllAirplaneByModel(String model) {
        return airplanes.values()
                .stream()
                .filter(planeModel -> planeModel.getModel().equalsIgnoreCase(model)).collect(Collectors.toSet());
    }

    @Override
    public Collection<Airplane> readAllAirplane() {
        return airplanes.values();
    }

}
