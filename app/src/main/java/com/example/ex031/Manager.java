package com.example.ex031;

public class Manager extends Employee implements BonusEligible{

    private String department;
    private double managementBonusPercentage;

    public Manager(int employeeId, double baseSalary, String name, String department, double managementBonusPercentage) {
        super(employeeId, baseSalary, name);
        this.department = department;
        this.managementBonusPercentage = managementBonusPercentage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getManagementBonusPercentage() {
        return managementBonusPercentage;
    }

    public void setManagementBonusPercentage(double managementBonusPercentage) {
        this.managementBonusPercentage = managementBonusPercentage;
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * this.managementBonusPercentage;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary();
    }

    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "department='" + department + '\'' +
                ", managementBonusPercentage=" + managementBonusPercentage +
                '}';
    }
}
