package org.wcci;

public class Employee {
    private int salary;
    private String name;
    private boolean paidStatus;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void changeSalary(int newSalary) {
        salary = newSalary;
    }

    public boolean getPaidStatus()  {
        return paidStatus;
    }

    public void recievePay() {
        paidStatus = true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", paidStatus=" + paidStatus +
                '}';
    }
}
