package concretecomponents;

import components.Beverage;

import java.math.BigDecimal;

public class HouseBlend  extends Beverage {

    private double cost = 0.95;

    public HouseBlend(){
        description = "House Blend ";
    }

    public BigDecimal cost(){
        return BigDecimal.valueOf(cost);
    }
}
