package com.javabasic.lesson08.homework;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {
    public static final int numberOfArray = 21;

    public static final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public static void main(String[] args) throws IOException {
        String[]  strings = new String[numberOfArray];

        for (int i = 0; i < strings.length; i++) {
            System.out.print("Input string " + (i+1) + " : ");
            strings[i] = READER.readLine();
        }

        String[]  strings1 = new String[numberOfArray/2];
//        String[]  strings2 = new String[numberOfArray - numberOfArray/2];
        String[]  strings2 = new String[numberOfArray - strings1.length];

        for (int i = 0; i < strings.length; i++) {
            if (i < strings1.length) {
                strings1[i] = strings[i];
            } else {
                strings2[i - strings1.length] = strings[i];
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(strings2));
    }
}
