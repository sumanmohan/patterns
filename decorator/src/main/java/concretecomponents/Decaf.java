package concretecomponents;

import components.Beverage;

import java.math.BigDecimal;

public class Decaf extends Beverage {

    private double cost = 1.05;

    public Decaf(){
        description = "Decaf ";
    }

    public BigDecimal cost(){
        return BigDecimal.valueOf(cost);
    }
}
