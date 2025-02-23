package main.java.Class;

import main.java.AbstractClass.Character;

public class Goat extends Character {
    public Goat(String name, boolean alive, int weight) {
        super(name, alive, weight);
    }

    @Override
    public void walk(String location) {
        System.out.println(name + " отправилися в " + location);
        setWeight(getWeight() - 1, name);
    }


    @Override
    public void eat(String food1, String food2) {
        System.out.println(name + " съел " + food1 + ',' + food2);
        setWeight(getWeight() + 3, name);
    }

    public void butt() {
        System.out.println("Козленок начал бадаться с Незнайкой");
    }

}