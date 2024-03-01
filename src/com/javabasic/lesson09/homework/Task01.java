package com.javabasic.lesson09.homework;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static final int MIN = 0;
    public static final int MAX = 10;
    public static final int LENGTH_ARRAY = 7;

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] firstArray = new int[LENGTH_ARRAY];
        int[] secondArray = new int[LENGTH_ARRAY];

        setRandomValueArray(firstArray, MIN, MAX);
        inputUserValueArray(secondArray);

        bubbleSortIntArray(firstArray);
        bubbleSortIntArray(secondArray);

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        System.out.println("Количество совпадений: " + countMatches(firstArray, secondArray));

    }

    public static void inputUserValueArray(int[] array) throws IOException {
        System.out.println("Введите " + LENGTH_ARRAY + " чисел от " + MIN + " до " + (MAX - 1));
        for (int i = 0; i < LENGTH_ARRAY; i++) {
            int value;
            while (true) {
                try {
                    System.out.print("Введите число: ");
                    value = Integer.parseInt(READER.readLine());
                    if (value < MIN || value > MAX) {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
                break;
            }
            array[i] = value;
        }
    }

    public static int countMatches(int[] firstArray, int[] secondArray) {
        int counter = 0;
        for (int i = 0; i < secondArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                counter++;
            }
        }
        return counter;
    }

    public static void bubbleSortIntArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                int tmp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void setRandomValueArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt(min, max);
        }
    }
}
