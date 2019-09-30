package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling();
        }
        return "Done!";
    }

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        boolean succes = false;
        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 0);
            succes = true;
        } catch (ExceptionHandling e) {
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
