package com.example.ex031;

public abstract class Employee {
    private String name;
    private double baseSalary;
    private final int employeeId;

    public Employee(int employeeId, double baseSalary, String name) {
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", employeeId=" + employeeId +
                '}';
    }
}
