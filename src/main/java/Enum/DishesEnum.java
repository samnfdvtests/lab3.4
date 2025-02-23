package main.java.Enum;

import main.java.Class.Dish;

public enum DishesEnum {
    PLATE(new Dish("plate", "silver", false)),
    FORK(new Dish("fork", "steel", false)),
    SPOON(new Dish("spoon", "steel", false)),
    GLASS(new Dish("glass", "glass", true));

    private final Dish dish;


    DishesEnum(Dish dish) {
        this.dish = dish;
    }


    public Dish getDish() {
        return dish;
    }
}