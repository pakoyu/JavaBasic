package com.javabasic.lesson08.homework;

public class Task06 {
    public static void main(String[] args) {
        double[] array = new double[10];
        setValueArray(array);
        printMaxProbability(array);

    }

    public static void setValueArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
    }

    public static void printMaxProbability(double[] array) {
        double max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count = i;
            }
        }
        System.out.println("Number: " + count);
        System.out.println("Probability: " + Math.round(max * 100) + "%");
    }
}
