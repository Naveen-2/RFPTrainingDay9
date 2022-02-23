package com;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        Company company1 = new Company("Company A",50,22,150);
        company1.calculateMonthlyWage();
        Company company2 = new Company("Company B",40,26,230);
        company2.calculateMonthlyWage();
    }
}
