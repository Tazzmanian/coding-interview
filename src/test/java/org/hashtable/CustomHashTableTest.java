package org.hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomHashTableTest {

    CustomHashTable<String, String> hashTable = new CustomHashTable<>();

    @Test
    public void hashTest() {
        Assertions.assertEquals(8, hashTable.hashTheKey("DAB"));
        Assertions.assertEquals(15, hashTable.hashTheKey("ACE"));
    }

    @Test
    public void getTest() {
        hashTable.put("DAB", "Atlanta");
        hashTable.put("ABC", "Chicago");
        hashTable.put("CAD", "Dallas");
        hashTable.put("BAD", "Detroit");
        Assertions.assertEquals("Atlanta", hashTable.get("DAB"));
    }
}