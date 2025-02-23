package main.java.Class;

import main.java.AbstractClass.Place;

public class Cafeteria extends Place {

    public Cafeteria(String name, boolean freeFood, String hoursOfWork) {
        super(name, freeFood, hoursOfWork);
    }


    @Override
    public void location(String location) {
        if (location == "Moon" | location == "Earth") {
            System.out.println("Дело было на " + location);
        }else {
            System.out.println("Незнайка и компаньоны пришли в " + location);
        }

    }


}
