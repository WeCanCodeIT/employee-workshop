package org.wcci;

public class Sales extends HourlyAssociate implements Bonusable {
    public Sales(String name, int salary, int weeklyHours) {
        super(name, salary, weeklyHours);
    }

    @Override
    public void recieveBonus(int amount){
        payCheckAmount += amount;
    }
}
