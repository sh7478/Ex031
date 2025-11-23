package com.example.ex031;

public class Salesperson extends Employee{

    private double salesCommission;
    private double totalSales;

    public Salesperson(int employeeId, double baseSalery, String name) {
        super(employeeId, baseSalery, name);
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalery() + (this.totalSales * this.salesCommission);
    }

    public double calculateBonus()
    {
        return this.totalSales*0.05;
    }
}
