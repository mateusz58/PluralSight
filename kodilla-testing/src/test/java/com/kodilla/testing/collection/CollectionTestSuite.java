package com.kodilla.testing.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Generators.NumberGenerator;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CollectionTestSuite {

    OddNumbersExterminator oddNumbersExterminator;

    @Before
    public void init() {
        System.out.println("Exterminator tests started");
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = new ArrayList<>();
        //When
        oddNumbersExterminator.exterminate(list);
        //Then
        assertTrue(list.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> listGiven = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int number = NumberGenerator.generateRandomNumber(1, 100);
            if (number % 2 == 0) {
                listGiven.add(number);
            }
        }
        //When
        List<Integer> list = new ArrayList<>();
        list.addAll(oddNumbersExterminator.exterminate(listGiven));
        //then
        assertEquals(list, listGiven);

    }

    @After
    public void finish() {
        System.out.println("Exterminator tests finished");
    }

}
