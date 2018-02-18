import factory.BMWCarPartsFactory;
import factory.CarFactory;
import factory.MercedesCarPartsFactory;
import models.Car;

public class Main {
    public static void main(String[] args) {
        Car bmw = new CarFactory(new BMWCarPartsFactory()).createCar();
        Car mercedes = new CarFactory(new MercedesCarPartsFactory()).createCar();
    }
}
