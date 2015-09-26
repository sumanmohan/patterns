package concretedecorators;

import components.Beverage;
import decorators.CondimentDecorator;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {

    Beverage beverage;
    private String description = "Soy ";
    private double cost = 1.45;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + description;
    }

    public BigDecimal cost(){
        return beverage.cost().add(BigDecimal.valueOf(cost));
    }
}
