package main.java.Class;
import main.java.AbstractClass.Character;
public class Dunno extends Character {
    protected int money;
    public Dunno(String name, boolean alive, int weight, int money) {
        super(name, alive, weight);
        this.money = money;
    }

    @Override
    public void walk(String location) {
        System.out.println("Незнайка отправился в "+ location);
        setWeight(getWeight() - 1, name);
    }


    @Override
    public void eat(String food1, String food2) {
        System.out.println("Незнайка съел " + food1 + ',' + food2);
        setWeight(getWeight() + 3, name);
    }

    public void talk(String animal) {
        System.out.println("Незнайка начал болтать с " + animal + ", но так как это зверь он ему не ответил");
    }

    public void smokingLog(){
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
