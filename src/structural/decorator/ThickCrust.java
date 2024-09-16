package structural.decorator;

public class ThickCrust implements BasePizza{
    @Override
    public int cost() {
        return 100;
    }
}
