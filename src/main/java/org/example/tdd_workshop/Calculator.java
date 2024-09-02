package org.example.tdd_workshop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Calculator {
    public int evaluate(String equation) {
        String[] splitStrings = (equation.split("((?<=[+-/*])|(?=[+-/*]))"));
        List<String> opList = Arrays.asList("+", "-", "/", "*");
        Iterator<String> iterator = Arrays.stream(splitStrings).iterator();
        int currentValue = 0;
        String currentOp = null;
        while(iterator.hasNext()) {
            String value = iterator.next();
            if (opList.contains(value)) {
                currentOp = value;
            } else if (currentOp == null) {
                currentValue = Integer.parseInt(value);
            } else {
                int currentIntValue = Integer.parseInt(value);
                switch (currentOp) {
                    case "+" -> currentValue += currentIntValue;
                    case "-" -> currentValue -= currentIntValue;
                    case "/" -> currentValue /= currentIntValue;
                    case "*" -> currentValue *= currentIntValue;
                    default -> {
                    }
                }
            }
        }
        return currentValue;
    }
}
