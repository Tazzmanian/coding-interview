package org.strings;

import java.util.Stack;

public interface StringUtils {

    //  reverse the order of the characters in an efficient manner.
    static String reverseText(String str) {
        char[] chars = str.toCharArray();
        final int arrayLength = chars.length;
        for (int i = 0; i < arrayLength / 2; i++) {
            var tmp = chars[i];
            chars[i] = chars[arrayLength - i - 1];
            chars[arrayLength - i - 1] = tmp;
        }
        return String.valueOf(chars);
    }

    static boolean hasUniqueCharacters(String str) {
        if (str.length() > 128)
            return false;

        boolean[] booleans = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            if (booleans[value]) {
                return false;
            }
            booleans[value] = true;
        }
        return true;
    }

    static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static String reverseWithStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        char[] arr = new char[str.length()];
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i++] = stack.pop();
        }

        return String.valueOf(arr);
    }
}
