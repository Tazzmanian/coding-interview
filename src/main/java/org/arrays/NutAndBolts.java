package org.arrays;

import java.util.HashMap;
import java.util.Map;

public interface NutAndBolts {

    static void match(char[] nuts, char[] bolts) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<nuts.length; i++) {
            map.put(nuts[i],i);
        }

        for (int i=0; i<bolts.length; i++) {
            if (map.containsKey(bolts[i])) {
                nuts[i] = bolts[i];
            }
        }
    }
}
