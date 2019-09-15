package com.kodilla.testing.shape;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Circle implements Shape {

    double r;
    @Override
    public double calculateArea() {
        return 3.14*r*r;
    }

    @Override
    public String shapeName() {
        return "circle";
    }
}
