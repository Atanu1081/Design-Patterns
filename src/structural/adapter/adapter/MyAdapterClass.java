package structural.adapter.adapter;

import structural.adapter.adaptee.BabyWeightMachine;

public class MyAdapterClass implements MyAdapter{

    BabyWeightMachine babyWeightMachine;

    public MyAdapterClass(BabyWeightMachine babyWeightMachine) {
        this.babyWeightMachine = babyWeightMachine;
    }

    @Override
    public int measure() {
        return babyWeightMachine.measure() * 2;
    }
}
