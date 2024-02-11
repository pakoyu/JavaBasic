package com.javabasic.lesson08.homework;

public class Task05 {
    public static void main(String[] args) {
        final String pin = "9999";
        final String sym = "0123456789";
        int count = 0;
        StringBuffer rezult = new StringBuffer();

        for (int i = 0; i < pin.length(); i++) {
            for (int j = 0; j < sym.length(); j++) {
                count++;
                if (pin.charAt(i) == sym.charAt(j)) {
                    rezult.append(sym.charAt(j));
                    break;
                }
            }
        }
        System.out.println("Pin: " + rezult);
        System.out.println("Number of iterations: " + count);
    }
}
