package org.wcci;

public abstract class SalaryAssociate extends Employee{

    public SalaryAssociate(String name, int payRate) {
        super(name, payRate);
    }

    @Override
    public void recievePay() {
        payCheckAmount += payRate;
    }
}
