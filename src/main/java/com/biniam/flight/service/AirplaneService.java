package com.biniam.flight.service;

import com.biniam.flight.Domain.Airplane;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AirplaneService {
    void CreatePlane(Airplane plane);
    String getAirByNumber(String planeNumber);
    Collection<Airplane> readAllAirplaneByModel(String planeModel);
    }
