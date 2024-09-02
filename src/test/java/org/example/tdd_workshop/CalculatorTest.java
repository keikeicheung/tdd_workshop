package org.example.tdd_workshop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void shouldReturnFourWhenOnePlusThree() {
        assertEquals(4, calculator.evaluate("1+3"));
    }

    @Test
    public void shouldReturnTwoWhenFiveMinusThree() {
        assertEquals(2, calculator.evaluate("5-3"));
    }

    @Test
    public void shouldReturnFiveWhenFifteenDividedByThree() {
        assertEquals(5, calculator.evaluate("15/3"));
    }

}
