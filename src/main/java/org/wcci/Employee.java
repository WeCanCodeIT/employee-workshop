package org.wcci;

public abstract class Employee {
    protected int payRate;
    private String name;
    protected int payCheckAmount;

    public Employee(String name, int payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public int getPayRate() {
        return payRate;
    }

    public void changeSalary(int newSalary) {
        payRate = newSalary;
    }

    public int getPayCheckAmount()  {
        return payCheckAmount;
    }

    public abstract void recievePay();

    @Override
    public String toString() {
        return "Employee{" +
                "payRate = $" + payRate +
                ", name = '" + name + '\'' +
                ", payCheckAmount = $" + payCheckAmount +
                '}';
    }
}
