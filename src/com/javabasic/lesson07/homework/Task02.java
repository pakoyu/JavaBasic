package com.javabasic.lesson07.homework;

public class Task02 {
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static void main(String[] args) {
        for (int i = MIN; i <= MAX; i++) {
            if (!Integer.toString(i).contains("4") && !Integer.toString(i).contains("9")) {
                System.out.println(i);
            }

        }
    }
}
