package module1A;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0; // Adding cost of sugar
    }

    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}
