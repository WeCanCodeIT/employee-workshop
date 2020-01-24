package org.wcci;

import java.util.Scanner;

public class PayrollApplication {
    public static void main(String[] args) {
        Sales sales = new Sales("Roger", 15, 40);
        Janitor janitor = new Janitor("Bob", 15, 32);
        Executive shoeShinerExecutive = new Executive("Bill", 200000);
        Manager manager = new Manager("Karen", 35000);
        Roster payroll = new Roster();
        payroll.hire(sales);
        payroll.hire(janitor);
        payroll.hire(shoeShinerExecutive);
        payroll.hire(manager);


        System.out.println("Here are our employees:");
        System.out.println(payroll.retrieveEmployeeList());
        payroll.payAllEmployees();
        for (Employee employee : payroll.retrieveEmployeeList()) {
            System.out.println(employee);
        }
        System.out.println(payroll.retrieveEmployeeList());

    }
}
