package com.kodilla.exception.test;

import com.kodilla.exception.Generators.WordGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightLogic {

    private final Map<String, Boolean> airportMap;

    public FlightLogic(Map<String, Boolean> airportMap) {
        this.airportMap = new HashMap<>(airportMap);
    }


    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!airportMap.containsKey(flight.getDepartureAirport())||!airportMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Airport does not exist!");
        }
    }

    public static void main(String[] args) {
        List<Flight> list=new ArrayList<>();
        for (int i = 0; i <10; i++) {
            list.add(new Flight(WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord()));

        }
        FlightLogic logic=new FlightLogic(new HashMap<String, Boolean>()
        {{
            put("One", true);
            put("Two", false);
            put("Three", true);
        }});
        boolean succes = false;
        try {
            for (int i = 0; i < 10; i++) {
                logic.findFlight(list.get(i));
                succes=true;
            }
            succes = true;
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (succes) {
                System.out.println("Function executed");
            } else {
                System.out.println("Function not executed");
            }
        }
    }
}

