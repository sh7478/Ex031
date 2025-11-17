package com.example.ex031;

public abstract class Employee {
    private String name;
    private double baseSalery;
    private final int employeeId;

    public Employee(int employeeId, double baseSalery, String name) {
        this.employeeId = employeeId;
        this.baseSalery = baseSalery;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalery() {
        return baseSalery;
    }

    public void setBaseSalery(double baseSalery) {
        this.baseSalery = baseSalery;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", baseSalery=" + baseSalery +
                ", employeeId=" + employeeId +
                '}';
    }
}
