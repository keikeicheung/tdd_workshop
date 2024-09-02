package org.example.tdd_workshop;

public class Calculator {
    public int evaluate(String equation) {
        String[] splitStrings = (equation.split("((?<=[+-/*])|(?=[+-/*]))"));

        return Integer.parseInt(splitStrings[0]) + Integer.parseInt(splitStrings[2]);
    }
}
