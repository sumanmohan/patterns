package concretecomponents;

import components.Beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage {

    private double cost = 1.65;

    public Espresso(){
        description = "Espressp ";
    }

    public BigDecimal cost(){
        return BigDecimal.valueOf(cost);
    }
}
