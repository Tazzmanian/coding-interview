package org.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void reverseText_shouldReverseString_whenNotNullAndEmpty() {
        assertEquals("tset", StringUtils.reverseText("test"));
    }

}