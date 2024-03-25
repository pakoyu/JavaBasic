package com.javabasic.lesson10.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {
    public static final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public static void main(String[] args) throws IOException {
        System.out.print("Введите число от 0 до 42 : ");
        int value = Integer.parseInt(READER.readLine());
        System.out.println("Факториал числа " + value + " = " + factorial(value));
    }

    public static long factorial(int value) {
        if (value <= 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
}
