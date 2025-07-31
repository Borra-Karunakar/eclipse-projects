package com.karunakar.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void testReverseRegularString() {
        assertEquals("olleh", StringUtil.reverse("hello"));
        assertEquals("321cba", StringUtil.reverse("abc123"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", StringUtil.reverse(""));
    }

    @Test
    public void testReverseNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.reverse(null);
        });
    }
}
