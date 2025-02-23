package main.java;

import main.java.Class.*;
import main.java.Record.CelestialObject;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        List<CelestialObject> celestialObjects = new ArrayList<>();

        // Добавляем объекты в список
        celestialObjects.add(new CelestialObject("Earth", "planet", 6378, true, "communism"));
        celestialObjects.add(new CelestialObject("Moon", "satellite", 1737, false, "capitalism"));
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        for (CelestialObject obj : celestialObjects) {
            obj.location(obj.name());
            System.out.println(obj.name());
        }
        BobrKurva bobr = new BobrKurva("Bobr",  true, 5);
        Dunno dunno = new Dunno("Dunno", true, 5, 1000);
        Goat goat = new Goat("Goat", true, 5);
        System.out.println(bobr);
        System.out.println(dunno);
        System.out.println(goat);
        logger.info("День: {}", bobr);
        logger.info("Погода: {}", dunno);

        List<Integer> priceList = new ArrayList<>(List.of(320, 200, 250));



    }
}