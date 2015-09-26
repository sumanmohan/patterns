import components.Beverage;
import concretecomponents.DarkRoast;
import concretedecorators.Mocha;
import concretedecorators.Soy;
import org.testng.annotations.*;

import java.math.BigDecimal;

import static org.testng.Assert.*;

public class StarbuzzCoffeeTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Before Class");
    }

    @Test
    public void darkRoastWithMochaAndSoyTest(){
        double totalCost=4.80;
        Beverage darkRoastWithMochaAndSoy = new Mocha(new Soy(new DarkRoast()));
        assertEquals(darkRoastWithMochaAndSoy.cost(), totalCost);
        assertEquals(darkRoastWithMochaAndSoy.getDescription(), "Dark Roast Soy Mocha ");

    }


}
