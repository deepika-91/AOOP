package module1A;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Composition to decorate the coffee

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost(); // Delegate to the wrapped object
    }

    @Override
    public String description() {
        return coffee.description(); // Delegate to the wrapped object
    }
}
