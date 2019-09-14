package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        int checkAdd = Calculator.add(5, 2);
        int checkSubstract = Calculator.substract(6, 3);
        if (checkAdd == 7) {
            System.out.println("OK");

        }
        if (checkSubstract == 3) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }

    }
}
