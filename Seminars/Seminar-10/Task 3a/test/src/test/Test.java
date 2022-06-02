package test;

import model.BaseClass;
import model.DerivedClass;

public class Test {

    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
        BaseClass base = derived;
        base.firstMethod();
    }
}
