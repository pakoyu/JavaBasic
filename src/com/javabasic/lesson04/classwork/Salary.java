package com.javabasic.lesson04.classwork;

public class Salary {
    public static void main(String[] args) {
        int years = 10;
        int month = 12;
        float tax = 5.0f;
        float salaryEmployeeFirst = 1500.00f;
        float salaryEmployeeSecond = 1000.10f;
        float salaryEmployeeThird = 999.99f;

        System.out.println(salaryEmployeeFirst);
        System.out.println(salaryEmployeeSecond);
        System.out.println(salaryEmployeeThird);

        float TenYearsSalaryEmployeeFirst = salaryEmployeeFirst * years * month;
        float TenYearsSalaryEmployeeSecond = salaryEmployeeSecond * years * month;
        float TenYearsSalaryEmployeeThird = salaryEmployeeThird * years * month;

        System.out.println(TenYearsSalaryEmployeeFirst);
        System.out.println(TenYearsSalaryEmployeeSecond);
        System.out.println(TenYearsSalaryEmployeeThird);

        float netSalaryTenYearsEmployeeFirst = TenYearsSalaryEmployeeFirst * tax / 100;
        float netSalaryTenYearsEmployeeSecond = TenYearsSalaryEmployeeSecond * tax / 100;
        float netSalaryTenYearsEmployeeThird = TenYearsSalaryEmployeeThird * tax / 100;

        System.out.println(netSalaryTenYearsEmployeeFirst);
        System.out.println(netSalaryTenYearsEmployeeSecond);
        System.out.println(netSalaryTenYearsEmployeeThird);

        double averageSalary = (netSalaryTenYearsEmployeeFirst +
                netSalaryTenYearsEmployeeSecond +
                netSalaryTenYearsEmployeeThird) / 3;

        System.out.println(averageSalary);
    }
}
