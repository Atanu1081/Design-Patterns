package structural.adapter.main;

import structural.adapter.adaptee.BabyWeightMachine;
import structural.adapter.adapter.MyAdapterClass;

public class Driver {

    public static void main(String[] args) {
        MyAdapterClass myAdapterClass = new MyAdapterClass(new BabyWeightMachine());
        System.out.println(myAdapterClass.measure());
    }
}
