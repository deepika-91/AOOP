package module1A;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.theories.suppliers.TestedOn;

class CoffeeTest {

    @Test
    void testSimpleCoffee() {
        Coffee coffee = new SimpleCoffee();
        assertEquals(5.0, coffee.cost());
        assertEquals("Simple Coffee", coffee.description());
    }

    @Test
    void testCoffeeWithMilk() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        assertEquals(7.0, coffee.cost());
        assertEquals("Simple Coffee, Milk", coffee.description());
    }

    @Test
    void testCoffeeWithoutMilk() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        assertEquals(7.0, coffee.cost());
        assertEquals("Simple Coffee, Milk", coffee.description());
    }

}
