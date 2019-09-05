package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Airplane;
import com.biniam.flight.Domain.Flight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightDaoImpl implements FlightDao {

  private  Map<String, Flight> flights = new HashMap<>();

    @Override
    public void createFlight(Flight flight) {
        if (flights.containsKey(flight.getFlightNo())) {
            throw new RuntimeException("flight already exist");
        }
        flights.put(flight.getFlightNo(), flight);

    }

    @Override
    public Optional<Flight> read(String flightNo) {
        return Optional.ofNullable(flights.get(flightNo));
    }


    @Override
    public Collection<Flight> readAllFlightsByDate(String date) {
        return flights.values()
                .stream()
                .filter(flightDate -> flightDate.getDate().equalsIgnoreCase(date)).collect(Collectors.toSet());
    }
    @Override
    public Collection<Flight> readAllFlightsByOrigin(String origin) {
        return flights.values()
                .stream()
                .filter(flightOrigin -> flightOrigin.getOrigin().equalsIgnoreCase(origin)).collect(Collectors.toSet());
    }
    @Override
    public Collection<Flight> readAllFlightsByDestination(String destination) {
        return flights.values()
                .stream()
                .filter(flightDate -> flightDate.getDestination().equalsIgnoreCase(destination)).collect(Collectors.toSet());
    }

    public Collection<Flight> readAllFlights(){
        return flights.values();
    }

    public Flight searchByDate(String date){

        return flights.get(date);
    }
    public void cancelFlight(String flightNo){
        flights.remove(flightNo);
    }
    public void cancelAllFlights(){
        flights.clear();

    }

    public Flight searchByOrigin(String origin){

        return flights.get(origin);
    }

    public Flight searchByDestination(String destination){

        return flights.get(destination);
    }


}
