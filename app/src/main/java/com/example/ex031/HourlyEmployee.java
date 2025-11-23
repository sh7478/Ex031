package com.example.ex031;

public class HourlyEmployee extends Employee{

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(int employeeId, double baseSalary, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, baseSalary, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + "HourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    @Override
    public double calculateMonthlySalary() {
        return this.hoursWorked * this.hourlyRate;
    }
}
