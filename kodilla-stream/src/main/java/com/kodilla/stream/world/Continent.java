package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Continent {

    private final String name;

    private final Collection<Country> countries;

    public Continent(String name,List<Country> continents) {
        this.name=name;
        this.countries=new ArrayList<>(continents);
    }

    public Collection<Country> getCountries() {
        return countries;
    }

    public String getName() {
        return name;
    }
}
