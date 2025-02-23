package main.java.Enum;
import main.java.Class.Meal;

public enum MealEnum {
    borsch(new Meal("borsch", 20, 320)),
    berryPie(new Meal("berryPie", 25, 200)),
    buckwheat(new Meal("buckwheat", 30, 250));

    private final Meal meal;


    MealEnum(Meal meal) {
        this.meal = meal;
    }


    public Meal getMeal() {
        return meal;
    }
}