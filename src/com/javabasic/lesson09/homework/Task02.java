package com.javabasic.lesson09.homework;

import java.util.Arrays;

public class Task02 {

    public static final int MIN_RANDOM = -10;
    public static final int MAX_RANDOM = 10;
    public static final int LENGTH_ARRAY= 10;
    public static final int VALUE = 0;

    public static void main(String[] args) {
        int[] array = new int[LENGTH_ARRAY];
        setValueArray(array, MIN_RANDOM, MAX_RANDOM);
        movingValue(array, VALUE);
        System.out.println(Arrays.toString(array));

    }

    public static void movingValue(int[] array, int value) {
        for (int j = 0; j < array.length; j++) {
            for (int i = j; i < array.length; i++) {
                if (array[i] == value) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void setValueArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt(min, max);
        }
    }
}
