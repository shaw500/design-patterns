package factory;

import models.*;
import models.mercedes.MercedesDoor;
import models.mercedes.MercedesEngine;
import models.mercedes.MercedesWheel;

public class MercedesCarPartsFactory implements CarPartsFactory {

    @Override
    public Engine createEngine(float cc) {
        return new MercedesEngine(cc);
    }

    @Override
    public Wheel createWheel(float radius) {
        return new MercedesWheel(radius);
    }

    @Override
    public Door createDoor() {
        return new MercedesDoor();
    }
}
