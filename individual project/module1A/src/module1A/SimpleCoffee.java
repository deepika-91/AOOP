package module1A;

class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0; // Base cost of plain coffee
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}