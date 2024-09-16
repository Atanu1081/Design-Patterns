package structural.adapter.adaptee;

public class BabyWeightMachine implements WeightMachine{
    @Override
    public int measure() {
        return 10;
    }
}
