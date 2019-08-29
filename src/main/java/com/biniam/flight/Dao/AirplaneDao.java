package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Airplane;

import java.util.Collection;
import java.util.Optional;

public interface AirplaneDao {
    void createPlane(Airplane airplane);
    Optional<Airplane> read(String planeNo);
    Collection<Airplane> readAllAirplaneByModel(String model);
}
