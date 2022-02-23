package com;


public class EmployeeWage {
    int dailyWage;
    int fullDayHour = 8;
    int partTimeHour = 4;
    int wagePerHour;
    int maxWorkingDays;
    int monthlyWage = 0;
    int maxWorkingHours;
    int workedHours = 0;

    EmployeeWage(int wagePerHour, int maxWorkingDays, int maxWorkingHours){
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    int isPresent(){
        int isPresent = (int) Math.floor((Math.random() * 10) % 3);
        switch (isPresent) {
            case 1 -> {
//                System.out.println("Employee Present and Full time.");
                workedHours += fullDayHour;
                return 1;
            }
            case 2 -> {
//                System.out.println("Employee Present and Part time.");
                workedHours += partTimeHour;
                return 2;
            }
        }
//        System.out.println("Employee Absent.");
        return 0;
    }

    int dailyWage(){
        dailyWage = 0;
        int isPresent = isPresent();

        switch (isPresent) {
            case 1 -> dailyWage = wagePerHour * fullDayHour;
            case 2 -> dailyWage = wagePerHour * partTimeHour;
        }
        monthlyWage = monthlyWage + dailyWage;
        return dailyWage;
    }

    void calculateMonthlyWage() {
        int workedDays;
        for (workedDays = 1; workedDays <= maxWorkingDays && workedHours <= maxWorkingHours; ) {
            System.out.println("Day " + workedDays + ": Rs. " + dailyWage());
            workedDays += 1;
        }

        System.out.println("\nTotal worked hours: " + workedHours);
        System.out.println("Total worked days: " + (workedDays - 1));
    }

}
