import components.Beverage;
import concretecomponents.DarkRoast;
import concretedecorators.Mocha;
import concretedecorators.Soy;

public class StarbuzzCoffee {
    public static void main(String[] args) {

        Beverage darkRoastWithSoy = new Soy(new DarkRoast());
        System.out.println("Your order is - " + darkRoastWithSoy.getDescription());
        System.out.println("Total Cost = " + darkRoastWithSoy.cost());

        Beverage darkRoastWithMochaAndSoy = new Mocha(new Soy(new DarkRoast()));
        System.out.println("Your order is - " + darkRoastWithMochaAndSoy.getDescription());
        System.out.println("Total Cost = " + darkRoastWithMochaAndSoy.cost());

    }
}
