package org.strings;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class ContainerItems {

    private final String intentory;

    public List<Integer> getItems(List<Integer> startIndices, List<Integer> endIndices) {
        List<Integer> items = new ArrayList<>();

        if (startIndices.size()<1 || startIndices.size()>100000)
            throw new RuntimeException("wrong size in startIndices");

        if (endIndices.size()<1 || endIndices.size()>100000)
            throw new RuntimeException("wrong size in endIndices");

        for (int i = 0; i < startIndices.size(); i++) {
            var start = startIndices.get(i);
            var end = endIndices.get(i);

            if (start < 1 || start > 100000)
                throw new RuntimeException("wrong value at startIndices");

            if (end < 1 || end > 100000)
                throw new RuntimeException("wrong value at endIndices");

            int asterisksTotal = 0;
            boolean beginCount = false;
            int tempAsterisksCount = 0;
            for (char c : intentory.substring(start - 1, end).toCharArray()) {
                if (!beginCount && c == '|') {
                    beginCount = true;
                    continue;
                } else if (beginCount && c == '|') {
                    asterisksTotal += tempAsterisksCount;
                    tempAsterisksCount = 0;
                    continue;
                }

                if (beginCount && c == '*') {
                    tempAsterisksCount++;
                }
            }

            items.add(asterisksTotal);
        }

        return items;
    }

}
