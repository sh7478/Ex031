package com.example.ex031;

public class Salesperson extends Employee implements BonusEligible{

    private double salesCommission;
    private double totalSales;

    public Salesperson(int employeeId, double baseSalery, String name, double salesCommission, double totalSales) {
        super(employeeId, baseSalery, name);
        this.salesCommission = salesCommission;
        this.totalSales = totalSales;
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

    @Override
    public double calculateBonus()
    {
        return this.totalSales*0.05;
    }

    @Override
    public String toString() {
        return super.toString() + "Salesperson{" +
                "salesCommission=" + salesCommission +
                ", totalSales=" + totalSales +
                '}';
    }
}
