package org.strings;

public class Strings {

    public static void main(String[] args) {
        // literals
        String str = "literal";
        // heap
        String str1 = new String("heap");
        // concat
        String str2 = str1 + " " + str;

        // StringBuilder
        StringBuilder stringOnTheFly = new StringBuilder();
        stringOnTheFly.append(str2).append("chars.");
    }
}
