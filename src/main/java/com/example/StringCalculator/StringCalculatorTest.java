package com.example.StringCalculator;

import com.example.StringCalculator.StringCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


// Test Class to Write Test Cases Before Production
public class StringCalculatorTest {

    @Test
    public void testAdd_EmptyString_ReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

}
