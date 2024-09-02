package org.example.tdd_workshop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void shouldReturnFourWhenOnePlusThree() {
        assertEquals(4, calculator.evaluate("1+3"));
    }
}
