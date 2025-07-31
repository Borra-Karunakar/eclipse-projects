package com.karunakar.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialUtilTest {

    @Test
    public void testValidFactorials() {
        assertEquals(1, FactorialUtil.factorial(0));
        assertEquals(1, FactorialUtil.factorial(1));
        assertEquals(2, FactorialUtil.factorial(2));
        assertEquals(6, FactorialUtil.factorial(3));
        assertEquals(24, FactorialUtil.factorial(4));
    }

    @Test
    public void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialUtil.factorial(-5);
        });
    }
}
