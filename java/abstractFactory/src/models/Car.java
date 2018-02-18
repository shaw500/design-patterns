package models;

public class Car {
    private final Engine engine;
    private final Wheel[] wheels;
    private final Door[] doors;

    public Car(Engine engine, Wheel[] wheels, Door[] doors) {
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
    }
}
