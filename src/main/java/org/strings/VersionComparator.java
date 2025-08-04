package org.strings;

import java.util.Arrays;

public interface VersionComparator {

    static int compare(String str1, String str2) {

        int[] v1 = Arrays.stream(str1.split("\\."))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] v2 = Arrays.stream(str2.split("\\."))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean slapped = false;
        if (v1.length < v2.length) {
            var tmp = v1;
            v1 = v2;
            v2 = tmp;
            slapped = true;
        }

        int i = 0;
        int result = 0;
        while (i < v1.length || i < v2.length) {

            if (i >= v2.length) {
                if (v1[i] > 0) {
                    return slapped ? -1 : 1;
                } else {
                    return 0;
                }
            }

            if (v1[i] < v2[i]) {
                return slapped ? 1 : -1;
            } else if (v1[i] > v2[i]) {
                return slapped ? -1 : 1;
            }
            i++;
        }

        return 0;
    }
}
