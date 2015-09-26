package concretedecorators;

import components.Beverage;
import decorators.CondimentDecorator;

import java.math.BigDecimal;

public class Milk extends CondimentDecorator {

    Beverage beverage;
    private String description = "Milk ";
    private double cost = 1.35;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + description;
    }

    public BigDecimal cost(){
        return beverage.cost().add(BigDecimal.valueOf(cost));
    }
}
