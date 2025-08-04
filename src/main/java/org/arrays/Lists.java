package org.arrays;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> listOfCities = new ArrayList<>();
        listOfCities.add("New York");
        listOfCities.add("Berlin");
        listOfCities.add("Paris");
        listOfCities.add("Berlin");
        //Traversing list through the for-each loop
        for (String city : listOfCities)
            System.out.println(city);
    }
}
