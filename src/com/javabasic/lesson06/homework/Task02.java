package com.javabasic.lesson06.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        double firstOperand = Double.parseDouble(reader.readLine());
        System.out.print("Enter operator: ");
        String operator = reader.readLine();
        System.out.print("Enter second number: ");
        double secondOperand = Double.parseDouble(reader.readLine());

        Double result = calculate(firstOperand, operator, secondOperand);

        System.out.println("Result = " + ((result != null) ? result : "This operation is not supported"));
    }

    public static Double calculate(double firstOperand, String operator, double secondOperand) {
        return switch (operator) {
            case "+" -> firstOperand + secondOperand;
            case "-" -> firstOperand - secondOperand;
            case "*" -> firstOperand * secondOperand;
            case "/" -> secondOperand != 0 ? firstOperand / secondOperand : null;
            default -> null;
        };
    }
}