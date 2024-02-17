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

    @Test
    public void testAdd_OneNumber_ReturnsNumber() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void testAdd_TwoNumbers_ReturnsSum() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    public void testAdd_NewLineBetweenNumbers_ReturnsSum() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    public void testAdd_CustomDelimiter_ReturnsSum() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;\n1;2");
        assertEquals(3, result);
    }

    @Test
    public void testAdd_NegativeNumbers_ThrowsException() {
        StringCalculator calculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.add("-1,2,-3"));
    }

}
