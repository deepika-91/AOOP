package module1A;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0; // Adding cost of milk
    }

    @Override
    public String description() {
        return super.description() + ", Milk";
    }
}
