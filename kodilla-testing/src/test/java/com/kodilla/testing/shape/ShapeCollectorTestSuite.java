package com.kodilla.testing.shape;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ShapeCollectorTestSuite {

    ShapeCollector shapeCollector;
    @BeforeEach
    void init()
    {
        shapeCollector=new ShapeCollector();
    }

    @Test
    void shouldAddFigure() {
        //Given
        Shape square=new Square(10);
        Shape triangle=new Triangle(10,10);
        Shape circle=new Circle(10);
        List<Shape> expected=new ArrayList<>();
        expected.add(square);
        expected.add(triangle);
        expected.add(circle);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //Then
        assertEquals(expected,shapeCollector.getList());

    }

    @Test
    public void shouldRemoveFigure() {
        //Given
        Shape square=new Square(10);
        Shape triangle=new Triangle(10,10);
        Shape circle=new Circle(10);
        List<Shape> list=new ArrayList<>();
        list.add(square);
        list.add(triangle);
        list.add(circle);
        //When
        shapeCollector.setList(list);
        shapeCollector.removeFigure(square);
        //Then
        assertTrue(!shapeCollector.getList().contains(square));

    }

    @ParameterizedTest
    @ValueSource(ints={0,1,2})
    public void shouldGetFigure(int n) {
        //Given
        Shape square=new Square(10);
        Shape triangle=new Triangle(10,10);
        Shape circle=new Circle(10);
        List<Shape> list=new ArrayList<>();
        list.add(square);
        list.add(triangle);
        list.add(circle);
        //When
        shapeCollector.setList(list);
        Shape expected=list.get(n);
        Shape given=shapeCollector.getFigure(n);
        //Then
        assertEquals(expected,given);
    }
}
