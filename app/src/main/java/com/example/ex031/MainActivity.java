package com.example.ex031;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Employee> allEmployees = new ArrayList<>();
        Manager m1 = new Manager(1234,5000, "Shalom", "logistic", 0.06);
        Manager m2 = new Manager(5678,6000, "Jef", "IT", 0.04);
        Salesperson sp1 = new Salesperson(4572,2000, "Joe", 0.5, 700);
        Salesperson sp2 = new Salesperson(8910,2500, "Max", 0.3, 1500);
        HourlyEmployee he1 = new HourlyEmployee(5703,1000, "George", 8, 30.5);
        HourlyEmployee he2 = new HourlyEmployee(7932,1500, "Isaac", 9, 32.4);
        allEmployees.add(m1);
        allEmployees.add(m2);
        allEmployees.add(sp1);
        allEmployees.add(sp2);
        allEmployees.add(he1);
        allEmployees.add(he2);

        for(Employee employee : allEmployees)
        {
            System.out.println(employee);
            System.out.println("Monthly salary is: " + employee.calculateMonthlySalary());

        }
        double totalBonuses = 0;
        for(Employee employee : allEmployees)
        {
            if(employee instanceof BonusEligible)
            {
                BonusEligible bonus = (BonusEligible) employee;
                totalBonuses += bonus.calculateBonus();
            }
        }
        System.out.println("The sum of all the bonuses of the employees in the array list is: " + totalBonuses);
    }

}