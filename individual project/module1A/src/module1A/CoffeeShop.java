package module1A;

public class CoffeeShop {
    public static void main(String[] args) {
        // Start with a simple coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("Description: " + myCoffee.description() + ", Cost: $" + myCoffee.cost());

        // Add milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println("Description: " + myCoffee.description() + ", Cost: $" + myCoffee.cost());

        // Add sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println("Description: " + myCoffee.description() + ", Cost: $" + myCoffee.cost());

        // Add whip
        myCoffee = new WhipDecorator(myCoffee);
        System.out.println("Description: " + myCoffee.description() + ", Cost: $" + myCoffee.cost());
    }
}
