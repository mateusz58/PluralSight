package com.kodilla.testing.shape;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Triangle implements Shape {

    double a;
    double height;
    @Override
    public double calculateArea() {
        return 0.5*a*height;
    }

    @Override
    public String shapeName() {
        return "triangle";
    }
}
