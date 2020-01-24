package org.wcci;

public abstract class HourlyAssociate extends Employee  {
    private int weeklyHours;

    public HourlyAssociate(String name, int payRate, int weeklyHours) {
        super(name, payRate);
        this.weeklyHours = weeklyHours;
    }

    @Override
    public void recievePay(){
        payCheckAmount += payRate * weeklyHours;
    }
}
