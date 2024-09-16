package structural.decorator;

public class ThinCrust implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
