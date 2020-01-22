package org.wcci;

import java.util.Scanner;

public class PayrollApplication {
    public static void main(String[] args) {
        Employee shoeShiner = new Employee("Roger", 2000);
        Employee shoeShinerExecutive = new Employee("Bill", 200000);

        Roster employeeRoster = new Roster();
        employeeRoster.hire(shoeShiner);
        employeeRoster.hire(shoeShinerExecutive);
        System.out.println("Here are our employees:");
        System.out.println(employeeRoster.retrieveEmployeeList());

        System.out.println("Hire a new employee!  What's their name?");
        Scanner input = new Scanner(System.in);
        String enployeeName = input.nextLine();
        System.out.println("What's their salary?");
        int salary = input.nextInt();
        input.nextLine();
        employeeRoster.hire(new Employee(enployeeName, salary));

        System.out.println("This is our new roster:");
        for(Employee employee :employeeRoster.retrieveEmployeeList()){
            System.out.println(employee);
        }
        employeeRoster.payAllEmployees();
        for(Employee employee :employeeRoster.retrieveEmployeeList()){
            System.out.println(employee);
        }
//        System.out.println(employeeRoster.retrieveEmployeeList());

    }
}
