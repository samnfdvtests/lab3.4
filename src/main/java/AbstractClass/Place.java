package main.java.AbstractClass;

import main.java.Intarface.Location;

import java.util.Objects;

public abstract class Place implements Location {
    protected String name;
    protected boolean freeFood;
    protected String hoursOfWork;

    public Place(String name, boolean freeFood, String hoursOfWork) {
        this.name = name;
        this.freeFood = freeFood;
        this.hoursOfWork = hoursOfWork;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFreeFood() {
        return freeFood;
    }

    public void setFreeFood(boolean freeFood) {
        this.freeFood = freeFood;
    }

    public String getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(String hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    @Override
    public void location(String location) {
        if (location == "Moon" | location == "Earth") {
            System.out.println("Дело было на " + location);
        }else {
            System.out.println("Незнайка и компаньоны пришли в " + location);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        return Objects.equals(name, place.name) &&
                Objects.equals(hoursOfWork, place.hoursOfWork) &&
                freeFood == place.freeFood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hoursOfWork, freeFood);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name=" + name +
                ", hoursOfWork=" + hoursOfWork +
                "}";
    }
}
