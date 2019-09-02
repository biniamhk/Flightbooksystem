package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Airplane;
import com.biniam.flight.exceptionHandler.ExceptionHandler;

import java.util.Collection;
import java.util.Optional;

public interface AirplaneDao {
    void createPlane(Airplane airplane) throws ExceptionHandler;

    Optional<Airplane> read(String planeNo);

    Collection<Airplane> readAllAirplaneByModel(String model);

    Collection<Airplane> readAllAirplane();
}
