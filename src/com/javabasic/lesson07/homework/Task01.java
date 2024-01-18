package com.javabasic.lesson07.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static final int MIN = 0;
    public static final int MAX = 10;

    public static final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public static void main(String[] args) throws IOException {
        int random = randomInt(MIN, MAX);
        while (true) {
            System.out.print("Enter number: ");
            int value = Integer.parseInt(READER.readLine());
            if (value == random) {
                System.out.println("Win");
                break;
            } else {
                System.out.println("Loss");
            }
        }

    }

    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
