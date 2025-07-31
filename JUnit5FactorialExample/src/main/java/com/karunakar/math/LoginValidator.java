package com.karunakar.math;

public class LoginValidator {

    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    public static boolean validate(String username, String password) {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username or password cannot be null");
        }
        if (username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Username or password cannot be empty");
        }
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}
