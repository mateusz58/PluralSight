package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        boolean succes = false;
        try {
            double result = firstChallenge.divide(3, 0);
            succes = true;
        } catch (ArithmeticException e) {
            System.out.println("In the catch Block due to Exception = " + e);
        } finally {
            if (succes) {
                System.out.println("Function executed");
            } else {
                System.out.println("Function not executed");
            }
        }
    }
}