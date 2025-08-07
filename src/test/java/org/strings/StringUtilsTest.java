package org.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void reverseText_shouldReverseString_whenNotNull() {
        assertEquals("tset", StringUtils.reverseText("test"));
    }

    @Test
    public void reverseText_shouldThrowException_whenNull() {
        assertThrows(RuntimeException.class, () -> StringUtils.reverseText(null));
    }

    @Test
    public void hasUniqueCharacters_shouldReturnTrue_whenUniqueChars() {
        assertTrue(StringUtils.hasUniqueCharacters("abc"));
    }

    @Test
    public void hasUniqueCharacters_shouldReturnFalse_whenDuplicateChars() {
        assertFalse(StringUtils.hasUniqueCharacters("abcc"));
    }

    @Test
    public void hasUniqueCharacters_shouldReturnFalse_whenStringLengthIsOver128() {
        assertFalse(StringUtils
                .hasUniqueCharacters("abccaaaaaaaaaaaaaaaaaaaaassssssssaaaaaaaaaaaaaaaaaadddddddddddddddddabccaaaaaaaaaaaaaaaaaaaaassssssssaaaaaaaaaaaaaaaaaaddddddaaaa"));
    }

    @Test
    public void isPalindrome_shouldReturnTrue_whenValid() {
        assertTrue(StringUtils.isPalindrome("madam"));
    }

    @Test
    public void isPalindrome_shouldReturnFalse_whenInvalid() {
        assertFalse(StringUtils.isPalindrome("madama"));
    }

    @Test
    public void reverseWithStack_shouldWork() {
        assertEquals("efac", StringUtils.reverseWithStack("cafe"));
        assertEquals("2312cba", StringUtils.reverseWithStack("abc2132"));
    }

}