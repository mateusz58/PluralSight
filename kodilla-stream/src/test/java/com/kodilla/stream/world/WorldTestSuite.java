package com.kodilla.stream.world;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.kodilla.stream.Generators.WordGenerator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class WorldTestSuite {

    World world;
    Continent continent;

    @Test
    void getPeopleQuantity() {
        //Given
        List<Country> countries = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            countries.add(new Country(WordGenerator.generateRandomWord(),BigDecimal.valueOf(100)));
        }
        continent=new Continent(WordGenerator.generateRandomWord(),countries);
        world=new World(Collections.singletonList(continent));
        //When
        int sum=world.getPeopleQuantity().intValue();
        //Then
        assertEquals(1000,sum);
    }
}
