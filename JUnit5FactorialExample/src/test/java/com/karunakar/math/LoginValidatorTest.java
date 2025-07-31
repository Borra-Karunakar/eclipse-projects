package com.karunakar.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginValidatorTest {

    @Test
    public void testValidCredentials() {
        assertTrue(LoginValidator.validate("admin", "password123"));
    }

    @Test
    public void testInvalidCredentials() {
        assertFalse(LoginValidator.validate("user", "wrongpass"));
        assertFalse(LoginValidator.validate("admin", "wrongpass"));
        assertFalse(LoginValidator.validate("wronguser", "password123"));
    }

    @Test
    public void testEmptyInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            LoginValidator.validate("", "password123");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            LoginValidator.validate("admin", "");
        });
    }

    @Test
    public void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            LoginValidator.validate(null, "password123");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            LoginValidator.validate("admin", null);
        });
    }
}
