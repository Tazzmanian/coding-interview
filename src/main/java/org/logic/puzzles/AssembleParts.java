package org.logic.puzzles;

import java.util.Arrays;
import java.util.List;

public interface AssembleParts {

    static int minimumTime(int numOfParts, List<Integer> list) {
        int[] arrayOfSizes = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arrayOfSizes);
        int accumulatedTime = 0;
        for (int idx = 0; idx < arrayOfSizes.length - 1; idx++) {
            accumulatedTime += (arrayOfSizes[idx] + arrayOfSizes[idx + 1]);
//once assembled, we carry the current time to the next element
//so in the next iteration, the first of the next two parts
//it will already include the total time required
//to assemble the two previous parts
            arrayOfSizes[idx + 1] = arrayOfSizes[idx] + arrayOfSizes[idx + 1];
        }
        return accumulatedTime;
    }
}
