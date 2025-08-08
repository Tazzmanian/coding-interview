package org.coding.challenges;

import lombok.Data;

import java.util.*;

@Data
public class BasketOptimized {

    public double[][] fill(double[][] myProducts, double budget) {
        Arrays.sort(myProducts, Collections.reverseOrder(
                Comparator.comparingDouble(a -> a[2])));
        int len = myProducts.length;
        double[][] mostValuableProducts = new double[len][3];
        double sum = 0;
        for (int idx = 0; idx < len; idx++) {
            sum = sum + myProducts[idx][1]; //price
            if (sum <= budget) {
                mostValuableProducts[idx][0] =
                        myProducts[idx][0]; //id
                mostValuableProducts[idx][1] =
                        myProducts[idx][1]; //price
                mostValuableProducts[idx][2] =
                        myProducts[idx][2]; //value
            }
        }
        return mostValuableProducts;
    }

    public double[][] fillV2(double[][] myProducts, double budget) {
        int len = myProducts.length;
        int numIterations = (int) Math.pow(2, myProducts.length);
        Map<double[][], Double> combinations = new HashMap<>();

        for (int idx = 0; idx < numIterations; idx++) {
            double[][] subSet = new double[len][];
            double sumPrice = 0;
            double sumValue = 0;
            int i = 0;
            for (int idx2 = 0; idx2 < len; idx2++) {
                if ((idx & (int) Math.pow(2, idx2)) == 0) {
                    subSet[i++] = myProducts[idx2];
                    sumPrice = sumPrice + myProducts[idx2][1];
                    sumValue = sumValue + myProducts[idx2][2];
                }
            }
            if (subSet.length > 0 && sumPrice <= budget) {
                //remove nulls
                subSet = Arrays.stream(subSet)
                        .filter(s -> (s != null && s.length > 0))
                        .toArray(double[][]::new);
                combinations.put(subSet, Double.valueOf(sumValue));
            }
        }

        LinkedHashMap<double[][], Double> reverseSortedMap =
                new LinkedHashMap<>();

        combinations.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap
                        .put(x.getKey(), x.getValue()));

        double[][] mostValueableProducts = reverseSortedMap
                .keySet().iterator().next();
        return mostValueableProducts;
    }
}
