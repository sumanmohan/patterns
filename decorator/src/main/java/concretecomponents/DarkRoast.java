package concretecomponents;

import components.Beverage;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

    private double cost = 1.25;

    public DarkRoast(){
        description = "Dark Roast ";
    }

    public BigDecimal cost(){
        return BigDecimal.valueOf(cost);
    }

}
