package com.javabasic.lesson10.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task01 {
    public static final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public static void main(String[] args) throws IOException {
        int[][] matrix = createMatrix();
        inputValueMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
        printMatrix(transposeMatrix(matrix));
    }

    public static int[][] createMatrix() throws IOException {
        System.out.print("Enter number rows : ");
        int sizeOfMatrixRow = Integer.parseInt(READER.readLine());
        System.out.print("Enter number column : ");
        int sizeOfMatrixColumn = Integer.parseInt(READER.readLine());
        return new int[sizeOfMatrixRow][sizeOfMatrixColumn];
    }

    private static void inputValueMatrix(int[][] matrix) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Enter " + matrix[i].length + " values of the row " + (i + 1) + " by delimiter ','");
            String[] str = READER.readLine().split(",");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(str[j]);
            }
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transmatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < transmatrix.length; j++) {
                transmatrix[j][i] = matrix[i][j];
            }
        }
        return transmatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] mx : matrix) {
            System.out.println(Arrays.toString(mx));
        }
    }

}
