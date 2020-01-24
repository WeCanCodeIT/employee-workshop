package org.wcci;

public class Executive extends SalaryAssociate implements Bonusable {


    public Executive(String name, int payRate) {
        super(name, payRate);
    }
    @Override
    public void recieveBonus(int amount){
        payCheckAmount += amount;
    }
}
