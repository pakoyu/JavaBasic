package com.javabasic.lesson04.classwork;

public class SalaryMethod {
    public static void main(String[] args) {
        int years = 10;
        int month = 12;
        float tax = 5.0f;
        float salaryEmployeeFirst = 1500.00f;
        float salaryEmployeeSecond = 1000.10f;
        float salaryEmployeeThird = 999.99f;
    }
    public float calcTax(float tax, float salary) {
        return salary * tax / 100;
    }
}