package org.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixUtilsTest {

    @Test
    public void rotate90_shouldReturnNewMatrix() {
        int[][] matrix = new int[][]{
                {9, 10, 11, 12},
                {16, 17, 18, 19},
                {23, 24, 25, 26},
                {30, 31, 32, 33}};
        int[][] expected = new int[][]{
                {9, 16, 23, 30},
                {10, 17, 24, 31},
                {11, 18, 25, 32},
                {12, 19, 26, 33}};
        var rotated = MatrixUtils.rotate90(matrix);

        assertArrayEquals(expected, rotated);
    }

    @Test
    public void rotate90_shouldReturnNewMatrixAsymmetric() {
        int[][] matrix = new int[][]{
                {9, 10, 11, 12}};
        int[][] expected = new int[][]{
                {9},
                {10},
                {11},
                {12}};
        var rotated = MatrixUtils.rotate90(matrix);

        assertArrayEquals(expected, rotated);
    }

}