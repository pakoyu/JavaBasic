package com.javabasic.lesson06.homework;


public class Task01 {
    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = 100;

        int randomFirst = randomInt(MIN, MAX);
        int randomSecond = randomInt(MIN, MAX);
        int randomThird = randomInt(MIN, MAX);

        System.out.println(Math.min(Math.min(randomFirst, randomSecond), randomThird));

    }

    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
