package module1A;
class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 3.0; // Adding cost of whip
    }

    @Override
    public String description() {
        return super.description() + ", Whip";
    }
}
