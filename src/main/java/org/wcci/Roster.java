package org.wcci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Roster {
    private HashMap<String, Employee> employeeList = new HashMap<>();

    public void hire(Employee testEmployee) {
        employeeList.put(testEmployee.getName(),testEmployee);
    }

    public ArrayList<Employee> retrieveEmployeeList() {
        return new ArrayList<>(employeeList.values());
    }

    public void payAllEmployees() {
        for (Employee employeeToBePaid : employeeList.values()) {
            employeeToBePaid.recievePay();
            if(employeeToBePaid instanceof Bonusable){
                ((Bonusable) employeeToBePaid).recieveBonus(100);
            }
        }
    }

    public void changeEmployeeSalary(String employeeToChange, int newSalary) {
        employeeList.get(employeeToChange).changeSalary(newSalary);
    }

    public Employee retrieveEmployee(String employee) {
        return employeeList.get(employee);
    }
}
