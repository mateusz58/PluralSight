package com.kodilla.testing.collection;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.kodilla.testing.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CollectionTestSuite {

    OddNumbersExterminator oddNumbersExterminator;
    @BeforeEach
    void init() {
        System.out.println("Exterminator tests started");
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = new ArrayList<>();
        //When
        oddNumbersExterminator.exterminate(list);
        //Then
        assertTrue(list.isEmpty());
    }

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> listGiven = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //When
        List<Integer> listResult = new ArrayList<>();
        List<Integer> listExpected = Arrays.asList(2, 4, 6, 8);
        listResult.addAll(oddNumbersExterminator.exterminate(listGiven));
        //then
        assertEquals(listExpected, listResult);
    }
    @AfterAll
    static void finish() {
        System.out.println("Test finished");
    }

}
