package structural.decorator;

public class Pepperoni extends ToppingsDecorator{

    BasePizza basePizza;

    public Pepperoni(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
}
