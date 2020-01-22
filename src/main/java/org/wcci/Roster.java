package org.wcci;

import java.util.ArrayList;

public class Roster {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void hire(Employee testEmployee) {
        employeeList.add(testEmployee);
    }

    public ArrayList<Employee> retrieveEmployeeList() {
        return employeeList;
    }

    public void payAllEmployees() {
        for (Employee employeeToBePaid : employeeList) {
            employeeToBePaid.recievePay();
        }
    }
}
