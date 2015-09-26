package components;

import java.math.BigDecimal;

public abstract class Beverage {

    protected String description = "Generic Coffee";

    public void displayIndividualCost(double cost, String description){
        System.out.println("Cost of "+description+ " is = "+ cost);
    }

    public String getDescription(){
        return description;
    }

    public abstract BigDecimal cost();

}
