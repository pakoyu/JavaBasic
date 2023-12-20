package com.javabasic.lesson05.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the grade for the first subject:");
        Integer sub1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter your grade for the second subject:");
        Integer sub2 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the grade for the third subject:");
        Integer sub3 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the grade for the fourth subject:");
        Integer sub4 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the grade for the fifth subject:");
        Integer sub5 = Integer.parseInt(reader.readLine());

        float gpa = (float) (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
        System.out.println("Grade point average: " + gpa);

        if (gpa >= 10) {
            System.out.println("Enhanced stipend");
        } else if (gpa >= 8) {
            System.out.println("Just a stipend");
        } else {
            System.out.println("No stipend");
        }
    }

}
