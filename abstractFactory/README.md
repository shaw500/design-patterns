# Abstract Factory

An abstract factory defines an interface to construct a variety of 
closely related objects. The example here (**CarPartFactory**)
provides an interface to construct a variety of car parts so that a
car can be constructed. The concrete factories
(**MercedesCarPartsFactory**, **BMWCarPartsFactory**) then 
specifically define how to construct parts for each type of car.

By providing a **CarPartFactory** (either for a Mercedes or BMW), the
**CarFactory** can construct a car without knowing about the specific 
concrete classes used for each car part. CarFactory can create an
engine, 2 doors, and 4 wheels, but the the implementation (whether
it is a BMW or a Mercedes) is abstracted away.

You can create each car as follows:
```
Car bmw = new CarFactory(new BMWCarPartsFactory()).createCar();
Car mercedes = new CarFactory(new MercedesCarPartsFactory()).createCar();
```
where both BMWCarPartsFactory and BMercedesCarPartsFactory both
implement CarPartsFactory.