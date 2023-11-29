package com.javabasic.lesson04.classwork;

public class Salary {
    public static void main(String[] args) {
        float salaryEmployeeFirst = 1500.00f;
        float salaryEmployeeSecond = 1000.10f;
        float salaryEmployeeThird = 999.99f;

        System.out.println(salaryEmployeeFirst);
        System.out.println(salaryEmployeeSecond);
        System.out.println(salaryEmployeeThird);

        float TenYearsSalaryEmployeeFirst = salaryEmployeeFirst * 10 * 12;
        float TenYearsSalaryEmployeeSecond = salaryEmployeeSecond * 10 * 12;
        float TenYearsSalaryEmployeeThird = salaryEmployeeThird * 10 * 12;

        System.out.println(TenYearsSalaryEmployeeFirst );
        System.out.println(TenYearsSalaryEmployeeSecond);
        System.out.println(TenYearsSalaryEmployeeThird );

        float netIncomeTenYearsEmployeeFirst = TenYearsSalaryEmployeeFirst * 0.95f;
        float netIncomeTenYearsEmployeeSecond = TenYearsSalaryEmployeeSecond * 0.95f;
        float netIncomeTenYearsEmployeeThird = TenYearsSalaryEmployeeThird * 0.95f;

        System.out.println(netIncomeTenYearsEmployeeFirst );
        System.out.println(netIncomeTenYearsEmployeeSecond);
        System.out.println(netIncomeTenYearsEmployeeThird );

        float averageSalaryEmployeeFirst = netIncomeTenYearsEmployeeFirst / 10 / 12;
        float averageSalaryEmployeeSecond = netIncomeTenYearsEmployeeSecond / 10 / 12;
        float averageSalaryEmployeeThird = netIncomeTenYearsEmployeeThird / 10 / 12;

        System.out.println(averageSalaryEmployeeFirst );
        System.out.println(averageSalaryEmployeeSecond);
        System.out.println(averageSalaryEmployeeThird );
    }
}
