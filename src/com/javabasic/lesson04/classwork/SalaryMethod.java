package com.javabasic.lesson04.classwork;

public class SalaryMethod {
    public static void main(String[] args) {
        float tax = 5.0f;
        float salaryEmployeeFirst = 3000.00f;
        float salaryEmployeeSecond = 4500.00f;
        float salaryEmployeeThird = 5800.00f;

        float tenYearsSalaryEmployeeFirst =  TenYearsSalary(salaryEmployeeFirst);
        float tenYearsSalaryEmployeeSecond =  TenYearsSalary(salaryEmployeeSecond);
        float tenYearsSalaryEmployeeThird =  TenYearsSalary(salaryEmployeeThird);

        System.out.println("Ten Years Salary Employee First - " + tenYearsSalaryEmployeeFirst);
        System.out.println("Ten Years Salary Employee Second - " + tenYearsSalaryEmployeeSecond);
        System.out.println("Ten Years Salary Employee Third - " + tenYearsSalaryEmployeeThird);

        float netTenYearsSalaryEmployeeFirst =  TenYearsSalary(salaryEmployeeFirst) - calcTax(tax,tenYearsSalaryEmployeeFirst);
        float netTenYearsSalaryEmployeeSecond =  TenYearsSalary(salaryEmployeeSecond) - calcTax(tax,tenYearsSalaryEmployeeSecond);
        float netTenYearsSalaryEmployeeThird =  TenYearsSalary(salaryEmployeeThird) - calcTax(tax,tenYearsSalaryEmployeeThird);

        System.out.println("Net Ten Years Salary Employee First - " + netTenYearsSalaryEmployeeFirst);
        System.out.println("Net Ten Years Salary Employee Second - " + netTenYearsSalaryEmployeeSecond);
        System.out.println("Net Ten Years Salary Employee Third - " + netTenYearsSalaryEmployeeThird);

        float averageSalaryEmployees = (netTenYearsSalaryEmployeeFirst + netTenYearsSalaryEmployeeSecond + netTenYearsSalaryEmployeeThird) / 3;
        System.out.println("Average Salary Employees - " + averageSalaryEmployees);
    }

    public static float calcTax(float tax, float salary) {
        return salary * tax / 100;
    }
    public static float TenYearsSalary (float salary){
        int years = 10;
        int monthInYear = 12;
        return salary * years * monthInYear;
    }
}