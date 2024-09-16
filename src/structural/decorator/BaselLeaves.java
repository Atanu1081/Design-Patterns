package structural.decorator;

public class BaselLeaves extends ToppingsDecorator{

    BasePizza basePizza;

    public BaselLeaves(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
