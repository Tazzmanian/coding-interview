package org.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackUtilsTest {
    @Test
    public void incorrect_expressions() {
        assertFalse(StackUtils.isBalanced(null));
        assertFalse(StackUtils.isBalanced(""));
        assertFalse(StackUtils.isBalanced("("));
        assertFalse(StackUtils.isBalanced("(()a]"));
    }

    @Test
    public void correct_expressions() {
        assertTrue(StackUtils.isBalanced("()"));
        assertTrue(StackUtils.isBalanced("([])"));
        assertTrue(StackUtils.isBalanced("{{([])}}"));
        assertTrue(StackUtils.isBalanced("{{a([b])}c}dd"));
        assertTrue(StackUtils.isBalanced("(w*(x+y)/z−(p/(r−q)))"));
    }
}