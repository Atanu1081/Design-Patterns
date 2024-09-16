package structural.decorator;

public class Driver {

    public static void main(String[] args) {
        BasePizza pizza1 = new ThickCrust();
        System.out.println(pizza1.cost());

        BasePizza pizza2 = new BaselLeaves(new Pepperoni(new ThinCrust()));
        System.out.println(pizza2.cost());
    }
}
