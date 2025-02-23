package main.java.Class;

import main.java.AbstractClass.DishesAbstract;

public class Dish extends DishesAbstract {
    public Dish(String name, String material, boolean dirty) {
        super(name, material, dirty);
    }

    @Override
    public void gettingDirty() {
        System.out.println("Ребята поели из посуды и она стала грязной");
        dirty = true;
    }
}
