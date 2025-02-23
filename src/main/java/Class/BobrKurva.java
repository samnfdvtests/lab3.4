package main.java.Class;

import main.java.AbstractClass.Character;

public class BobrKurva extends Character {
    public BobrKurva(String name, boolean alive, int weight) {
        super(name, alive, weight);
    }

    @Override
    public void walk(String location) {
        System.out.println(name+" отправилcя в " + location);
        setWeight(getWeight() - 1, name);
    }


    @Override
    public void eat(String food1, String food2) {
        System.out.println("Незнайка съел " + food1 + ',' + food2);
        setWeight(getWeight() + 3, name);
    }

    public void build(String animal) {
        System.out.println("Бобер начал строить плотину из столов и стульев между собой и Незнайкой");
    }

    public void smokingLog() {
        System.out.println("Сидим с бобром за столом\n" +
                "Вдвоём, курим полено\n" +
                "Давай поговорим, бобёр,\n" +
                "О том, что наболело\n" +
                "Скажи, зачем же между нами плотина,\n" +
                "Скажи, зачем между нами обрыв?\n" +
                "Я обниму твоё пушистое тело\n" +
                "Ну почему бобры так добры?");
    }
}

