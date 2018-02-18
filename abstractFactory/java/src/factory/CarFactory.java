package factory;

import models.Car;
import models.Door;
import models.Engine;
import models.Wheel;

public class CarFactory {
    private CarPartsFactory partsFactory;

    public CarFactory(CarPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    public Car createCar() {
        float cc = 3000.0f;
        float wheelRadius = 4.0f;

        Engine engine = partsFactory.createEngine(cc);

        Wheel[] wheels = new Wheel[4];
        wheels[0] = partsFactory.createWheel(wheelRadius);
        wheels[1] = partsFactory.createWheel(wheelRadius);
        wheels[2] = partsFactory.createWheel(wheelRadius);
        wheels[3] = partsFactory.createWheel(wheelRadius);

        Door[] doors = new Door[2];
        doors[0] = partsFactory.createDoor();
        doors[1] = partsFactory.createDoor();

        return new Car(
                engine,
                wheels,
                doors
        );
    }
}
