package com.kodilla.exception.test;

import lombok.Getter;

@Getter
public class Flight {
    private final String departureAirport;
     private final String arrivalAirport;
     private boolean isActive;


    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.isActive=true;
    }
}
