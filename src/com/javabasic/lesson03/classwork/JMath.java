package com.javabasic.lesson03.classwork;

public class JMath {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);
        System.out.println(Math.sqrt(pi));
        System.out.println(Math.pow(pi, 2));
        System.out.println(Math.pow(2, 8));

        float f1 = 42.424242f;
        System.out.println(Math.round(f1));

        float f2 = 42.524242f;
        System.out.println(Math.round(f2));

        int max = 100;
        int min = -20;
        int random = (int) ((Math.random() * (max - min)) + min);
        System.out.println(random);

    }
}
