package com.javabasic.lesson07.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task03 {

    public static final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.print("Enter number of cars: ");
        final int numberOfCars= Integer.parseInt(READER.readLine());

        forLoop(numberOfCars);
        System.out.println();
        whileLoop(numberOfCars);
    }

    private static void forLoop(int numberOfCars) {
        for (int i = 1; i <= numberOfCars; i++) {
            soap(i);
            wash(i);
            dry(i);
        }
    }

    private static void whileLoop(int numberOfCars) {
        int k = 0;
        while (k < numberOfCars) {
            soap(k);
            wash(k);
            dry(k);
            k++;
        }
    }

    public static void soap(int n) {
        System.out.println("Машина " + n + " намылена");
    }

    public static void wash(int n) {
        System.out.println("Машина " + n + " помыта");
    }

    public static void dry(int n) {
        System.out.println("Машина " + n + " высушена");
    }
}
