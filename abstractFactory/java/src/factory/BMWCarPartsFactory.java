package factory;

import models.*;
import models.bmw.BMWEngine;
import models.bmw.BMWWheel;
import models.bmw.BWMDoor;

public class BMWCarPartsFactory implements CarPartsFactory {

    @Override
    public Engine createEngine(float cc) {
        return new BMWEngine(cc);
    }

    @Override
    public Wheel createWheel(float radius) {
        return new BMWWheel(radius);
    }

    @Override
    public Door createDoor() {
        return new BWMDoor();
    }
}
