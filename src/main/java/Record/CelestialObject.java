package main.java.Record;

import main.java.Intarface.Location;

import java.util.Objects;

public record CelestialObject(String name,
                              String type,
                              int radius,
                              boolean atmosphere,
                              String politicalRegime)
        implements Location {
//    @Override
//    public void location(CelestialObject planet,String place) {
//        if (Objects.equals(politicalRegime(), "communism") & Objects.equals(place, "restaurant")) {
//            throw new PlanetExept(place + " не может находиться на " + planet);
//        };
//        System.out.println("Дело было на " + name);
//    }
    @Override
    public void location(String loc){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CelestialObject celestialObject = (CelestialObject) o;
        return radius == celestialObject.radius &&
                atmosphere == celestialObject.atmosphere &&
                name.equals(celestialObject.name) &&
                Objects.equals(type, celestialObject.type) &&
                Objects.equals(politicalRegime, celestialObject.politicalRegime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, radius, atmosphere, politicalRegime);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name  +
                ", type=" + type +
                '}';
    }

}
