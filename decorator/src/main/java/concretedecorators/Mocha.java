package concretedecorators;

import components.Beverage;
import decorators.CondimentDecorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator{

    Beverage beverage;
    private String description = "Mocha ";
    private double cost = 2.1;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + description;
    }

    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(cost));
    }


}
