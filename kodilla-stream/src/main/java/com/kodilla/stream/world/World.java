package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class World {

    private final Collection<Continent> continents;

    public World(List<Continent> continents) {
        this.continents=new ArrayList<>(continents);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal sumQuantity= continents.stream()
            .flatMap(continent->continent.getCountries().stream())
            .distinct()
            .map(country->country.getPeopleQuantity())
            .reduce(BigDecimal.ZERO, (sum,current)->sum=sum.add(current));
        return sumQuantity;
    }
}
