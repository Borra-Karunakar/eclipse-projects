package com.karunakar.math;

public class FactorialUtil {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
