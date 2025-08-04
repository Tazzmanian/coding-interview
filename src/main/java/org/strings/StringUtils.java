package org.strings;

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
}
