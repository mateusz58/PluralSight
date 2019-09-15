package com.kodilla.testing.shape;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Square implements Shape {

    double a;
    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public String shapeName() {
        return "square";
    }
}
