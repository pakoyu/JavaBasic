package com.javabasic.lesson04.classwork;

public class SalaryMethod {
    public static void main(String[] args) {
        int years = 10;
        float tax = 5.0f;
        float salaryEmployeeFirst = 3000.00f;
        float salaryEmployeeSecond = 4500.00f;
        float salaryEmployeeThird = 5800.00f;

        float tenYearsSalaryEmployeeFirst =  totalEarnings(salaryEmployeeFirst, years);
        float tenYearsSalaryEmployeeSecond =  totalEarnings(salaryEmployeeSecond, years);
        float tenYearsSalaryEmployeeThird =  totalEarnings(salaryEmployeeThird, years);

        System.out.println("Ten Years Salary Employee First - " + tenYearsSalaryEmployeeFirst);
        System.out.println("Ten Years Salary Employee Second - " + tenYearsSalaryEmployeeSecond);
        System.out.println("Ten Years Salary Employee Third - " + tenYearsSalaryEmployeeThird);

        float netTenYearsSalaryEmployeeFirst =  totalEarnings(salaryEmployeeFirst, years) - calcTax(tax,tenYearsSalaryEmployeeFirst);
        float netTenYearsSalaryEmployeeSecond =  totalEarnings(salaryEmployeeSecond, years) - calcTax(tax,tenYearsSalaryEmployeeSecond);
        float netTenYearsSalaryEmployeeThird =  totalEarnings(salaryEmployeeThird, years) - calcTax(tax,tenYearsSalaryEmployeeThird);

        System.out.println("Net Ten Years Salary Employee First - " + netTenYearsSalaryEmployeeFirst);
        System.out.println("Net Ten Years Salary Employee Second - " + netTenYearsSalaryEmployeeSecond);
        System.out.println("Net Ten Years Salary Employee Third - " + netTenYearsSalaryEmployeeThird);

        float averageSalaryEmployees = (netTenYearsSalaryEmployeeFirst + netTenYearsSalaryEmployeeSecond + netTenYearsSalaryEmployeeThird) / 3;
        System.out.println("Average Salary Employees - " + averageSalaryEmployees);
    }

    public static float calcTax(float tax, float salary) {
        return salary * tax / 100;
    }
    public static float totalEarnings (float salary, int years){
        int monthInYear = 12;
        return salary * years * monthInYear;
    }
}