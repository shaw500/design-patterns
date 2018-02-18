package factory;

import models.Door;
import models.Engine;
import models.Wheel;

public interface CarPartsFactory {
    Engine createEngine(float cc);
    Wheel createWheel(float radius);
    Door createDoor();
}
