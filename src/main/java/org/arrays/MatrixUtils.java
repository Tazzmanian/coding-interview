package org.arrays;

public interface MatrixUtils {

    static int[][] rotate90 (int[][] matrix) {
        int[][] rotated = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotated[j][i] = matrix[i][j];
            }
        }

        return rotated;
    }
}
