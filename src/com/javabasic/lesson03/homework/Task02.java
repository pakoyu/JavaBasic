package com.javabasic.lesson03.homework;

public class Task02 {
    public static void main(String[] args) {
        float a = -4.2F;
        float b = 42.0F;
        float c = 42.42F;

        // | a- b | / (a + b) ^3 - √c
        double result  = Math.abs(a-b) / Math.pow((a+b), 3) - Math.sqrt(c);

        System.out.println(result);
    }
}
