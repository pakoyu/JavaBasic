package com.javabasic.lesson10.homework;

import java.util.Arrays;

public class Task02 {
    public static final int MIN_RANDOM = -100;
    public static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        int sizeOfMatrixRow = 4;
        int sizeOfMatrixColumn = 8;
        int[][] matrix = new int[sizeOfMatrixRow][sizeOfMatrixColumn];

        setValueMatrix(matrix, MIN_RANDOM, MAX_RANDOM);
        printMatrix(matrix);
        System.out.println();
        printIndexNegativeValue(matrix);

    }

    public static void printIndexNegativeValue(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print(" " + i + ":" + j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] mx : matrix) {
            System.out.println(Arrays.toString(mx));

        }
    }

    public static void setValueMatrix(int[][] matrix, int min, int max) {
        for (int[] array : matrix) {
            for (int i = 0; i < array.length; i++) {
                array[i] = randomInt(min, max);
            }
        }
    }

    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
