package com.example.ex031;

public class HourlyEmployee extends Employee{

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(int employeeId, double baseSalery, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, baseSalery, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    @Override
    public double calculateMonthlySalary() {
        return this.hoursWorked * this.hourlyRate;
    }
}
