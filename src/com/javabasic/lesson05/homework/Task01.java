package com.javabasic.lesson05.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the grade for the first subject:");
        Integer gradeSubject1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter your grade for the second subject:");
        Integer gradeSubject2 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the grade for the third subject:");
        Integer gradeSubject3 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the grade for the fourth subject:");
        Integer gradeSubject4 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the grade for the fifth subject:");
        Integer gradeSubject5 = Integer.parseInt(reader.readLine());

        float gradePointAverage  = (float) (gradeSubject1 + gradeSubject2 + gradeSubject3 + gradeSubject4 + gradeSubject5) / 5;
        System.out.println("Grade point average: " + gradePointAverage);

        if (gradePointAverage >= 10) {
            System.out.println("Enhanced stipend");
        } else if (gradePointAverage>= 8) {
            System.out.println("Just a stipend");
        } else {
            System.out.println("No stipend");
        }
    }

}
